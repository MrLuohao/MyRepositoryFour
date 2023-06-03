package networkProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP协议编程模型发送数据方 {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            //创建Socket对象
            datagramSocket = new DatagramSocket();
            //创建datagramPacket类型的对象并提供缓冲区
            byte[] arr = new byte[20];
            DatagramPacket datagramPacket = new DatagramPacket(arr, arr.length, InetAddress.getLocalHost(), 9999);
            //通过Socket对象调用send方法将包裹datagramPacket发送出去
            datagramSocket.send(datagramPacket);
            System.out.println("发送数据成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket并释放有关资源
            if (datagramSocket != null) {
                datagramSocket.close();
            }
        }
    }
}
