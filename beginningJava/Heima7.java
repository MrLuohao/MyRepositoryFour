package beginningJava;

public class Heima7 {
    /*
    数组的遍历：
     获取数组中的每一个元素输出在控制台

    获取数组元素：
    数组名.length

       数组遍历通用格式：

        int[]arr={.....};
           for(int x=0;x<arr.length;x++){
             arr[x];
       }
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int x = 0; x < arr.length; x++) {
            System.out.println(arr[x]);
        }
    }
}