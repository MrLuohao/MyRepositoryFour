package DesignPatterns.TemplateDesignPattern;

public class Plus extends AbstractCalculator {

    @Override
    public int calculate(int ia, int ib) {
        return ia + ib;
    }
}
