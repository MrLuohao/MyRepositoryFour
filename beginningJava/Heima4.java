package beginningJava;

public class Heima4 {
    /*
    单个数组
     */
    public static void main(String[] args) {
        //定义两个数组
        int[] arr = new int[3];
        int[] arr1 = new int[2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        //给数组arr1中的元素赋值
        arr1[0] = 200;
        arr1[1] = 300;
        //输出arr1和arr1中元素的值
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        arr[0] = 100;//将100赋值给数组中0索引的元素
        arr[1] = 200;//将200赋值给数组中1索引的元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        arr1 = arr;//多个数组指向相同
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        arr1[0] = 99;
        arr1[1] = 999;
        arr1[2] = 9999;
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
