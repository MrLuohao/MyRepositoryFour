package Multithreading;

public class SleepUsage {
    public static void main(String[] args) {
        Thread T = new Thread() {//创建Thread对象并采用匿名内部类的方式调用start进程
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);//使当前进程进入休眠状态一秒钟
                    long id = getId();
                    String name = getName();
                    for (int i = 1; i < 51; i += 2) {
                        System.out.println("ID为：" + id + "的进程" + name + "的run方法运行结果为：" + i);

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        T.getPriority();//获取线程的优先级
        T.start();
        Thread.currentThread().setPriority(1);//重新获取线程的优先级
        try {
            Thread.sleep(3000);//使当前线程休眠两秒钟
            long id = Thread.currentThread().getId();//获取主线程的ID
            String name = Thread.currentThread().getName();
            for (int i = 1; i < 51; i += 2) {
                System.out.println("ID为：" + id + ",主进程" + name + "的run方法运行结果为：" + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
