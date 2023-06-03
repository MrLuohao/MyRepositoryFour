package StudentManagementSystem;

/*
案例：学生管理系统的实现

项目演示：
           -﹣欢迎来到学生管理系统﹣-------
                1.添加学生
                2.删除学生
                3.修改学生
                4.查看所有学生
                5.退出
                请输入你的选择：

学生管理系统实现思路：
 1.定义学生类
 2.主界面的代码编写
 3.添加学生的代码编写
 4.查看学生的代码编写
 5.删除学生的代码编写
 6.修改学生的代码编写
 */
public class StudentClass {
    //快速生成有参无参构造方法的快捷键为Alt+insert，也可以快速生成成员变量的set,get方法
    private String studentNumber;
    private String studentName;
    private String studentSex;
    private String studentAge;
    private String studentGrade;


    public StudentClass() { }

    public StudentClass(String studentNumber, String studentName, String studentSex, String studentAge, String studentGrade) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAge = studentAge;
        this.studentGrade = studentGrade;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentGrade() {
        return studentGrade;
    }

    public void setStudentGrade(String studentGrade) {
        this.studentGrade = studentGrade;
    }
}
