package CommonClass.ExceptionAndFileClass;

public class ExceptionClassTest2 {
    public static int test() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[5]);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 1;
        } finally {
            return 2;//提交结束方法并返回数据
        }
    }

    public static void main(String[] args) {
        System.out.println(ExceptionClassTest2.test());//输出结果为2；因为finally这段代码块赶在catch执行结束前先执行了，所以finally代码块比catch代码块先结束该程序，所以输出2
    }
}
