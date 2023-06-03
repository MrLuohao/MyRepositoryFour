package Multithreading;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;
public class AccessSimulation implements Runnable {
    private ReentrantLock lock = new ReentrantLock();//准备了一把锁，使用该方式创建的锁时，Java虚拟机将花费较少的时间来调度线程，因此性能更好，更方便
    private int account;

    public AccessSimulation() {
    }

    public AccessSimulation(int account) {
        this.account = account;
    }

    public int getAccount() {
        return account;
    }


//    private TT TT = new TT();

    @Override
    public /*synchronized*/ void run() {//也可以直接使用该关键字来修饰run方法，意思是将整个方法锁起来，每次只能进来一个线程去运行这个方法即锁里面的内容，而且每次只能有一个线程运行到这里
        Scanner sc = new Scanner(System.in);
        System.out.println("线程：" + Thread.currentThread().getName() + "已启动");//运行结果证明，运行到这里的时候，两个线程是同时启动的，但是执行结果可以看出每次只有一个线程执行了同步锁里面的代码
//        synchronized (TT) {//上锁，有且只能有一个线程进入到该锁中，且在该线程为结束前其他线程不得进入该锁
//        synchronized (this) {//因为每次执行到这里的时候，this关键字就代表调用对象，所以这里可以直接加this关键字
        lock.lock();//加锁
        while (true) {
            System.out.println("请输入您想取走的金额：");
            int i = sc.nextInt();
            if (i > account) {
                System.out.println("余额不足，请核对您的余额");
                System.out.println("当前余额为：" + getAccount());
                if (account == 0) {
                    System.out.println("余额不足，自动退出");
                    System.exit(0);//退出虚拟机
                }
            } else {
                try {
                    System.out.println("请稍等，正在为您出钞........");
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                account = account - i;
                System.out.println("请取走您的钞票,当前余额为：" + account);
                System.out.println("继续取钱请输入1，任意数字退出");
                int i1 = sc.nextInt();
                if (account == 0) {
                    System.out.println("余额不足，自动退出！");
                    break;
                }
                if (1 != i1) break;
            }
        }
        lock.unlock();//解锁
    }
}
//}
//}

//class TT {//一个类中可以有多个类，但只有一个类可以使用public修饰，并且该关键字修饰的类必须与java文件名相同
//}