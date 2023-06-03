package beginningJava;

import java.util.Scanner;

/*
Debug使用：如果数据来自键盘输入，要输入数据才可以继续向下查看
 */
public class Heima18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数：");
        int c = sc.nextInt();
        int number = getMax(a, b, c);
        System.out.println("最大值为：" + number);
    }

    public static int getMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }
}
