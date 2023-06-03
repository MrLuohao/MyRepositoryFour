package beginningJava;

public class Heima13 {
    /*
    方法重载概述：
         方法重载指同一个类中定义的多个方法之间的关系，满足下列条件的多个方法相互构成重载
            1.多个方法在同一个类中
            2.多个方法具有相同的方法名
            3.多个方法的参数不同，类型不同或者数量不同

    方法重载的特点：
         1.重载仅对应方法的定义，与方法的调用无关，调用方法参照标准格式
         2.重载仅针对同一个类中方法的名称与参数进行识别，与返回值无关，换句话说不能通过返回值来判定两个方法是否构成重载
     */
    public static void main(String[] args) {
        //调用方法
        int result = sum(11, 13);
        System.out.println(result);
        double result2 = sum(12.3, 34.1);
        System.out.println(result2);
        double l = 12.3 + 34.1;
        System.out.println(l);
        int result3 = sum(2, 3, 4);
        System.out.println(result3);
        double result4 = sum(2, 3, 4.5);
        System.out.println(result4);
    }

    //需求1：求两个int类型数据和的方法
    public static int sum(int a, int b) {
        return a + b;
    }

    //需求2：求两个double类型数据和的方法
    public static double sum(double a, double b) {
        return a + b;
    }

    //需求3：求三个int类型数据和的方法
    public static int sum(int a, int b, int c) {
        int i = a + b + c;
        return i;
    }

    //需求4：求两个int类型和一个double类型的和
    public static double sum(int a, int b, double c) {
        double i = a + b + c;
        return i;
    }
}
