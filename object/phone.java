package object;

public class phone {
    //成员变量：手机的品牌和价格是手机的属性即通过成员变量brand和price来体现
    String brand;
    int price;

    //成员方法：手机的行为打电话和发短信用成员方法即call方法和sendMessage方法来体现
    public void call() {
        System.out.println("给***打一个电话。");
    }

    public void sendMessage() {
        System.out.println("给***发送一条短信。");
    }
}
