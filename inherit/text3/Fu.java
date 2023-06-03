package inherit.text3;
/*方法重写的注意事项
        1.私有方法不能被重写，也不能被调用（父类私有成员，子类是不能继承的）
        2.子类方法访问权限不能更低（public>默认>私有）*/
public class Fu {
    private void show() {
        System.out.println("Fu中show方法被调用");
    }
    void method(){
        System.out.println("Fu中method方法被调用");
    }
}
