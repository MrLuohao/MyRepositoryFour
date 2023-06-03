package inherit.text1;

public class Zi extends Fu {
    public int age = 20;

    public Zi(){
//        super();
        System.out.println("Zi中无参构造方法被调用");
    }

    public Zi(int age) {
//        super(21);
        System.out.println("Zi中带参构造方法被调用");

    }

    public void method() {
        System.out.println("method方法被调用");
    }

    public void show() {
        int age = 30;
        System.out.println("age:" + age);//范文本局部范围内的值
        System.out.println("age:" + this.age);//this访问本类中成员变量的值
        System.out.println("age:" + super.age);//访问父类成员变量的值
    }
}
