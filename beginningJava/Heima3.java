package beginningJava;

/*
 * 数组的定义：
 *        定义格式：（推荐方式）
 *                     数据类型[]数组名;
 *                      例如：int[]arr;
 *        数组初始化：
 *             A：所谓初始化：就是为数组中的数组元素分配内存空间，并为每个数组元素赋值
 *             B：数组初始化
 *                   动态初始化
 *                   静态初始化
 *        动态初始化：
 *            初始化时只指定数组长度，由系统为数组分配初始值
 *            格式：数据类型[] 变量名 = new 数据类型[数组长度];
 *            例如：int[] arr = new int[3];
 * */
public class Heima3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        /*      左边
                   int:说明数组中元素的数据类型为int类型
                   []:声明这是一个数组
                   arr:创建的数组名称为arr
                右边
                   new:为数组申请内存空间
                   int:说明数组中元素的数据类型为int类型
                   []:声明这是一个数组
                   3:数组的长度为3，即该数组里的元素一共有3个（数组中元素的个数）
         *
        * */
//        索引是数组中数据的编号方式
//                作用：索引用于访问数组中数据使用，数组名[索引]等同于变量名，是一种特殊的变量名
//                特征1：索引从0开始
//                特征2：索引是连续的
//                特征3：索引逐一增加，每次加1
        System.out.println(arr);//输出数组名
        //输出数组元素
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
