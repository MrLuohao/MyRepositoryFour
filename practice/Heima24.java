package practice;

public class Heima24 {
    /*
    案例：数组元素求和

       需求：有这样一组数组，元素是{68，27，95，88，171，996，51，210}。求出该数组中满足要求的元素和
             要求是：求和的元素个位和十位都不能是7，并且只能是偶数

       思路：1定义一个数组，用静态初始化完成数组元素的初始化
             2.定义一个求和变量，初始值设置为0
             3.遍历数组元素
             4.累加满足要求的数组元素
             5.输出求和结果

     */
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int sum = sum(arr);
        System.out.println("满足要求的数组元素的和为：" + sum);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] % 10 != 7 && arr[x] / 10 % 10 != 7 && arr[x] % 2 == 0) {
                sum += arr[x];
            }
        }
        return sum;
    }
}
