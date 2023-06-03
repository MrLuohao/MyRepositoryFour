package IO;

import java.io.*;

/*
采用字符缓冲流的方式拷贝字符文件，更快更高速
 */
public class FileCharCopyTest2 {
    public static void main(String[] args) {
        BufferedReader B = null;
        BufferedWriter B1 = null;
        try {
            //创建BufferedReader输入流对象指向指定文件，用于获取该文件的内容
            B = new BufferedReader(new FileReader("D:/我爱学习Java/部分代码/a.txt"));
            //创建BufferedWriter输出流对象指向指定文件，用于将读写出来的内容写入该文件
            B1 = new BufferedWriter(new FileWriter("D:/我爱学习Java/部分代码/a2.txt"));
            System.out.println("正在拷贝当中.......");
            //读写指定文件的内容
            int read = 0;
            while ((read = B.read()) != -1) {
                //将读写出来的内容写进指定文件中
                B1.write(read);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入输出流
            if (B != null) {
                try {
                    B.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (B1 != null) {
                try {
                    B1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
