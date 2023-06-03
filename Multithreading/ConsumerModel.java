package Multithreading;

public class ConsumerModel {
    public static void main(String[] args) {
        FactoryDepot factoryDepot = new FactoryDepot();
        Production production = new Production(factoryDepot);
        Consume consume = new Consume(factoryDepot);
        production.start();
        consume.start();
    }
}
