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
public class Heima20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        String week = sc.nextLine();
        String activity = plan(week);
        System.out.println(activity);
    }

    public static String plan(String week) {
        String activity;
        String Monday = "星期一";
        String Tuesday = "星期二";
        String Wednesday = "星期三";
        String Thursday = "星期四";
        String Friday = "星期五";
        String Saturday = "星期六";
        String Sunday = "星期日";
        /*
        判断两个String类型的变量内容是否相同可以用equals方法：
                                                    格式：a.equals(String b);
                                                    a.b分别为两个String类型的变量名
         */
        if (week.equals(Monday)) {
            activity = "今天的减肥活动是跑步";
        } else if (week.equals(Tuesday)) {
            activity = "今天的减肥活动是游泳";
        } else if (week.equals(Wednesday)) {
            activity = "今天的减肥活动是慢走";
        } else if (week.equals(Thursday)) {
            activity = "今天的减肥活动是动感单车";
        } else if (week.equals(Friday)) {
            activity = "今天的减肥活动是拳击";
        } else if (week.equals(Saturday)) {
            activity = "今天的减肥活动是爬山";
        } else if (week.equals(Sunday)) {
            activity = "今天好好吃一顿";
        } else {
            activity = "你输入的星期数有误，请重新输入！";
        }
        return activity;
    }
}
