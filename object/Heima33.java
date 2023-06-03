package object;
/*
this关键字：
    1.this修饰的变量用于指代成员变量
          方法的形参如果与成员变量同名，不带this修饰的变量指的是形参，而不是成员变量
          方法的形参如果没有与成员变量同名，不带this修饰的变量指成员变量

    2.什么时候使用this呢？
          解决局部变量隐藏成员变量

    3.this：代表所在类的对象引用
          记住：方法被哪个对象调用，this就代表哪个类
 */

public class Heima33 {
    private String Name;
    private int Age;
    private int Weight;
    private int Height;

    public void setName(String Name) {
//        Name = Name;//此处如果不加this关键字，那么成员变量Name的值将为NULL（被局部变量隐藏）
        this.Name = Name;//加了this关键字过后，成员变量Name的值将为调用setName方法时传给局部变量Name的变量
    }

    public String getName() {
        return Name;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public int getAge() {
        return Age;
    }

    public void setWeight(int Weight) {
        this.Weight = Weight;
    }

    public int getWeight() {

        return this.Weight;
    }

    public void setHeight(int Height) {

        this.Height = Height;
    }

    public int getHeight() {

        return Height;
    }
}
