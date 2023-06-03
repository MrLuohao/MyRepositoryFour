package innerClass;

/*
静态内部类的格式
    访问修饰符 class 外部类的类名{
      访问修饰符 class 内部类的类名{
        内部类的类体；
      }
    }
 */
public class test2 {
    private static String name = "小东";
    int age = 20;

    public test2() {
        System.out.println("外部类的构造方法");
    }

    public static void show() {
        test2.test2Inner t = new test2.test2Inner();
        System.out.println("静态内部类里的成员变量name为：" + t.name);
        t.show();
        System.out.println("外部类的成员方法");
    }

    public static class test2Inner {
        private String name = "小华";
        int age = 23;

        public test2Inner() {
            System.out.println("静态内部类的构造方法");
        }

        public void show() {
            String name = "小王";
            System.out.println("静态内部类里的局部成员变量name为：" + name);
            System.out.println("静态内部类里的成员变量name为：" + this.name);
            System.out.println("静态外部类里的成员变量name为：" + test2.name);
            System.out.println("静态内部类的成员方法");
        }
    }

    public static void main(String[] args) {
        test2.show();
        test2.test2Inner t = new test2.test2Inner();
        t.show();
    }
}
