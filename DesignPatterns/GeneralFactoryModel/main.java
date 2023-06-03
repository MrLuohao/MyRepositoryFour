package DesignPatterns.GeneralFactoryModel;

public class main {
    public static void main(String[] args) {
        //创建工厂类对象
        SendFactory sendFactory = new SendFactory();
        //使用工厂类对象调用produce方法创建发送邮件的对象并返回
        Sender mail = sendFactory.produce("mail");//接口类引用指向实现类对象，形成多态
        mail.send();//编译看左，执行看右（执行的是实现类里面的send方法即MailSender里的send方法）
        Sender sms = sendFactory.produce("sms");//接口类引用指向实现类对象，形成多态
        sms.send();//编译看左，执行看右（执行的是实现类里面的send方法即SmsSender里的send方法）
    }
}
