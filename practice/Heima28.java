package practice;

import java.util.Scanner;

public class Heima28 {
    /*
    案例：评委打分
    需求：在编程竞赛中，有6个评委为参赛选手打分，分数为0-100的整数分。
         选手的最后得分为：去掉一个最高分和一个最低分后的4个评委平均值（不考虑小数部分）。

       思路：1.创建输入流和长度为6的数组，接收键盘输入值对数组元素进行赋值
            2.创建求取数组最大值最小值以及数组元素总和的方法，调用并创建变量用于接收各方法的返回值
            3.根据要求求出选手最终获得分数并输出
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int x = 0; x < arr.length; x++) {
            System.out.println("请输入第" + (x + 1) + "个评委所打的分数：");
            arr[x] = sc.nextInt();
        }
        int sum = getSum(arr);
        int max = getMax(arr);
        int min = getMin(arr);
        int avg = (sum - max - min) / 4;
        System.out.println("选手的最终得分为：" + avg);
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            sum = sum + arr[x];
        }
        return sum;
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] < min) {
                min = arr[x];
            }
        }
        return min;
    }
}
