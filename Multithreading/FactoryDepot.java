package Multithreading;

public class FactoryDepot {
    private int count = 1;

    public synchronized void Production() {
        notify();
        if (count < 10) {
            System.out.println("线程" + Thread.currentThread().getName() + "正在生产第：" + (count + 1) + "个产品......");
            count++;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void Consume() {
        notify();
        if (count > 0) {
            System.out.println("线程" + Thread.currentThread().getName() + "正在消费第：" + (count + 1) + "个产品");
            count--;
        } else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
