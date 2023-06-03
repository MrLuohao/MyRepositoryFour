package inherit.text3;

/*
测试类
 */
public class Dome {
    public static void main(String[] args) {
        Zi Z = new Zi();
        Z.method();
//        Z.show();private关键字修饰过后将只能在本类中被调用，即便是继承关系也不行
    }
}
