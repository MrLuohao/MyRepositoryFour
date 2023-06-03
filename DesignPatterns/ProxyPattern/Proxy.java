package DesignPatterns.ProxyPattern;

public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        //相当于在创建Proxy类型的对象的同时也创建了Source类型的对象
        source = new Source();
    }

    @Override
    public void method() {
        //相当于同时调用了两个方法
        source.method();
        System.out.println("还可以实现这个功能");
    }
}
