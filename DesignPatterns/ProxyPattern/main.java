package DesignPatterns.ProxyPattern;

public class main {
    public static void main(String[] args) {
        //这里相当于同时创建了两个对象，就不用像装饰器那样传对象调用方法了
        Sourceable sourceable = new Proxy();
        sourceable.method();
    }
}
