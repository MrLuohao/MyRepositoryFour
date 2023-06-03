package CommonClass.IntegerClass;

import java.sql.SQLOutput;

public class IntegerTest {
    public static void main(String[] args) {
        //打印Integer类中常用的常量数值
        System.out.println("最大值为：" + Integer.MAX_VALUE);
        System.out.println("最小值为：" + Integer.MIN_VALUE);
        System.out.println("所表示的二进制的位数是：" + Integer.SIZE);
        System.out.println("所占字节的个数是：" + Integer.BYTES);
        System.out.println("对应的int类型的Class实例是" + Integer.TYPE);
        System.out.println("-----------------------------------------------");
        //使用构造方法来构造Integer类型的对象并打印
        Integer it1 = new Integer(123);//打斜杠表示该方法已过时
        System.out.println("it1=" + it1);//自动调用toString方法，该类继承了Object，说明也继承了Object类中的toString方法，并且还重写了
        Integer it2 = new Integer(345);
        System.out.println("it2=" + it2);
        System.out.println("-----------------------------------------------");
        System.out.println("上述方法已过时，我们换一种方式（valueOf）创建。");
        //相当于从int类型转换到Integer类型
        Integer it3 = Integer.valueOf(234);
        System.out.println("it3=" + it3);
        //相当于从String类型转换为Integer类型
        Integer it4 = Integer.valueOf("567");
        System.out.println("it4=" + it4);//自动调用toString方法获取到的是String类型
        //获取调用对象中的整数数值，相当于从Integer类型转换为int类型
        int it5 = it4.intValue();
        System.out.println("获取到的整数it5=" + it5);//得到的是int类型
        System.out.println("-----------------------------------------------");
        Integer it6 = it5;//从int类型到Integer类型的转换，自动装箱，直接通过赋值运算符实现自动装箱
        System.out.println("自动装箱操作，it6=" + it6);
        int it7 = it6;//从Integer类型到int类型的转换，自动拆箱，直接通过赋值运算符实现自动拆箱
        System.out.println("自动拆箱操作，it7=" + it7);
        System.out.println("-----------------------------------------------");
        //装箱拆箱笔试考点
        Integer it8 = 128;
        Integer it9 = 128;
        Integer it10 = new Integer(128);
        Integer it11 = new Integer(128);
        System.out.println(it8 == it9);//比较地址，它们地址不同是因为it8和it9两对象的int数值已经超出自动装箱池中的-128-127这个范围，需要重写分配内存，所以二者地址不相同
        System.out.println(it8.equals(it9));//比较内容，true，it8和it9内容都是128，所以返回true
        System.out.println(it10 == it11);//比较地址，false,it10和it10是两个不同的Integer对象，每次new对象的时候都会向堆内存申请地址，所以它们的地址是不相同的
        System.out.println(it10.equals(it11));//比较内容，true，it10和it11内容都是128，所以返回true
        System.out.println("-----------------------------------------------");
        Integer it12 = 127;
        Integer it13 = 127;
        Integer it14 = new Integer(127);
        Integer it15 = new Integer(127);
        System.out.println(it12 == it13);//比较地址，true，因为-128-127的内容都已经装箱完毕，所以这里it12和it13使用的都是装箱池里的127，所以地址内容都是相同的
        System.out.println(it12.equals(it13));//比较内容，true
        System.out.println(it14 == it15);//比较地址，false，而构造方法创建的Integer对象，每一次new都会到堆内存申请内存，所以it14和it15两个对象的地址是不同的
        System.out.println(it14.equals(it15));//比较的是内容，所以返回true
        //通过JVM可以调整装箱池的大小
        System.out.println("-----------------------------------------------");
        //实现静态方法的使用
        int it16 = Integer.parseInt("899");//将字符串类型转换为int类型并返回
//        int it17 = Integer.parseInt("899");NumberFormatException编译OK，运行时报错，数字格式异常，因为有字母
        System.out.println("字符串转换成整数结果为：" + it16);
        System.out.println("根据参数指定的整数获取对应的十进制字符串是：" + Integer.toString(900));
        System.out.println("根据参数指定的整数获取对应的二进制字符串是：" + Integer.toBinaryString(900));
        System.out.println("根据参数指定的整数获取对应的十六进制字符串是：" + Integer.toHexString(900));
        System.out.println("根据参数指定的整数获取对应的八进制字符串是：" + Integer.toOctalString(900));
    }
}
