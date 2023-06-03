package DesignPatterns.GeneralFactoryModel;
//3.创建短信类并实现发消息接口，重写send方法为发送短信
public class SmsSender implements Sender{
    @Override
    public void send(){
        System.out.println("正在发送短信...");
    }
}
