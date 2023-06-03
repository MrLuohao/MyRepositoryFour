package practice;
/*
使用递归时的注意事项：
    1.必须有递归的规律及条件
    2.必须使得问题简单而不是复杂化
    3.若递归影响到程序的性能，必须使用递推取代之
 */

import java.util.Scanner;

public class DiTui {
    public int show(int a) {
         /*
       程序实现递推
       */
//        int num = 1;
//        for (int i = 1; i <= a; i++) {
//            num = num * i;
//        }
//        return num;

        /*
        程序实现递归
         */
        /*if (a == 1) {
            return 1;
        } else {
            return a * show(a - 1);
        }*/
        //还可以写作,更加简化
        if (a == 1) return 1;
        return a * show(a - 1);//这里的show（a-1）相当于是再次调用show方法，并把a-1作为参数传递了过去，相当于把阶乘分别展开
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想算多少的阶乘：");
        int a = sc.nextInt();
        DiTui D = new DiTui();
        int num = D.show(a);
        System.out.println("该数的阶乘为：" + num);
    }
}
