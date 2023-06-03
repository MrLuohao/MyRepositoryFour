package Multithreading;

public class RunnableTest {
    public static void main(String[] args) {
        /*//1、匿名内部类的方式实现该接口的引用并重写该接口中的run方法
        Runnable R = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("使用匿名内部类的方式获取Runnable接口的引用并启动线程，打印出来的结果为：" + i);
                }
            }
        };
        //2、使用获取的Runnable接口的引用作为参数创建Thread类类型的对象
        Thread T = new Thread(R);
        //3、使用该Thread类对象调用start方法启动线程（获取的Runnable引用不能调用start方法，否则报错，必须借助Thread对象的方式）
        T.start();*/


        //简化写法：lambda表达式
        Runnable R = () -> {
            for (int i = 1; i <= 20; i++) {
                System.out.println("使用匿名内部类的方式获取Runnable接口的引用并启动线程，打印出来的结果为：" + i);
            }
            ;
        };
        new Thread(R).start();


        /*Thread T1 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("使用继承加匿名内部类的方式创建对象并启动线程，打印出来的结果为：" + i);
                }
            }
        };
        T1.start();*/


        //简化写法
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("使用继承加匿名内部类的方式创建对象并启动线程，打印出来的结果为：" + i);
                }
            }
        }.start();


    }
}
