package IO;

import java.io.FileWriter;
import java.io.IOException;

public class IOTest1 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        try {
            //1.构造FileWriter的类型的对象与d:/我爱学习Java/部分代码/a.txt文件关联
            fileWriter = new FileWriter("d:/我爱学习Java/部分代码/a.txt");
//            fileWriter = new FileWriter("d:/我爱学习Java/部分代码/a.txt", true);//若文件存在则以追加的方式添加参数指定内容，不清除原内容；若文件不存在，则创建文件并将参数指定字符添加到文件中
            //2.通过输出流向文件里输入参数指定的字符
            //若文件不存在，该流会自动创建该文件并写入参数指定字符内容
            //若文件存在，该流会清空该文件里的内容并写入参数指定字符内容
            //通过流对象写入数据内容，每当写入一个字符后则文件读写位置向后移动一位，类似于world文档的文字输入效果
            fileWriter.write('a');
            System.out.println("写入数据成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (null != fileWriter)
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        try {
            fileWriter = new FileWriter("d:/我爱学习Java/部分代码/a.txt",true);
            fileWriter.write('b');
            System.out.println("写入成功");
            //准备一个数组
            char[] chars = {'a', 'f', 'y', 'd', 'j'};
            fileWriter.write(chars, 1, 3);//将参数指定数组的一部分内容写进流关联文件
            System.out.println("写入成功");
            fileWriter.write(chars);
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fileWriter!=null)
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }

    }
}
