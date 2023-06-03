package beginningJava;

public class Heima10 {
    /*带参数方法的定义：
             public static void 方法名（参数）{....}

    带参数方法的调用格式：
            方法名（参数）;
    */
    public static void main(String[] args) {
        //实现功能：创建一个判断奇偶数的方法，并对其调用
        isEvennumber(56);
        //也可以这样调用
        int number = 21;
        isEvennumber(number);
    }

    public static void isEvennumber(int number) {
        System.out.println(number % 2 == 0 ? "偶数" : "奇数");
    }
}
