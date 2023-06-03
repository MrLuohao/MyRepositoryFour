package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
案例：存储学生对象并遍历升级版：学生数据来源于键盘录入

思路：
     1：定义学生类，为了键盘录入数据方便，把学生类中的成员变量都定义为 String 类型
     2：创建集合对象
     3：键盘录入学生对象所需要的数据
     4：创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
     5：往集合中添加学生对象
     6：遍历集合，采用通用遍历格式实现
 */
public class TraversalStudentDifficulty {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        for (int a = 1; a <= 3; a++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + a + "个学生的学号：");
            String StudentNumber = sc.nextLine();
            System.out.println("请输入第" + a + "学生的姓名：");
            String StudentName = sc.nextLine();
            System.out.println("请输入第" + a + "学生的年龄：");
            String StudentAge = sc.nextLine();
            Student s = new Student(StudentNumber, StudentName, StudentAge);
            array.add(s);
        }
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getStudentNumber() + "," + s.getName() + "," + s.getAge());
        }
    }
}