package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

/*主界面的编写
通过输出语句完成*/
public class MainInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentClass> array = new ArrayList<StudentClass>();
        String loginName = "老师";
        String password = "123456";
        for (int q = 3; q > 0; q--) {
            System.out.println("请输入你的登录名：");
            String A = sc.nextLine();
            System.out.println("请输入你的密码：");
            String B = sc.nextLine();
            if (A.equals(loginName) && B.equals(password)) {
                for (; ; ) {
                    System.out.println("----------欢迎来到学生管理系统----------");
                    System.out.println("\t\t\t1、添加学生");
                    System.out.println("\t\t\t2、删除学生");
                    System.out.println("\t\t\t3、修改学生");
                    System.out.println("\t\t\t4、查看所有学生");
                    System.out.println("\t\t\t5、退出");
                    System.out.println("\t\t请输入你的选择：");
                    int choose = sc.nextInt();
                    if (choose == 1) {
                        addStudent(array);
                    } else if (choose == 2) {
                        deleteStudent(array);
                    } else if (choose == 3) {
                        amendStudent(array);
                    } else if (choose == 4) {
                        checkStudent(array);
                    } else if (choose == 5) {
                        System.out.println("已退出学生管理系统！");
                        System.exit(0);//退出JVM虚拟机，强制结束死循环
                    } else {
                        System.out.println("你输入的信息有误，请重新输入！");
                    }
                }
            } else if (q == 1) {
                System.out.println("账户锁定，如若需要解除，请和管理员联系！");
            } else {
                System.out.println("你输入的信息有误，你还有" + (q - 1) + "次机会");
            }
        }
    }

    //添加学生信息的方法编写
    public static void addStudent(ArrayList<StudentClass> array) {
        Scanner sc = new Scanner(System.in);
        String studentNumber;
        while (true) {
            System.out.println("请输入所需添加学生的学号：");
            studentNumber = sc.nextLine();
            Boolean flag = repetition(array, studentNumber);
            if (flag == true) {
                System.out.println("你输入的学号已被使用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入所需添加学生的姓名：");
        String studentName = sc.nextLine();
        System.out.println("请输入所需添加学生的性别：");
        String studentSex = sc.nextLine();
        System.out.println("请输入所需添加学生的年龄：");
        String studentAge = sc.nextLine();
        System.out.println("请输入所需添加学生的成绩：");
        String studentGrade = sc.nextLine();
        StudentClass s = new StudentClass(studentNumber, studentName, studentSex, studentAge, studentGrade);
        array.add(s);
        System.out.println("添加成功");

    }

    //查看学生信息的方法编写
    public static void checkStudent(ArrayList<StudentClass> array) {
        Scanner sc = new Scanner(System.in);
        if (array.size() == 0) {
            System.out.println("系统里暂无学生数据，请先添加学生信息！");
        } else {
            System.out.println("学号：\t" + "姓名：\t" + "性别：\t" + "年龄:\t" + "成绩：");
            for (int i = 0; i < array.size(); i++) {
                StudentClass s = new StudentClass();
                s = array.get(i);
                System.out.println(s.getStudentNumber() + "\t" + s.getStudentName() + "\t" + s.getStudentSex() + "\t\t" + s.getStudentAge() + "\t\t" + s.getStudentGrade());
            }
            System.out.println("按任意键返回：");
            int i = sc.nextInt();
        }
    }

    //删除学生信息的方法编写
    public static void deleteStudent(ArrayList<StudentClass> array) {
        Scanner sc = new Scanner(System.in);
        if (array.size() == 0) {
            System.out.println("系统里暂无学生数据，请先添加学生信息！");
        } else {
            while (true) {
                System.out.println("请输入你想删除的学生的学号：");
                String line = sc.next();
                int index = -1;
                for (int i = 0; i < array.size(); i++) {
                    StudentClass s = array.get(i);
                    if (s.getStudentNumber().equals(line)) {
                        index = i;
                        System.out.println("该学生的信息为：");
                        System.out.println("学号：\t" + "姓名：\t" + "性别：\t" + "年龄:\t" + "成绩：");
                        System.out.println(s.getStudentNumber() + "\t" + s.getStudentName() + "\t" + s.getStudentSex() + "\t\t" + s.getStudentAge() + "\t\t" + s.getStudentGrade());
                    }
                }

                if (index != -1) {
                    System.out.println("确定删除请按1，任意键返回");
                    int a = sc.nextInt();
                    if (a == 1) {
                        array.remove(index);
                        System.out.println("删除成功！");
                    } else {
                        System.out.println("删除失败！");
                    }
                } else {
                    System.out.println("该学号在系统中不存在，请核对后再输入！");
                }

                System.out.println("继续删除请按1，按任意键返回");
                int A = sc.nextInt();
                if (A != 1) {
                    break;
                }
            }
        }
    }

    //修改学生信息的方法编写
    public static void amendStudent(ArrayList<StudentClass> array) {
        if (array.size() == 0) {
            System.out.println("系统里暂无学生数据，请先添加学生信息！");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入所需修改的学生的学号：");
            String number = sc.nextLine();
            int index = -1;
            for (int i = 0; i < array.size(); i++) {
                StudentClass s = array.get(i);
                if (number.equals(s.getStudentNumber())) {
                    index = i;
                    System.out.println("该学生的信息为：");
                    System.out.println("学号：\t" + "姓名：\t" + "性别：\t" + "年龄:\t" + "成绩：");
                    System.out.println(s.getStudentNumber() + "\t" + s.getStudentName() + "\t" + s.getStudentSex() + "\t\t" + s.getStudentAge() + "\t\t" + s.getStudentGrade());
                    System.out.println("请输入新学号：");
                    String newNumber = sc.nextLine();
                    System.out.println("请输入新姓名：");
                    String newName = sc.nextLine();
                    System.out.println("请输入新性别：");
                    String newSex = sc.nextLine();
                    System.out.println("请输入新年龄：");
                    String newAge = sc.nextLine();
                    System.out.println("请输入新成绩：");
                    String newGrade = sc.nextLine();
                    StudentClass a = new StudentClass(newNumber, newName, newSex, newAge, newGrade);
                    array.set(i, a);//public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
                    System.out.println("修改成功！");
                    System.out.println("按任意键退出");
                    int k = sc.nextInt();
                    break;
                }
            }

            if (index == -1) {
                System.out.println("系统不存在该学号，请核对后重新输入！");
                System.out.println("退出按任意键：");
                int i = sc.nextInt();
            }
        }
    }

    //判断学号重复问题代码编写
    public static Boolean repetition(ArrayList<StudentClass> array, String StudentNumber) {
        boolean flag = false;
        StudentClass s = new StudentClass();
        for (int i = 0; i < array.size(); i++) {
            s = array.get(i);
            if (s.getStudentNumber().equals(StudentNumber)) {
                flag = true;
            }
        }
        return flag;
    }
}