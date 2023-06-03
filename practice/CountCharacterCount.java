package practice;

import java.util.Scanner;

/*
案例：统计字符次数
需求：键盘录入一个字符串，统计该字符串中大小写字符以及数字字符出现的次数（）不考虑其他字符
 */
public class CountCharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') {
                a++;
            }
            if (line.charAt(i) >= 'a' && line.charAt(i) <= 'z') {
                b++;
            } else if (line.charAt(i) >= '0' && line.charAt(i) <= '9') {
                c++;
            }
        }
        System.out.println("大写字母：" + a + "个\n小写字母：" + b + "个\n\t数字：" + c + "个");
    }
}
