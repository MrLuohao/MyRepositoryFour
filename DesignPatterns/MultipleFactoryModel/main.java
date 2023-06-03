package DesignPatterns.MultipleFactoryModel;

public class main {
    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produceMail();
        sender.send();
        Sender sender1 = sendFactory.produceSms();
        sender1.send();
    }
}
