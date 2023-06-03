package inherit.text5;

public class teacher extends human {
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }

    public void teach() {
        System.out.println("传道解惑");
    }
}
