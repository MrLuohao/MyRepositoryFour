package Multithreading;
/*
lock只有同步代码块方式的锁，而synchronized有同步代码块方式和同步方法两种锁
lock是显示锁，需要手动实现开启和关闭操作，而synchronized是隐式锁，执行锁定代码后自动释放
使用lock锁方式时，Java虚拟机将花费较少的时间来调度线程，因此性能更好
 */
public class Test4 {
    public static void main(String[] args) {
        AccessSimulation A = new AccessSimulation(1000);
        Thread T = new Thread(A);
        Thread T1 = new Thread(A);
        System.out.println("主线程开始等待........");
        try {
            T.start();
            T1.start();
            T.join();
            T1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("主线程等待完毕");
    }
}
