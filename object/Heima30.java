package object;

public class Heima30 {
    /*
   对象的使用

     创建对象：
      格式：类名 对象名 = new 类名();
      范例：phone p = new phone();
    使用对象：
      1.使用成员变量：
                  格式：对象名.变量名;
                  范例：p.brand;
     2.使用成员方法：
                  格式：对象名.方法名();
                  范例：p.call();

    */
    public static void main(String[] args) {
//        创建对象
        phone p = new phone();
//        使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        p.brand = "华为 mate50pro";
        p.price = 6999;
        System.out.println("手机品牌是：" + p.brand);
        System.out.println("手机价格为：" + p.price);
//        使用成员方法
        p.call();
        p.sendMessage();
    }
}
