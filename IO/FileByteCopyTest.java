package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/*
该流可以用于视频文件的拷贝，只不过效率很慢，不建议使用
 */
public class FileByteCopyTest {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();//获取当前时间距离1970年一月一日0时0分0秒的毫秒数
        System.out.println(l);
        FileInputStream F = null;
        FileOutputStream F1 = null;
        try {
            //创建字节输入流与文件D:\我爱学习Java\部分代码\阿斯顿马丁.avi关联
            F = new FileInputStream("D:/我爱学习Java/部分代码/阿斯顿马丁.avi");
            //创建字节输出流与文件D:\我爱学习Java\部分代码\跑车.avi关联
            F1 = new FileOutputStream("D:/我爱学习Java/部分代码/跑车.avi");
            System.out.println("关联文件的大小为：" + F.available() + "个字节。");//获取关联文件的大小
//            System.out.println(F.read());//从输入流中读取关联文件的单个字节的数据并返回，返回-1表示读取到末尾
            System.out.println("正在拷贝中......");
            //读取文件阿斯顿马丁.avi
            int read = 0;
            while ((read = F.read()) != -1)
                //将读取出来的内容通过输出流写入到跑车.avi文件当中
                F1.write(read);
            System.out.println("拷贝成功");//速度比较慢
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入输出流
            if (F != null) {
                try {
                    F.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (F1 != null) {
                try {
                    F1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        long l1 = System.currentTimeMillis();//获取当前时间距离1970年一月一日0时0分0秒的毫秒数
        System.out.println(l1-l);
    }
}
