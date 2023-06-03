package SummitExam.Client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientInitClose {
    private Socket socket;
    private ObjectInputStream objectInputStream;
    private ObjectOutputStream objectOutputStream;

    //自定义成员方法实现客户端的初始化
    public void ClientInit() throws Exception {
        //创建Socket对象并指定IP地址以及端口号
        socket = new Socket("192.168.43.227", 8888);
        System.out.println("连接成功");
        //创建输入输出流与服务器进行通信
        objectInputStream = new ObjectInputStream(socket.getInputStream());
        objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        /*System.out.println("请输入您的需求：");
        String s = ClientScanner.getScanner().nextLine();*/

    }

    //自定义成员方法实现资源的关闭
    public void ClientClose() throws Exception {
        socket.close();
        objectInputStream.close();
        objectOutputStream.close();
        System.out.println("正在关闭相关资源...");
        Thread.sleep(2000);
        System.out.println("所有资源已关闭");
    }

}
