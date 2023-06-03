package object;

/*
  案例：学生
  需求：首先定义一个学生类，然后定义学生测试类，在学生测试类中通过对象完成成员变量和成员方法的使用
 */
public class Student {
    /*
    成员变量：name姓名，age年龄，height身高，weight体重
     */
    String name;
    int age;
    double height;
    int weight;

    public void study() {
        System.out.println("学习");
    }

    public void sport() {
        System.out.println("运动");
    }

    public void doHomework() {
        System.out.println("做作业");
    }
}
