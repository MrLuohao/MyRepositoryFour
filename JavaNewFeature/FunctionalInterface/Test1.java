package JavaNewFeature.FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Test1 {
    public static <Objetc> void main(String[] args) {
        //1.匿名内部类的方式
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("没有参数也没有返回值的方法");
            }
        };
        runnable.run();
        //1.1  lambda表达式
//        Runnable runnable1 =()->{ System.out.println("没有参数也没有返回值的方法"); };//其中（）、参数类型、{}以及return关键字可以省略
        Runnable runnable1 = () -> System.out.println("没有参数也没有返回值的方法");
        runnable1.run();
        System.out.println("---------------------");
        //2.匿名内部类的方式
        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o + "有参无返回值的方法");
            }
        };
        consumer.accept("提示：");
        //2.1  lambda表达式
//        Consumer consumer1 = (Object o) -> { System.out.println("有参无返回值的方法"); };
        //自动类型推断
        Consumer consumer1 = o -> System.out.println(o + "有参无返回值的方法");
        consumer1.accept("我就是");
        System.out.println("---------------------");
        //3.匿名内部类的方式
        Supplier supplier = new Supplier() {
            @Override
            public Object get() {
                return "无参有返回值的方法";
            }
        };
        System.out.println(supplier.get());
        //3.1  lambda表达式
//        Supplier supplier1 = () -> { return "无参有返回值的方法"; };
        Supplier supplier1 = () -> "无参有返回值的方法";//{}、return可以去掉
        System.out.println(supplier1.get());
        System.out.println("---------------------");
        //4.匿名内部类的方式
        Function function = new Function() {
            @Override
            public Object apply(Object o) {
                return o;
            }
        };
        Object o1 = function.apply("有参有返回值的方法");
        System.out.println(o1);
        //4.1  lambda表达式
        Function function1 = (o) -> o;
        System.out.println(function1.apply("有参有返回值的方法"));
        System.out.println("---------------------");
        //5.匿名内部类的方式
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };
        System.out.println(predicate.test("true or flase"));
        //5.1  lambda表达式
        Predicate predicate1 = o -> false;
        System.out.println(predicate1.test("随便输入什么都是返回false"));
    }
}
