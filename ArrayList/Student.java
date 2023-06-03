package ArrayList;
//Alt+insert可以选择性的帮我们快速创建get和set方法以及无参和带参的成员方法
public class Student {
    private String studentNumber;
    private String name;
    private String age;

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student() { }

    public Student(String studentNumber, String name, String age) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.age = age;
    }
}
