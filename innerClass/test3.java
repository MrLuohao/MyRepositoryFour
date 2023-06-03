package innerClass;

/*局部（方法）内部类的格式
        访问修饰符 class 外部类的类名{
    访问修饰符  返回值类型 成员方法 （形参列表）{
        class 内部类的类名{
            内部类的类体；
        }
    }
}*/
public class test3 {
    public test3() {
    }//外部类的构造方法

    public static void show() {
        System.out.println("这里是外部类的成员方法，以下执行是局部内部类的内容");
        /*static*/
        class test3Inner {//如果局部内部类加了static关键字修饰就代表着该类隶属于类层级，就不属于局部内部类了，所以不能使用static关键字修饰

            public test3Inner() {
            }//局部内部类的构造方法

            String name = "小华";
            int age = 23;

            public void show() {
                System.out.println("名字：" + name + "\n年龄：" + age);
            }
        }
        test3Inner t1 = new test3Inner();//方法里局部内部类外创建局部内部类对象
        t1.show();//方法里用创建的局部内部类对象调用局部内部类方法
    }

    public static void main(String[] args) {
        test3 t = new test3();
        test3.show();//外部内的show方法为static修饰，可以直接类名.调用
        t.show();//也可以对象名.调用
    }
}
