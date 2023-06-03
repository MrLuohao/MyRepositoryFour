package packagePractice.text3;

public class Demo {
    public static void main(String[] args) {
        //final修饰基本类型变量
        final int age = 20;
        System.out.println(age);
//        age = 30;报错，final修饰变量表示常量，表示值不能被修改
        //final修饰引用类型变量
        //地址值不能发生改变，地址里面的值可以发生改变
        Student s = new Student();
        s.name = "小华";
        s.age = 21;
        s.show();
        System.out.println(s);
        s.name = "小王";
        s.age = 22;
        s.show();
        System.out.println(s);
    }
}
