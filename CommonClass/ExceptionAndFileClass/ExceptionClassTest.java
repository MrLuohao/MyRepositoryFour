package CommonClass.ExceptionAndFileClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionClassTest {
    public static void main(String[] args) {
        //ctrl+alt+t：快速调出某些方法的实现
        FileInputStream file = null;//创建一个file类的对象
        try {
            System.out.println(1);
            file = new FileInputStream("D:\\Test\\a.txt");//使file类的对象指向指定目录下的文件
            System.out.println(2);
        } catch (Exception e) {//如果抓到了上述代码的错误，直接就地处理
            System.out.println(3);
            e.printStackTrace();
            System.out.println(4);//如果执行到catch代码块，那么catch代码块中的所有内容都要执行完
        } /*catch (IOException e) {//报错，需要用到多个catch分支的异常时，小类型得放在大类型的前面，否则将报错
            e.printStackTrace();
        }*/ finally {//不管程序能不能抓到错误，这里的代码都必须运行，运行完这行代码，jvm才能终止该程序
            System.out.println("程序运行必须允许到这里。");
        }
        System.out.println(5);
        try {
            file.close();//结束该文件的访问
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

