package beginningJava;

public class Heima5 {
    /*
    静态初始化：
        初始化时指定每个数组元素的初始值，由系统决定数组长度

        格式：数据类型 [] 变量名 = new 数据类型 [] {数据1，数据2，数据3......};
        范例：int [] arr = new int [] {1,2,3};

        简化格式：数据类型  [] 变量名 = {数据1，数据2，数据3.......}；
        范例：int [] arr ={1,2,3};
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        /*
        等同于:
        int[]arr=new int[2];
        arr[0]=1;
        arr[1]=2;
         */
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        //还可以：
        int[] arr1 = {1, 2, 3};//等号后面直接跟大括号赋值,元素之间用逗号隔开（简写：推荐使用）
        System.out.println(arr1);
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
    }
}
