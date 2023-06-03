package StringBuilderPractice;

import java.util.Scanner;

/*
案例：字符串反转
需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
     例如：键盘录入abc，结果输出cba
 */
public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从键盘录入一个字符串：");
        String line = sc.nextLine();
//        StringBuilder s = new StringBuilder();
//        s = reverse(line);
        System.out.println("反转后的结果为:" + reverse(line));
    }

    public static String reverse(String line) {
        /*StringBuilder sb = new StringBuilder(line);//将字符串String转换为StringBuilder类型并用对象sb接受
        sb.reverse();//反转sb
        String c = sb.toString();//再将StringBuilder类型转换为String类型并用对象c接受
        return c;*/
        //即使这些可以直接写成一句话
        return new StringBuilder(line).reverse().toString();
    }
}
