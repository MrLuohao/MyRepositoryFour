package SummitExam.Server;

/**
 * 测试服务器端代码的编写
 */
public class serverTest {
    public static void main(String[] args) {
        ServerInitClose serverInitClose = null;
        try {
            //创建服务器引用指向服务器对象
            serverInitClose = new ServerInitClose();
            //调用服务器初始化方法完成服务器初始化
            serverInitClose.ServerInit();
            //关闭服务器以及释放相关资源
            serverInitClose.ServerClose();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (serverInitClose != null) {
                try {
                    serverInitClose.ServerClose();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
