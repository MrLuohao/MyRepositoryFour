package inherit.text5;

/*
案例：老师和学生
   需求：定义老师类和学生类，然后写代码测试；最后找到老师和学生类中的共性内容，抽取出一个父类，用继承的方式改写代码，并进行测试
 */
//父类
public class human {
    private String name;
    private int age;

    public human() {
    }

    public human(String name, int age) {
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

    public void eat() {
        System.out.println("人类补充能量才能存活");
    }
}
