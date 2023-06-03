package beginningJava;

public class Heima15 {

    public static void main(String[] args) {
        /*
    方法的参数传递（基本类型）：
                              对于基本数据类型的参数，形式参数的改变，不影响实际参数的值
     */
        int number = 100;//实际参数
        System.out.println("方法调用前number=" + number);
        change(number);
        System.out.println("方法调用后number=" + number);
        /*
        方法的传递（引用数据类型）：
                                 对于引用类型的参数，形式参数的改变，影响实际参数的值
         */
        int[] arr = {12, 34, 45};
        System.out.println("方法调用前arr[1]=" + arr[1]);
        change(arr);
        System.out.println("方法调用后arr[1]=" + arr[1]);
    }

    public static void change(int number) {   //此处的int number为形式参数
        number = 200;
    }

    public static void change(int[] arr) {
        arr[1] = 100;
    }
}
