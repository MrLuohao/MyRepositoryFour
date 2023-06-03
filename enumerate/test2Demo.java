package enumerate;

public class test2Demo {
    public static void main(String[] args) {
        test2 T1 = test2.UP;
        test2 T2 = test2.DOWN;
        test2 T3 = test2.LEFT;
        test2 T4 = test2.RIGHT;
        System.out.println("获取到的方向是：" + T1.getDirection());
        System.out.println("获取到的方向是：" + T2.getDirection());
        System.out.println("获取到的方向是：" + T3.getDirection());
        System.out.println("获取到的方向是：" + T4.getDirection());
        System.out.println(test2.DOWN.getDirection());
        test2.show(test2.UP.getDirection());
        test2.show(test2.DOWN.getDirection());
        test2.show(test2.LEFT.getDirection());
        test2.show(test2.RIGHT.getDirection());
        test2.show("向前");
        System.out.println("-----------------");
        /*static T [] values ()   返回当前枚举类中的所有对象
        String toString ()    返回当前枚举类对象的名称
        int ordinal ()       获取枚举对象在枚举类中的索引位置
        static T valueOf ( String str )将参数指定的字符串名转为当前枚举类的对象
        int compareTo ( E o ) 比较两个枚举对象在定义时的顺序*/
        test2[] arr = test2.values();//1.获取枚举类中所有枚举对象并创建对应的枚举类型数组进行存储
        for (int i = 0; i < arr.length; i++) {//遍历数组并打印每个元素的名称以及每个元素对应的索引
            System.out.println("获取到的枚举对象名称是：" + arr[i].toString());
            System.out.println("获取到的该枚举对象在枚举类中的索引位置是：" + arr[i].ordinal());
        }
//        test2 T5 = test2.valueOf("向前");IllegalArgumentException: No enum constant enumerate.test2.向前(编译OK，但是运行的时候可以会报非法参数异常的错误)
        test2 T5 = test2.valueOf("DOWN");//要求字符串名称必须在枚举类的对象中存在
        System.out.println("转换出的来的枚举对象名称是：" + T5.toString());
        System.out.println("-----------------");
        for (int i = 0; i < arr.length; i++) {
            int a = T2.compareTo(arr[i]);//其实就是调用的对象的索引减去参数对象的索引，在前为负，在后为正，相同为0
            if (a < 0) {
                System.out.println(T2.toString() + "在" + arr[i] + "的前面，前面" + a * -1 + "个位置");
            } else if (a == 0) {
                System.out.println(T2.toString() + "和" + arr[i] + "位置相同");
            } else {
                System.out.println(T2.toString() + "在" + arr[i] + "后面，后面" + a + "个位置");
            }
        }
        System.out.println("-----------------");
        //让枚举类中每个对象都调用test2Interface接口中的show方法（实现的是test2枚举类中重写的show方法）
        for (int i = 0; i < arr.length; i++) {
            arr[i].show();
        }
    }
}
