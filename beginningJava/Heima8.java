package beginningJava;

public class Heima8 {
    /*
    实现功能：求数组中元素的最大值和最小值
     */
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {123, 453, 678, 346, 889, 999, 4567};
        //定义一个变量用于存放最大值：max
        int max = arr[0];
        //遍历数组
        for (int x = 1; x < arr.length; x++) {
            //与数组中元素作比较，每次比较将最大值赋值给变量max
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        //循环结束输出max
        System.out.println("max为:" + max);


        //求数组所有元素中的最小值
        int[] arr1 = {652, 45, 67, 89, 213, 3144, 899, 12, 34};
        int min = arr1[0];
        for (int x = 1; x < arr1.length; x++) {
            //与数组中元素作比较，每次比较将最小值赋值给变量min
            if (arr1[x] < min) {
                min = arr1[x];
            }
        }
        System.out.println("min为：" + min);
    }
}
