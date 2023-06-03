package object;
//当两个对象的地址值相同时（即指向相同时），一个对象修改其堆内存的值(成员变量值)过后，另一个对象在访问的时候数据也是改变过的

public class Heima31 {
    public static void main(String[] args) {
        Student people1 = new Student();
        System.out.println(people1);//输出people1的地址值
        people1.name = "穆斯林";

        people1.age = 23;
        people1.height = 178;
        people1.weight = 126;
        System.out.println
                ("学生姓名为：" + people1.name + "\n\t" + "年龄为：" + people1.age + "\n\t" + "身高为：" + people1.height + "\n\t" + "体重是：" + people1.weight);
        System.out.print("早上8点开始");
        people1.study();
        System.out.print("下午7点开始");
        people1.sport();
        System.out.print("晚上8点开始");
        people1.doHomework();

        Student people2 = new Student();
        System.out.println(people2);//输出people2的地址值
        people2.name = "谭庸";
        people2.age = 24;
        people2.height = 170;
        people2.weight = 135;
        System.out.println
                ("学生姓名为：" + people2.name + "\n\t" + "年龄为：" + people2.age + "\n\t" + "身高为：" + people2.height + "\n\t" + "体重是：" + people2.weight);
        System.out.print("早上8点开始");
        people2.study();
        System.out.print("下午7点开始");
        people2.sport();
        System.out.print("晚上8点开始");
        people2.doHomework();

        people2 = people1;//把people1的地址值赋值给people2（改变了people2的指向，此时people2指向的栈内存和堆内存空间是原本people1的栈内存和堆内存空间）
        System.out.println(people2);//此时people2的栈内存空间地址已被改变，变成了people1的栈内存空间地址，所以现在people1和people2所指的栈内存地址是相同的
        System.out.println
                ("学生姓名为：" + people2.name + "\n\t" + "年龄为：" + people2.age + "\n\t" + "身高为：" + people2.height + "\n\t" + "体重是：" + people2.weight);
        //此时指向people2输出的结果则为原本people1堆内存中的内容，即people2指向了原本people1的堆内存中的内容
        people2.name = "王桢";//此时通过对象people2改变了原来堆内存中name为“穆斯林”的内容，改为了“王桢”
        System.out.println("学生姓名为：" + people2.name);//所以现在输出people2.name结果则不再是“穆斯林”而变成了“王桢”
        System.out.println("学生姓名为：" + people1.name);//而因为people1和people2此时在栈内存中的指向相同，people2又修改了栈内存所指的堆内存中的name值，所以现在对象people1所指的堆内存中的name的值也变为“王桢”
    }
}
