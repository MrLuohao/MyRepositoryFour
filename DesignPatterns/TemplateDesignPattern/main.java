package DesignPatterns.TemplateDesignPattern;

public class main {
    public static void main(String[] args) {
        AbstractCalculator abstractCalculator = new Plus();
        int res = abstractCalculator.splitExpression("1+1", "\\+");
        System.out.println("结果为：" + res);
        AbstractCalculator abstractCalculator1 = new Minus();
        int i = abstractCalculator1.splitExpression("3-1", "\\-");
        System.out.println("结果为："+i);
    }
}
