package DesignPatterns.StaticFactoryModel;

//凡是出现了大量的产品需要创建且具有共同的接口时，可以通过工厂方法模式来进行创建
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
