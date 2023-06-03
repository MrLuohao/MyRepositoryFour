package practice;

public class Heima25 {
    /*
    案例：数组内容相同
      需求：设计一个方法，用于判断两个数组内容是否相同
     */
    public static void main(String[] args) {
        //定义两个数组并完成对元素的初始化
        int[] arr1 = {12, 23, 32, 123, 56, 45};
        int[] arr2 = {12, 23, 32, 123, 56, 45};
        //调用比较方法并用变量接收
        boolean flag = compare(arr1, arr2);
        //打印输出返回值
        System.out.println(flag);
    }

    //创建用于比较两个数组内容是否相同的方法
    public static boolean compare(int[] arr1, int[] arr2) {
        //设置条件，若两数组长度不同，则直接返回false
        if (arr1.length != arr2.length) {
            return false;
        }
        //遍历两个数组中的元素并进行比较
        for (int x = 0; x < arr1.length; x++) {
            //若两个数组中的同一个索引下的元素内容不同，则直接返回false
            if (arr1[x] != arr2[x]) {
                return false;
            }
        }
        //全部相同则返回true
        return true;
    }
}
