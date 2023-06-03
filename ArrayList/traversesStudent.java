package ArrayList;

import java.util.ArrayList;

/*
案例：存储学生对象并遍历
 需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */
public class traversesStudent {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();//创建集合对象用于存储学生对象
        //创建学生对象并赋值
        Student s = new Student("12334", "小明", "21");
        Student s1 = new Student("12335", "小华", "20");
        Student s2 = new Student("12336", "小王", "22");
        //将学生对象添加到集合中
        array.add(s);
        array.add(s1);
        array.add(s2);
        //遍历集合，以获取集合中的每一个元素
        for (int i = 0; i < array.size(); i++) {
            //创建学生对象用于接收返回的集合中各个索引返回的值
            Student a = array.get(i);
            //采用get方法将对象中各个成员变量的值在控制台打印出来
            System.out.println(a.getStudentNumber()+","+a.getName()+","+a.getAge());
        }
    }
}
