package Interface.text2;

public interface inter {
    public int num = 20;
    public final int num1 = 30;
    public static final int num2 = 40;
    int num3 = 50;

/*    public inter() {
    }

    //接口是抽象类，不能有具体的方法

    public void show() {

    }*/


    public abstract void show();//与void show();是一样的效果，因为接口类中的方法默认带有public abstract修饰符

    void method();
}
