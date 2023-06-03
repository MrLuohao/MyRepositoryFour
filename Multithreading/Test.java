package Multithreading;

public class Test {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                System.out.println("子线程名称为：" + getName() + ",线程ID为：" + getId());
                setName("QQ");
                System.out.println("修改后的子线程名称为：" + getName() + ",线程ID为：" + getId());
            }
        }.start();
        Thread thread = Thread.currentThread();
        System.out.println("主线程名称为：" + thread.getName() + ",主线程ID为：" + thread.getId());
    }
}
