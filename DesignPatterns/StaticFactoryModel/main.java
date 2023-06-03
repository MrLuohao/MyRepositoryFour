package DesignPatterns.StaticFactoryModel;

public class main {
    public static void main(String[] args) {
        Sender sender = SendFactory.produceMail();
        sender.send();
        Sender sender1 = SendFactory.produceSms();
        sender1.send();
    }
}
