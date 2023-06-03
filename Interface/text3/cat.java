package Interface.text3;

public class cat extends animal {
    public cat() {
    }

    public cat(String nam, int age) {
        super(nam, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "吃鱼");
    }
}
