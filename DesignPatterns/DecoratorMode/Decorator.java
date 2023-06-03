package DesignPatterns.DecoratorMode;

public class Decorator implements Sourceable {
    private Sourceable source;

    //合成复用原则
    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        source.method();
        System.out.println("还可以去玩耍");
    }
}
