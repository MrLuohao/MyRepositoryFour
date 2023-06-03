package polymorphic.text1;

/*
子类，猫类
 */
public class cat extends animal {//1.有继承/实现关系
    public int age = 2;
    @Override
    public void eat() {//2.有方法重写
        System.out.println("猫吃鱼");
    }

    public void catchTheMouse(){
        System.out.println("猫抓老鼠");
    }
}
