package practice;
/*
案例：遍历字符串

    需求：键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 */

import java.util.Scanner;

public class TraversalString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();
//        System.out.println("str的长度为："+str.length());
        for (int i=0;i<str.length();i++){//同数组长度统计一样，字符串长度统计也是通过：字符串对象.length（）;得出
            System.out.println(str.charAt(i));//字符串对象.charAt(int index);返回字符串对象对应索引处的值
        }
    }
}
/*
遍历字符串的通用格式：
for(int i = 0;i<字符串对象.length（）；i++){
    字符串对象.charAt（int index）；就是指索引处的字符值
}
 */
