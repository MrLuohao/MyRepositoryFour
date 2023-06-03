package Multithreading;

/*
案例：编程创建两个线程，线程一负责打印1-100的奇数，线程二负责打印1-100的偶数，在main方法启动两个线程同时执行，让主线程等待
 */
public class Test2 {
    public static void main(String[] args) {
        OddNumber o = new OddNumber();
        EvenNumber e = new EvenNumber();
        e.start();
        o.start();
        System.out.println("主线程开始等待......");
        try {
            e.join();
            o.join();
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        System.out.println("主线程等待完毕");
    }
}
