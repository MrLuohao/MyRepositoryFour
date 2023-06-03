package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharCopyTest {
    public static void main(String[] args) {
        /*
        文件字符流实现文件的拷贝，不能实现视频文件以及图片文件的拷贝
         */
        FileReader f = null;
        FileWriter f1 = null;
        try {
            //创建FileReader类型的对象与d:/我爱学习Java/部分代码/a.txt关联
            f = new FileReader("d:/我爱学习Java/部分代码/a.txt");
            //创建FileWriter类型的对象与d:/我爱学习Java/部分代码/b.txt关联
            f1 = new FileWriter("d:/我爱学习Java/部分代码/b.txt");
            System.out.println("正在拷贝当中......");
            //读取文件a.txt的内容
            int read = 0;
            while ((read = f.read()) != -1) {
                //将读取出来的内容通过输出流输入到b.txt
                f1.write(read);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (f1 != null) {
                try {
                    f1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
