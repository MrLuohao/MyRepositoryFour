package DesignPatterns.DecoratorMode;

public class main {
    public static void main(String[] args) {
        Sourceable sourceable1 = new Source();
        Sourceable sourceable = new Decorator(sourceable1);
        sourceable.method();
    }
}
