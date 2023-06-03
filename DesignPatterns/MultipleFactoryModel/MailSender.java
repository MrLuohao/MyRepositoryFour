package DesignPatterns.MultipleFactoryModel;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("正在发送邮件...");
    }
}
