package JavaNewFeature.FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {
        person person = new person("小华", 23);
        //1.使用匿名内部类的方式通过函数接口Runnable中的方法实现person类中show方法的调用
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                person.show();
            }
        };
        runnable1.run();
        //2.使用lambda表达式的方式通过函数接口Runnable中的方法实现person类中show方法的调用
        Runnable runnable = () -> person.show();
        runnable.run();
        //3.使用方法引用的方式实现person类中show方法的调用
        Runnable runnable2 = person::show;
        runnable2.run();
    }
}
