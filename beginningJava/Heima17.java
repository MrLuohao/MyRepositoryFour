package beginningJava;

public class Heima17 {
    /*
    设计一个方法用于获取数组中元素的最大值，调用方法并输出结果
     */
    public static void main(String[] args) {
        /*
        思路：
            1.定义一个数组，并用静态初始化给数组元素赋初始值
            2.定义获取数组元素最大值的方法
            3.调用获取最大值方法，并用变量接收返回结果
            4.把结果在控制台输出
         */
        int[] arr = {23, 32, 43, 54, 1, 23, 87};
        int number = getMax(arr);
        System.out.println("max=" + number);
    }

    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int x = 1; x < arr.length; x++) {
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        return max;
    }
}
