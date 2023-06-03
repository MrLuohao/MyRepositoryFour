package DesignPatterns.GeneralFactoryModel;

/*
优点：扩展性和可维护性更强，尤其是在创建大量对象的前提下
 */
//4.创建工厂类
public class SendFactory {
    //5.创建生产对象的方法produce，设置返回值为发消息的引用，提供一个String类型的参数作为创建对象类型的判断
    public Sender produce(String type) {
        //6.如果参数为邮件就创建发送邮件的对象并返回
        if ("mail".equals(type)) {
            return new MailSender();
        }
        //7.如果参数为短信就创建发送短信的对象并返回
        if ("sms".equals(type)) {
            return new SmsSender();
        }
        //8.如果参数为其他，则返回空
        return null;
    }
}
