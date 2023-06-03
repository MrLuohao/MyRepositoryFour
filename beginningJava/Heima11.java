package beginningJava;

public class Heima11 {
    /*
    形参和实参
          形参：方法定义中的参数
                等同于变量定义格式，例如：int number
          实参：方法调用中的参数
                等同于使用变量或常量，例如：10 number
     */
    public static void main(String[] args) {
        //调用方法的时候，人家要几个你就传递几个，人家要什么类型，你就给什么类型
        //需求设计：设计一个方法用于打印两个数中的最大值，数据来源于方法参数
        getMax(23, 45);//直接传递常量
        int a = 23;//定义变量，传递
        int b = 45;
        getMax(a, b);
        //需求设计：设计一个方法用于打印两个数中的最小值，数据来源于方法参数
        getMin(56.9, 34.6);//直接传递常量
        double c = 56.9;//定义变量传递
        double d = 34.6;
        getMin(c, d);
    }

    public static void getMax(int a, int b) {
        System.out.println(a > b ? "Max=" + a : "Max=" + b);
    }

    public static void getMin(double a, double b) {
        if (a < b) {
            System.out.println("Min=" + a);
        } else {
            System.out.println("Min=" + b);
        }
    }
}
