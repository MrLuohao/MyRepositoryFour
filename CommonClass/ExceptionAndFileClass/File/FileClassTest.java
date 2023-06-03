package CommonClass.ExceptionAndFileClass.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileClassTest {
    public static void main(String[] args) {
        File file = new File("d:/Test/b.txt");//构造File类型的对象与d:/Test/a.txt文件关联
        if (file.exists()) {//意思是：如果该文件存在的话
            System.out.println(file.getName());//获取文件的名字
            System.out.println(file.exists());//判断该文件是否存在
            System.out.println(file.length());//文件的大小
            Date date = new Date(file.lastModified());
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            System.out.println(simpleDateFormat.format(date));//格式调整后的时间
            //System.out.println(file.lastModified());//文件的最后一次修改时间,打印出来的信息为毫秒，距离1970年1月1日0时0分0秒的毫秒数
            System.out.println(file.getAbsolutePath());//文件的绝对路径信息
            System.out.println(file.delete() ? "删除成功" : "删除失败");
        } else {//如果文件不存在
            try {
                System.out.println(file.createNewFile() ? "文件创建成功" : "文件创建失败");//创建新文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("--------------------");
        File file1 = new File("d:/Tests/java/b/a");
        if (file1.exists()) {
            System.out.println("目录存在");
//            System.out.println(file1.length());
            System.out.println(file1.getName());
            file1.delete();//java中没有提供一次性删除所有文件或目录的功能，默认只删除最后一个文件或目录
            System.out.println("删除目录成功");
        } else {
            System.out.println(file1.mkdirs() ? "创建目录成功" : "创建目录失败");//创建参数指定的目录，如果只有一个目录，就mkdir，多层目录的创建加s即可
        }
    }
}
