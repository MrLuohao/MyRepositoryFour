package IO;

import java.io.FileReader;
import java.io.IOException;

public class IOFileReaderClassTest {
    public static void main(String[] args) {
        //该类主要用于从文本文件读取文本数据内容
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("d:/我爱学习Java/部分代码/a.txt");
            char[] chars = new char[10];
//            int res = fileReader.read(chars,0,9);希望读到数组的0-9的位置
            int res = fileReader.read(chars);//希望读满
            System.out.println(res);
            for (char c : chars) {
                System.out.println("读取到的字符是：" + c);
            }
            int i = 0;
            while ((i = fileReader.read()) != -1) //每次读取一次过后光标会向后移动一位
                System.out.println("读取的字符为：" + (char) res);//这里只读了一个是因为前面已经读到j这个地方了（读一个光标会移动一位）
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();//关闭流对象，并释放有关资源
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
