package DesignPatterns.GeneralFactoryModel;
//2.创建邮件类并实现发消息这个接口，重写里面的send方法为发送邮件
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("正在发送邮件...");
    }
}
