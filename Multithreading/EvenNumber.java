package Multithreading;

public class EvenNumber extends Thread {
    @Override
    public void run() {
        notify();
        for (int i = 0; i <= 100; i += 2) {
            System.out.println("1-100的偶数有：" + i);
        }
    }
}
