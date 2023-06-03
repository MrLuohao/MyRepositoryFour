package inherit.text5;

public class student extends human {
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("努力学习");
    }
}
