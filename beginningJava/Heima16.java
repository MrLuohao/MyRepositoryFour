package beginningJava;

public class Heima16 {
    /*
    案例：数组的遍历

         需求：设计一个方法用于数组遍历，要求遍历结果在一行上。例如：{11，22，33，44，55}
     */
    public static void main(String[] args) {
        /*
        思路：
            1.定义一个数组，用静态初始化完成数组元素初始化
            2.定义一个方法，用数组遍历通用格式对数组进行遍历
            3.用输出语句修改遍历操作
            4.调用遍历方法输出结果

         print:不换行
         println:换行
         */
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("{");
        int x = 0;
        for (x = 0; x < arr.length; x++) {
            if (x < arr.length - 1) {
                System.out.print(arr[x] + ",");
            } else {
                System.out.print(arr[x]);
            }
        }
        System.out.print("}");
    }
}
