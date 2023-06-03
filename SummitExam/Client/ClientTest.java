package SummitExam.Client;

//测试客户端代码的编写
public class ClientTest {
    public static void main(String[] args) {
        ClientInitClose clientInitClose = null;//客户端对象
        ClientMainInterface clientMainInterface = null;//客户端主界面对象
        try {
            //创建客户端引用指向客户端对象
            clientInitClose = new ClientInitClose();
            //客户端对象调用客户端初始化功能
            clientInitClose.ClientInit();
            //创建客户端主界面引用指向客户端主界面对象
            clientMainInterface = new ClientMainInterface();
            //调用客户端主界面方法
            clientMainInterface.MainInterface();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //调用客户端中关闭所有资源的方法完成资源的释放
            if (clientInitClose != null) {
                try {
                    clientInitClose.ClientClose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            ClientScanner.closeScanner();
        }
    }
}
