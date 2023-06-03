package Interface.text3;

public class animal extends Object implements Jumpping {
    private String name;
    private int age;

    public animal() {
    }

    public animal(String nam, int age) {
        this.name = nam;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String nam) {
        this.name = nam;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃食物");
    }

    @Override
    public void jump() {
        System.out.println(name + "学会了跳高");
    }
}
