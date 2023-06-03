package polymorphic.text2;

/*
猫类，继承动物类
 */
public class cat extends animal {
    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void play() {
        System.out.println("猫抓老鼠");
    }
}
