package Interface.text3;

public class dog extends animal {
    public dog() {
    }

    public dog(String nam, int age) {
        super(nam, age);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "啃骨头");
    }
}
