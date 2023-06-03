package CommonClass.SetGather;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private String sex;

    public Student() {
    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        /*  return -1;*//*调用对象小于参数对象，排到前面*//*
//        return 1;//调用对象大于参数对象，排到后面
//        return 0;//调用对象相同，重复，不添加*/
//        return this.getName().compareTo(o.getName());//比较姓名
        return this.getAge() - o.getAge();//比较年龄
        /*int a = this.getName().compareTo(o.getName());
        return a != 0 ? a : this.getAge() - o.getAge();//如果姓名相同比较年龄，如果姓名不同比较姓名就行了*/
    }
}
