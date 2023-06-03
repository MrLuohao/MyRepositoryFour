package packagePractice.text4;

public class Student {
    public String name;
    public int age;
    public static String university;

    public void show() {
        //非静态成员方法可以访问静态和非静态成员变量，也可以访问静态和非静态成员方法
        show3();//静态成员方法
        show4();//非静态成员方法
        System.out.println("姓名：" + name + "，年龄：" + age + "，大学：" + university);//静态和非静态成员变量
    }

    public static void show3() {
        System.out.println("大学：" + university);//静态成员方法只能访问静态成员变量
    }

    public static void show1() {
//        System.out.println("姓名："+name);报错，因为此处是静态成员方法，而成员变量是非静态成员变量
//        System.out.println("年龄：" + age);报错，因为此处是静态成员方法，而成员变量是非静态成员变量
//        show();报错，因为show1是静态成员方法，而show是非静态成员方法，静态成员方法不能访问非静态成员方法
        show3();//不报错，因为show1是静态成员方法，而show3也是静态成员方法，静态成员方法可以调用静态成员方法
        System.out.println("大学：" + university);//可以使用，因为此处是静态成员方法，成员变量也是静态成员变量
    }

    public void show4() {
        System.out.println("姓名：" + name + "，年龄：" + age + "，大学：" + university);
    }

}
