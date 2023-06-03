package inherit.text1;

public class Fu {
    public int age = 40;

    public Fu() {
        System.out.println("Fu无参构造方法被调用");
    }

    public Fu(int age) {
        System.out.println("Fu带参构造方法被调用");
    }

    public void show() {
        System.out.println("调用show方法。");
    }
}
