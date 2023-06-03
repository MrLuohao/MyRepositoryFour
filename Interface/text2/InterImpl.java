package Interface.text2;

public class InterImpl extends Object implements inter {
    public int num = 90;//接口类的成员变量默认为常量，不能被修改，所以不会访问子类中num的数据

    public void InterImpl() {
    }

    @Override
    public void show() {
        System.out.println("show方法被调用");
    }

    @Override
    public void method() {
        System.out.println("method方法被调用");
    }
}
