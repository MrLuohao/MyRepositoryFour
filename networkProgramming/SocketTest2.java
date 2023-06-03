package networkProgramming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Socket S = null;
        PrintStream PS = null;
        BufferedReader bufferedReader = null;
        try {
            //创建客户端Socket类型的对象并指定服务器端的IP地址和端口号
            S = new Socket("10.10.201.6", 8888);
            System.out.println("正在连接服务器...");
            System.out.println("连接成功");
            while (true) {
                //创建输出流用于向服务器发送信息
                PS = new PrintStream(S.getOutputStream());
                System.out.println("请输入你想发送给服务器的信息：");
                String s = sc.nextLine();
                //发送信息
                PS.println(s);
                System.out.println("发送成功");
                if (s.equals("bye")) {
                    System.out.println("客户端正在退出....");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                System.out.println("正在等待服务器回消息...");
                //创建输入流用于接收服务器端发来的消息，并打印
                bufferedReader = new BufferedReader(new InputStreamReader(S.getInputStream()));
                String s1 = bufferedReader.readLine();
                System.out.println("服务器发来的消息是：" + s1);
            }
            System.out.println("客户端已退出");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭相应输出流、客服端对象以及扫描器
            if (S != null) {
                try {
                    S.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (PS != null) {
                PS.close();
            }
            if (sc != null) {
                sc.close();
            }
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
