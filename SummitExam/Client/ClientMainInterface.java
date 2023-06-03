package SummitExam.Client;


import java.util.Scanner;

//主界面的编写
public class ClientMainInterface {

    public void MainInterface() {
        while (true) {
            System.out.println("\t\t 在线考试界面");
            System.out.println("------------------------------");
            System.out.println("\t\t【1】学员系统");
            System.out.println("\t\t【2】管理系统");
            System.out.println("\t\t【0】退出系统");
            int choose = ClientScanner.getScanner().nextInt();//获取扫描器
            switch (choose) {
                case 1:
                    System.out.println("正在进入学员系统");
                    break;
                case 2:
                    System.out.println("正在进入管理系统");
                    break;
                case 0:
                    System.out.println("正在退出系统");
                    System.out.println("退出成功");
                    return;
                default:
                    System.out.println("你的输入有误，请重新输入：");
            }
        }
    }
}