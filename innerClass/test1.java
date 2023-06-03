package innerClass;

/*
普通（成员）内部类的格式：
    访问修饰符 class 外部类的类名{
      访问修饰符 class 内部类的类名{
        内部类的类体；
      }
    }
普通内部类和正常类一样可以使用final或者abstract，private，protected关键字，可以定义成员变量成员方法构造方法等。
 */
public class test1 {//外部类
    private String name = "小鹏";
    private int age = 20;

    public test1() {
        System.out.println("外部类的无参构造方法");
    }

    test1Inner s = new test1Inner();

    public void show() {
        int age = 30;
        System.out.println("外部类的成员方法执行到了");
        System.out.println("name:" + name);
        System.out.println("外部类的age为：" + this.age);
        System.out.println("局部范围里的age为：" + age);
        System.out.println("内部类里的age为:" + s.age);
    }

    public class test1Inner {//内部类
        int age = 12;//内部类可以拥有成员变量


        public test1Inner() {//内部类可以拥有构造方法
            System.out.println("内部类的无参构造方法体！");
        }

        public void show1() {//内部类可以拥有成员方法
            int age = 50;
            System.out.println("内部类的成员方法执行到了");
            System.out.println("name:" + name);
            System.out.println("内部类里的age为:" + this.age);
            System.out.println("局部范围里的age为: " + age);
//            如果内部类需要使用外部类中与本类内部同名的成员变量或成员方法时需要用到this关键字
            System.out.println("外部类的age为：" + test1.this.age);
        }
    }

    public static void main(String[] args) {
        test1 t = new test1();
        t.show();
        test1.test1Inner t1 = t.new test1Inner();//普通内部类需要使用外部类对象来创建对象
        t1.show1();
    }
}
