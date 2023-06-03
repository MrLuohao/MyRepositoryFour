package IO;

import java.io.*;
/*
该流视频图片类型的文件的拷贝速度很快，推荐使用
 */
public class FileByteCopyTest2 {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();//获取当前时间距离1970年一月一日0时0分0秒的毫秒数
        System.out.println(l);
        BufferedInputStream B = null;
        BufferedOutputStream B1 = null;
        try {
            //创建BufferedInputStream与文件D:/我爱学习Java/部分代码/阿斯顿马丁.avi关联
            B = new BufferedInputStream(new FileInputStream("d:/我爱学习Java/部分代码/阿斯顿马丁.avi"));
            //创建BufferedOutputStream与文件D:/我爱学习Java/部分代码/超跑.avi关联
            B1 = new BufferedOutputStream(new FileOutputStream("d:/我爱学习Java/部分代码/超跑.avi"));
            //读取BufferedInputStream对象关联的文件中的内容
            System.out.println("正在拷贝中.......");
//            byte[] bytes = new byte[2048];//除了Java官方自带的，我们也可以自己创建，最好是1024的倍数
            int i = 0;
            while ((i = B.read()) != -1) {
                //将读取出来的BufferedInputStream对象关联的文件中的内容写入BufferedInputStream对象关联的文件当中
//                B1.write(bytes, 0, i);
                B1.write(i);//由源码可知：官方自带的缓冲内存为8192
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭各自输入输出流
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
        long l1 = System.currentTimeMillis();//获取当前时间距离1970年一月一日0时0分0秒的毫秒数
        System.out.println(l1-l);//可以测试出该方式效率高得多
    }
}
