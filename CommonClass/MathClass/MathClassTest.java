package CommonClass.MathClass;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;//导入了舍入模式包
import java.sql.SQLOutput;

public class MathClassTest {
    public static void main(String[] args) {
        System.out.println(Math.max(20, 30));//判断两个数的最大值
        System.out.println(Math.min(20, 30));//判断两个数的最小值
        System.out.println(Math.pow(2.1, 34.2));//返回第一个参数的幂
        System.out.println(Math.abs(-12));//返回参数指定值得绝对值
        System.out.println(Math.round(34.3));//返回参数四舍五入的结果
        System.out.println(Math.sqrt(1.4));//返回参数的平方根
        System.out.println(Math.random());//返回0.0-1.0的随机数
        System.out.println(Math.random() * 5);//返回0.0-5.0的随机数
        System.out.println(Math.random() * 5 - 1);//返回-1.0-4.0的随机数
        System.out.println("-----------------------------------------");

        /*
        BigDecimal的使用：
         */
        BigDecimal b = new BigDecimal("15.15");
//        BigDecimal b1 = new BigDecimal("3.3");
        BigDecimal b1 = new BigDecimal("3");
        System.out.println("b=" + b);
        System.out.println("b1=" + b1);
        //加法运算
        BigDecimal b2 = b.add(b1);
        System.out.println("b+b1=" + b2);
        //减法运算
        BigDecimal b3 = b.subtract(b1);
        System.out.println("b-b1=" + b3);
        //乘法运算
        BigDecimal b4 = b.multiply(b1);
        System.out.println("b*b1=" + b4);
        //除法运算
        BigDecimal b5 = b.divide(b1);
//        System.out.println("b/b1=" + b5);//ArithmeticException算法异常，因为是精确运算，而这里是无限循环小数，所以不可能做到精确运算，就会报算术异常错误
        System.out.println("b/b1=" + b5);
        System.out.println("-----------------------------------------");
        BigDecimal b6 = new BigDecimal("2");
        BigDecimal b7 = new BigDecimal("3");
        System.out.println("舍入模式下b6/b7=" + b6.divide(b7, RoundingMode.HALF_UP));//舍入模式RoundingMode.HALF_UP
        System.out.println("-----------------------------------------");
        //若需要表示比long类型范围还大的整数数据，则需要借助java.math.BigInteger类型描述
        BigInteger B = new BigInteger("77");
        System.out.println("B=" + B);
        BigInteger B1 = new BigInteger("8");
        System.out.println("B+B1=" + B.add(B1));//加法运算
        System.out.println("B-B1=" + B.subtract(B1));//减法运算
        System.out.println("B*B1=" + B.multiply(B1));//乘法运算
        System.out.println("B/B1=" + B.divide(B1));//除法运算
        System.out.println("B%B1=" + B.remainder(B1));//取余运算
        System.out.println("-----------------------------------------");
        BigInteger[] B3 = B.divideAndRemainder(B1);//实现取商和余数的运算
        //一次性得到商和余数
        for (int i = 0; i < B3.length; i++) {
            if (i == 0) System.out.println("商是" + B3[i]);
            else System.out.println("余数是" + B3[i]);
        }
    }
}
