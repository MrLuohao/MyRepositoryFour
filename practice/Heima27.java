package practice;

public class Heima27 {
    /*
        案例：反转
        需求：已知一个数组arr = {19,23,43,54,65};用程序实现把数组中的元素值交换
             交换后的数组arr = {65,54,43,23,19};并在控制台输出交换后的数组元素
     */
    public static void main(String[] args) {
        int[] arr = {19, 23, 43, 54, 65};
        exChange(arr);
        printArray(arr);
    }

    public static void exChange(int[] arr) {
        for (int end = arr.length - 1, start = 0; start <= end; end--, start++) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("交换后的数组为：arr=[");
        for (int x = 0; x < arr.length; x++) {
            if (x < arr.length - 1) {
                System.out.print(arr[x] + ",");
            } else {
                System.out.print(arr[x]);
            }
        }
        System.out.print("]");
    }
}
