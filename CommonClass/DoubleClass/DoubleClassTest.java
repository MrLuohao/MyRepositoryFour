package CommonClass.DoubleClass;

import java.sql.SQLOutput;

public class DoubleClassTest {
    public static void main(String[] args) {
        Double d = new Double(12.3);//通过构造方法的方式来创建double类型的数据，已过时(直接传的是小数数据)
        Double d1 = new Double("12.3");//通过构造方法的方式来创建double类型的数据，已过时（传的是字符串数据，自动转为double类型数据）
        System.out.println("d=" + d);
        System.out.println("d1=" + d1);
        System.out.println("---------------------------------------");
        double d2 = d.doubleValue();//用于返回double类型对象的数据
        System.out.println("d2=" + d2);
        System.out.println(Double.max(32, 34));//用于判断两个double类型数据的最大值
        System.out.println(Double.SIZE);/*表示double类型的二进制位数*/
        System.out.println(Double.BYTES);//表示double类型的字节个数
        System.out.println(Double.TYPE);//表示double类型的class实例
        System.out.println("---------------------------------------");
        Double d3 = Double.valueOf(123.9);//根据参数指定的浮点数据得到double类型的对象
        Boolean b = d.equals(d1);//比较调用对象与指定参数是否相等
        System.out.println("b=" + b);//true
        String s = d1.toString();//返回描述调用对象数值的字符串形式
        System.out.println("s=" + s);
        double d4 = Double.parseDouble(s);//将字符串类型转换为double类型
        System.out.println("d4=" + d4);
        boolean b1 = d.isNaN();//判断调用对象的数据是否为非数字
        System.out.println("b1=" + b1);
        Double d5 = Double.valueOf(0 / 0.0);
        System.out.println(d5.isNaN());

    }
}
