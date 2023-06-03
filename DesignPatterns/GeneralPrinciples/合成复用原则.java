package DesignPatterns.GeneralPrinciples;

//尽量多使用合成/聚合的方式，而不是继承的方式
public class 合成复用原则 {
    private 合成复用原则1 S;//创建需要用到的方法的所属类的对象

    public 合成复用原则(合成复用原则1 S) {
        this.S = S;
    }

    public 合成复用原则() {

    }

    public void show1() {
        S.show();//这样就可以直接调用合成复用原则1中的show方法了，而不用继承
    }

    public static void main(String[] args) {
        合成复用原则 ss = new 合成复用原则(new 合成复用原则1());
        ss.show1();
    }
}
