package Multithreading;

public class OddNumber extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println("1-100的奇数有：" + i);
        }
    }
}