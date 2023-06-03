package IO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamClassTest {
    public static void main(String[] args) {
        ObjectOutputStream O = null;//创建 ObjectOutputStream 的引用与指定文件关联，用于将信息打印到指定文件
        ObjectInputStream O1 = null;
        Student S = new Student("小华", 21, "2018200989");//创建Student类的对象并完成初始化
        Student S1 = new Student("小明", 22, "2018200956");
        List<Student> L = new ArrayList<>();//可以创建集合将创建出来的学生对象装起来，后面统一将信息写进指定的文件中
        L.add(S);
        L.add(S1);
        try {
            O1 = new ObjectInputStream(new FileInputStream("d:/我爱学习Java/部分代码/ObjectOutputStream.txt"));
            O = new ObjectOutputStream(new FileOutputStream("d:/我爱学习Java/部分代码/ObjectOutputStream.txt"));
            O.writeObject(L);//将创建好的Student对象的信息写进ObjectOutputStream创建的引用的输出流指定的文件当中
            System.out.println("写入成功，详细信息请查看源文件");
            try {
                Object o = O1.readObject();//读取该文件中的详细信息并用对象o接收
                System.out.println("该文件的详细信息为：" + o);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (O != null) {
                try {
                    //关闭输出流
                    O.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
