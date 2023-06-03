package DesignPatterns.DecoratorMode;

/*
可以实现一个类的功能扩展
可以动态实现功能的增加，还可以实现动态的撤销（继承不行）
 */
public interface Sourceable {
    void method();
}
