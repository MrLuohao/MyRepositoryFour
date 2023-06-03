package beginningJava;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求：程序自动生成一个0-100之间的数字，使用程序实现猜出这个数字是多少
 * */
public class Heima2 {
    public static void main(String[] args) {
        //获取随机数
        Random r = new Random();
        int x = r.nextInt(101);
        //获取并接收用户猜想的数
        Scanner sc = new Scanner(System.in);
        while (true) {//对于不确定循环次数的循环采用while循环更合适，并将其设置为死循环让其可以一直循环，从而达到用户可以一直猜想直到猜对的功能
            System.out.println("请输入您猜想的数：");
            int c = sc.nextInt();//接收用户所猜想的值
            if (x < c) {
                System.out.println("您猜想的数大了");
            } else if (x > c) {
                System.out.println("您猜想的数小了");
            } else {
                System.out.println("恭喜您猜对了");
                break;//用户猜对过后应该使用break跳出循环，不然就会一直循环
            }
        }
    }
}
