package SummitExam.Server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerInitClose {
    private ServerSocket serverSocket;
    private ObjectInputStream objectInputStream;
    private Socket socket = null;
    private ObjectOutputStream objectOutputStream;

    //自定义成员方法实现服务器的初始化操作
    public void ServerInit() throws Exception {
        //创建serverSocket对象并指定端口号
        serverSocket = new ServerSocket(8888);
        //等待客户端的连接
        System.out.println("正在等待客户端的连接...");
        socket = serverSocket.accept();
        System.out.println("客户端连接成功");
        System.out.println("正在等待客户端的消息...");
        //创建输入输出流与客户端进行通信
        objectInputStream = new ObjectInputStream(socket.getInputStream());
        objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        /*int read = objectInputStream.read();
        System.out.println("客户端发来的消息是：" + read);
        System.out.println("客户端初始化成功");*/
    }

    //自定义方法实现Socket以及相关流的关闭并释放有关资源
    public void ServerClose() throws Exception {
        serverSocket.close();
        objectInputStream.close();
        objectOutputStream.close();
        System.out.println("正在关闭相关资源...");
        Thread.sleep(2000);
        System.out.println("已关闭Socket对象并释放了相关资源");
    }
}

