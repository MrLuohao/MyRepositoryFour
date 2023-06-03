package practice;
/*
案例：字符串反转
   需求：定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
          例如：键盘录入abc输出结果cba
 */

import java.util.Scanner;

public class StringSplicing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        System.out.println(line.endsWith("b"));//字符串.endsWith(String suffix)：测试此字符串是否以指定的后缀结尾，返回boolean类型
        String s = reversal(line);
        System.out.println(s);
    }

    public static String reversal(String line) {
        String s = "";
        for (int i = line.length()-1; i >= 0; i--) {
            s += line.charAt(i);
        }
        return s;
    }
}