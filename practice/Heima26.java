package practice;

import java.util.Scanner;

public class Heima26 {
    /*
    案例：查找

      需求：已知一个数组arr={19,23,43,54,56,78};从键盘录入一个数据，查找该数据在数组中的索引，并在控制台输出找到的索引值
      思路：1.创建输入流，并给出提示语句
           2.创建变量接收从键盘输入的值
          3.创建查找方法：1.明确有返回值，并是int类型
                          2.将键盘输入值传给方法定义中的参数
                          3.定义一个索引值变量，初始化为-1（常用索引为-1表示查无此元素）
                          4.遍历数组，并将数组元素逐一与键盘输入值作比较，如果值相同，就把该值的索引赋值给索引变量，并结束循环
         4.调用查找方法
         5.定义变量用于接收调用方法的返回值
         6.输出结果
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请从键盘录入数据：");
        int a = sc.nextInt();
        int indexes = find(a);
        System.out.println("该数据在数组中对应的索引为" + indexes);

    }

    public static int find(int a) {
        int[] arr = {19, 23, 43, 54, 56, 78};
        int indexe = -1;
        for (int x = 0; x < arr.length; x++) {
            if (a == arr[x]) {
                indexe = x;
                break;
            }
        }
        return indexe;
    }
}
