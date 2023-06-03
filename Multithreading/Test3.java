package Multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
每隔一秒获取一次系统时间，模拟时钟的效果
 */
public class Test3 extends Thread {
    boolean b = true;

    @Override
    public void run() {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(date);
        while (b) {
            try {
                date = new Date();
                format = simpleDateFormat.format(date);
                System.out.println(format);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setb(boolean b) {
        this.b = b;
    }

    public static void main(String[] args) {
        Test3 T = new Test3();
//        T.setDaemon(true);//设置该线程为守护线程(设置为守护线程过后主线程结束该线程也随之结束，若设置为非守护线程，则主线程结束时该线程依然会继续执行)
        T.start();
        System.out.println("子线程的优先级是：" + T.getPriority());
        System.out.println("主线程的优先级是：" + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(1);//优先级在前不代表着一定先执行，但是系统会优先分配资源，意味着先执行的机会更多
        System.out.println("设置优先级过后主线程的优先级是：" + Thread.currentThread().getPriority());
        System.out.println(T.isDaemon() ? "是守护线程" : "不是守护线程");//判断该线程是否为守护线程（该线程不是守护线程/）
//        T.setDaemon(true);//设置该线程为守护线程（不能在线程正在执行的时候设置其是否为守护线程，否则将报错）
//        System.out.println(T.isDaemon() ? "该线程设置过后是守护线程" : "该线程设置过后依然不是守护线程");
        try {
            System.out.println("主线程开始等待......");
//            T.join();//没设置时间就会一直等待,等待调用线程运行结束才会解除等待
            T.join(5000);//设置等待正在执行的线程5秒
//            Thread.sleep(5000);
//            T1.stop();过时，不建议使用
            System.out.println("主线程结束等待");
            T.setb(false);//采用开关的思想来结束进程
            /*for (int i=0;i<20;i++){
                System.out.println(i);
            }*/
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}



