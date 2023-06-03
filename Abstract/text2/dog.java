package Abstract.text2;

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
}
