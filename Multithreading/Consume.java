package Multithreading;

public class Consume extends Thread {
    private FactoryDepot factoryDepot;//合成服用原则

    public Consume() {
    }

    public Consume(FactoryDepot factoryDepot) {
        this.factoryDepot = factoryDepot;
    }

    @Override
    public void run() {
        while (true) {
            factoryDepot.Consume();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
