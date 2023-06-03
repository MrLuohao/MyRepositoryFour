package networkProgramming;

import java.io.IOException;
import java.net.Socket;

public class SocketTest {
    public static void main(String[] args) {
        Socket S = null;
        try {
            S = new Socket("10.10.201.6", 7777);
            System.out.println("客户端正在发起连接....");
//            Thread.sleep(2000);
            System.out.println("连接成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (S != null) {
                try {
                    S.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
