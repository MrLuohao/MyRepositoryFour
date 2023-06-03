package Interface.text2;

//测试类
public class InterfaceDemo {
    public static void main(String[] args) {
        inter i = new InterImpl();
        i.show();
        i.method();//编译看左边，执行看右边
        System.out.println(i.num);//接口中的成员变量只能是常量，默认修饰符public static final
        System.out.println(i.num1);
        System.out.println(i.num2);
        System.out.println(i.num3);
        System.out.println(inter.num);
    }
}
