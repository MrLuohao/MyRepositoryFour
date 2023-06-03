package DesignPatterns.ProxyPattern;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("不仅可以实现此功能");
    }
}
