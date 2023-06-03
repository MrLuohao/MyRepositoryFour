package networkProgramming;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
基于UDP协议的编程模型
 */
public class UDP协议编程模型接收数据方 {
    public static void main(String[] args) {
        DatagramSocket datagramSocket = null;
        try {
            //创建datagramSocket类型的对象并提供端口号
            datagramSocket = new DatagramSocket(9999);
            //提供datagramPacket的对象并创建数组提供缓冲区用于接收发送方发送过来的数据
            byte[] arr = new byte[20];
            DatagramPacket datagramPacket = new DatagramPacket(arr, arr.length);
            System.out.println("正在等待数据的到来...");
            //通过Socket对象接收发送发发送过来的数据并调用receive方法将数据内容放入packet里
            datagramSocket.receive(datagramPacket);
            //读取packet里面的内容（new String对象打印参数指定的所有内容）
            System.out.println("接收到的数据内容是：" + new String(arr, 0, datagramPacket.getLength()) + "!");
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
