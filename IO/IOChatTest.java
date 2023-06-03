package IO;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
打印流和转换流模拟聊天的功能实现
 */
public class IOChatTest {
    public static void main(String[] args) {
        BufferedReader B = null;//创建BufferedReader的引用用于接收用户输入的内容
        PrintStream P = null;//创建PrintStream的引用用于将用户输入的内容打印到指定文件里
        try {
            B = new BufferedReader(new InputStreamReader(System.in));
            P = new PrintStream(new FileOutputStream("d:/我爱学习Java/部分代码/chat.txt"));
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            while (true) {
                //提示用户输入内容
                System.out.println("小明请输入内容：");
                String s = sc.nextLine();
                if (s.equals("bye")) {
                    break;//如果输入的是bye就结束循环
                } else {
                    date = new Date();
                    format = simpleDateFormat.format(date);
                    P.println(format + "\n小明说：" + s);//否则就打印此内容到指定文件中
                }
                System.out.println("小华请输入内容：");
                String s1 = sc.nextLine();
                if (s1.equals("bye")) {
                    break;
                } else {
                    date = new Date();
                    format = simpleDateFormat.format(date);
                    P.println(format + "\n小华说：" + s1);
                }
            }
            System.out.println("打印成功，请返回文件查看");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭输入输出流并释放有关资源
            if (B != null) {
                try {
                    B.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (P != null) {
                P.close();
            }
        }
    }
}
