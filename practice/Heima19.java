package practice;

import java.util.Scanner;

/*
案例：减肥计划

     思路：
         1.创建输入流
         2.创建减肥计划的方法
         3.从键盘输入对应的星期数
         4.调用减肥计划方法
         5.用变量接收返回值
         6.在控制台打印出结果
 */
public class Heima19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        1.手动导包：  import java.util.Scanner;
        2.快捷键导包： Alt + Enter
        3.自动导包
         */
        System.out.println("请输入星期数：");
        int week = sc.nextInt();
        String activity = plan(week);
        System.out.println(activity);
    }

    public static String plan(int week) {
        String activity;
        if (week == 1) {
            activity = "今天的减肥活动是跑步";
        } else if (week == 2) {
            activity = "今天的减肥活动是游泳";
        } else if (week == 3) {
            activity = "今天的减肥活动是慢走";
        } else if (week == 4) {
            activity = "今天的减肥活动是动感单车";
        } else if (week == 5) {
            activity = "今天的减肥活动是拳击";
        } else if (week == 6) {
            activity = "今天的减肥活动是爬山";
        } else if (week == 7) {
            activity = "今天好好吃一顿";
        } else {
            activity = "你输入的星期数有误，请重新输入！";
        }
        return activity;
    }
}

