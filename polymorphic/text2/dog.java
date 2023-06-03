package polymorphic.text2;

/*
狗类，继承动物类
 */
public class dog extends animal {
    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void play() {
        System.out.println("狗看门");
    }
}
