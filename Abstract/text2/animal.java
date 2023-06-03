package Abstract.text2;

/*
案例：猫和狗
    需求：请采用抽象类的思想实现猫和狗的案例，并在测试类中进行测试
 */
public abstract class animal {
    private String name;
    private int age;

    public animal() {
    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}
