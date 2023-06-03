package IO;

import java.io.Serializable;

public class Student implements Serializable {//1.实现该接口启用序列化功能
    private static final long serialVersionUID = -3387516993124220948L;//2.给定一个版本号
    private String name;
    private int age;
    private transient String StudentID;//该关键字的意思是，添加了该关键字的信息jvm会认为该内容不需要通过序列化写入到输出流中（相当于添加了该关键字的信息就不会读取到），就不会添加到指定文件的内容中，读取的时候也就读取不出来该信息了

    public Student() {
    }

    public Student(String name, int age, String studentID) {
        this.name = name;
        this.age = age;
        StudentID = studentID;
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

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", StudentID='" + StudentID + '\'' +
                '}';
    }
}
