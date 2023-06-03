package DesignPatterns.SingletonDesignPattern;

/*
单例设计模式：饿汉式和懒汉式，懒汉式需要对多线程进行同步处理
 */
public class SingletonDesignPattern {
    //2.声明本类类型的引用指向本类类型的对象并使用private static关键字修饰
    private static SingletonDesignPattern singletonDesignPattern = null;

    //1.私有化构造方法，使用private关键字修饰（不让外界随便new对象）
    private SingletonDesignPattern() {
    }

    //3.提供共有的get方法负责将上述对象返回出去，使用public static关键字修饰
    public static /*synchronized*/ SingletonDesignPattern getInstance() {
        if (singletonDesignPattern == null) {
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) {
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }
        return singletonDesignPattern;
    }
}