package networkProgramming;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

    public static void main(String[] args) {
        ServerSocket SS = null;
//        Socket S = null;
        try {
            SS = new ServerSocket(7777);
            System.out.println("等待客户端连接.....");
//            S = new Socket();
            SS.accept();
            System.out.println("客户端连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (SS != null) {
                try {
                    SS.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
           /* if (S != null) {
                {
                    try {
                        S.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }*/
        }
    }
}

