package inherit.text1;

public class Demo {
    public static void main(String[] args) {
        //创建对象，调用方法
        Fu F1 = new Fu();
        System.out.println(F1.age);
        F1.show();
        System.out.println("-------------");
        Zi Z1 = new Zi();
        System.out.println(Z1.age);
        Z1.show();
        Z1.method();
        System.out.println("-------------");
        Fu F2 = new Zi();//创建的是父类对象
//        ((Zi) F2).method();
        F2.show();
        ((Zi) F2).method();//这里父类对象调用子类方法系统会自动强转，将父类强转为子类，否则将报错
        Fu F3 = new Fu(21);
        Zi Z2 = new Zi(22);
    }
}
