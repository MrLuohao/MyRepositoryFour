package networkProgramming;
/*
基于TCP协议的编程模型
 */
import java.awt.desktop.SystemEventListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServerSocket SS = null;//创建服务器ServerSocket类型的对象
        Socket S = null;
        BufferedReader bufferedReader = null;
        PrintStream PS = null;
        try {
            SS = new ServerSocket(8888);//并提供端口号
            while (true) {
                System.out.println("正在等待客户端的连接.....");
                S = SS.accept();//等待客户端的连接
                System.out.println("客户端连接成功");
                System.out.println("正在等待客户端发消息...");
                while (true) {
                    //创建输入流用于接收客户端发送过来的信息
                    bufferedReader = new BufferedReader(new InputStreamReader(S.getInputStream()));
                    //创建变量接收输入流里的内容,当客户端没有发送过来消息时，会形成堵塞
                    String s = bufferedReader.readLine();
                    //打印出客户端发来的内容
                    System.out.println("客户端发来的内容是：" + s);
                    //如果客户端发来的消息是bye就结束此次对话
                    if (s.equals("bye")) {
                        System.out.println("该客户端已下线");
                        break;
                    } else {
                        PS = new PrintStream(S.getOutputStream());
                        System.out.println("请输入你要给客户端回发的消息：");
                        String s1 = sc.nextLine();
                        PS.println(s1);
                        System.out.println("发送成功");
                        System.out.println("正在等待客户端回消息...");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (SS != null) {
                try {
                    //关闭服务器对象以及输入流
                    SS.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (sc != null) {
                sc.close();
            }
            if (PS != null) {
                PS.close();
            }
        }
    }
}
