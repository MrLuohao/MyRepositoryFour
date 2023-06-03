package CommonClass.ExceptionAndFileClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionClassTest3 {
    public static void show() throws Exception/*FileNotFoundException, IOException*/ {//抛出异常，就不报错了
        FileInputStream file = new FileInputStream("D:\\Test\\a.txt");
        System.out.println("这一段话就不执行了");//抛出异常后的后续代码就不会再执行了
        file.close();
    }

    public static void show1() throws Exception /*也可以直接采取抛出所有异常的超类的大类型来概括所有异常*/ /*FileNotFoundException, java.io.IOException*/ {
        show();
    }

    public static void show2() throws Exception /*FileNotFoundException, java.io.IOException*/ {
        show1();
    }

    public static void show3() throws Exception/*FileNotFoundException, java.io.IOException*/ {
        show2();
    }

    public static void main(String[] args) {

        try {
            ExceptionClassTest3.show();//这时会在最后一个方法中报错
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("就是这样一层一层的抛出异常，抛出到最后一个建议就捕获处理了，因为main方法中我们不建议继续抛出异常，虽然也可以继续抛出");
    }
}
