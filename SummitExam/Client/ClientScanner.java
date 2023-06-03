package SummitExam.Client;
//提供私有的扫描器对象并提供公有的get方法将扫描器对象返回给使用者，提高代码的复用性

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class ClientScanner {
    //创建Scanner对象并私有化成员变量
    private static Scanner sc = new Scanner(System.in);

    //提供公有的get方法将Scanner对象sc返回出去
    public static Scanner getScanner() {
        return sc;
    }

    //提供共有的关闭扫描器的方法
    public static void closeScanner() {
        sc.close();
    }
}
