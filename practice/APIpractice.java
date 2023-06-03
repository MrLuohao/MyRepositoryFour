package practice;

import java.util.Scanner;//Scanner类在util包下，所以需要导包

/*
API中查看Scanner的使用方法
通过对象调方法时快捷键ctrl+alt+v会自动帮我们生成左边部分
 */
public class APIpractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//创建输入流(sc是创建的对象，Scanner是所使用的类)
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();//sc是对象，nextline（）是Scanner类中的方法，返回值用变量line接受，因为返回值是String类型，所以用String类型的变量line接受
        System.out.println("你输入的内容为："+line);
    }
}
