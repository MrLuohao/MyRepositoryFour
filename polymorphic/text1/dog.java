package polymorphic.text1;

public class dog extends animal {
    public int age = 5;

    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }
}
