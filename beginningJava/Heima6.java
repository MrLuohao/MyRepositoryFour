package beginningJava;

public class Heima6 {
    /*
    数组操作中常见的小问题

    索引越界：访问了数组中不存在的索引对应的元素，造成索引越界问题
                  ArrayIndexOutOfBoundsException
    空指针异常：访问的数组已经不再指向堆内存的数据，造成空指针异常
                  NullPointerException
     */
    public static void main(String[] args) {
        int[] arr = new int[2];
        System.out.println(arr[3]);
        //报错：ArrayIndexOutOfBoundsException
        arr = null;
        //此时数组已经不再指向堆内存里的数据
        System.out.println(arr[0]);
        //报错NullPointerException
    }
}
