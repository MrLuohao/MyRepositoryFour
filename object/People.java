package object;

/*
创建一个学生类和一个学生测试类Heima32，用于理解private关键字的作用和使用
 */
public class People {
    private String name;
    private int age;

    public void setname(String a) {
        name = a;
    }

    public String getname() {
        return name;
    }

    public void setage(int a) {
        if (a > 0 && a < 120) {
            age = a;
        } else {
            System.out.println("您输入的年龄有误！");
        }
    }

    public int getage() {

        return age;
    }

    public void show() {
        System.out.println("学生姓名为：" + name + "\n学生年龄为：" + age);
    }
}
