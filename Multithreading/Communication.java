package Multithreading;

/*
Object类常用的方法（用于线程与线程之间的通信的方法）
 */
public class Communication implements Runnable {
    private int i = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (i <= 100) {
                    System.out.println(Thread.currentThread().getName() + "正在打印" + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    i++;
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else break;
            }
        }
    }

    public static void main(String[] args) {
        Communication C = new Communication();
        Thread T = new Thread(C);
        Thread T1 = new Thread(C);
        T.start();
        T1.start();
    }
}
