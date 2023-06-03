package ReflexMechanism;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.util.Scanner;
import java.util.concurrent.locks.ReadWriteLock;
/*
使用反射机制获取想得到的类中的构造方法等
 */
public class ReflexMechanism反射机制test1 {
    public static void main(String[] args) throws Exception {
        //无参方式创建对象的两种形式
        person person = new person();
        System.out.println(person);
        //1.获取想得到的类（person类）
        Class c = Class.forName("ReflexMechanism.person");
        //2.利用获取到的想要的类的Class实例调用newInstance()方法创建对象
        System.out.println("采用反射机制创建对象" + c.newInstance());
        System.out.println("------------");
        /*//动态创建对象
        System.out.println("请输入你想创建的对象类型：");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Class C1 = Class.forName(s);
        System.out.println(C1.newInstance());
        sc.close();*/
        //采用从文件中读取的形式来创建对象
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("d:/我爱学习Java/部分代码/a.txt")));
        String s = null;
        while (null != (s = bufferedReader.readLine())) {
            Class C1 = Class.forName(s);
            Constructor constructor = C1.getConstructor();//获取获取到的Class类型中的无参构造方法
            System.out.println(constructor.newInstance());
        }
        bufferedReader.close();
        System.out.println(Class.forName("ReflexMechanism.person").getConstructor().newInstance());
    /*
    先通过ClassforName方法获取到想创建对象的类型，然后再调用getConstructor方法获取到该类型中的无参构造方法，然后调用newInstance方法创建该类类型的对象
     */
        System.out.println("--------------------");
        //获取所有构造方法并打印其参数等信息的实现
        int i = 1;
        Constructor[] constructors = Class.forName("ReflexMechanism.person").getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println("这是第" + (i++) + "个方法：" + constructor);
            System.out.println("该方法的方法名称是：" + constructor.getName());
            System.out.println("该构造方法的访问修饰符为：" + constructor.getModifiers());
            Class[] parameterTypes = constructor.getParameterTypes();
            System.out.print("该方法的参数类型有：");
            for (Class C : parameterTypes) {
                System.out.print(C + "  ");
            }
            System.out.println("\n------------------");
        }
    }
}