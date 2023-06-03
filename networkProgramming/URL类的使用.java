package networkProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class URL类的使用 {
    public static void main(String[] args) {
        HttpURLConnection urlConnection = null;
        BufferedReader bufferedReader = null;
        //1.使用参数指定的字符串来构造对象
        try {
            URL url = new URL("https://www.baidu.com/");
            //2.获取相关信息并打印出来
            String protocol = url.getProtocol();
            System.out.println("获取到的协议名称是：" + protocol);
            System.out.println("获取到的主机名称是：" + url.getHost());
            System.out.println("获取到的端口号是：" + url.getPort());
            //3.建立连接并读取相关信息打印出来
            urlConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String s = null;
            while ((s = bufferedReader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            urlConnection.disconnect();
        }
    }
}
