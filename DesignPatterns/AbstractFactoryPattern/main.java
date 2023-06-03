package DesignPatterns.AbstractFactoryPattern;

public class main {
    public static void main(String[] args) {
        Provider provider = new MailSendFactory();
        Sender sender = provider.produce();
        sender.send();
        Provider provider1 = new SmsSendFactory();
        Sender sender1 = provider1.produce();
        sender1.send();
    }
}
