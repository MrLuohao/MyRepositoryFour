package Multithreading;

public class Production extends Thread {
    private FactoryDepot factoryDepot ;//合成服用原则

    public Production() {
    }

    public Production(FactoryDepot factoryDepot) {
        this.factoryDepot = factoryDepot;
    }

    @Override
    public void run() {
        while (true) {
            factoryDepot.Production();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
