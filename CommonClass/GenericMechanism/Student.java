package CommonClass.GenericMechanism;

public class Student<T> {//泛型类可以有多个类型参数，负责占位，具体的数据类型为传入的数据类型为准
    private String name;
    private int age;
    private T sex;

    public Student() {
    }

    public Student(String name, int age, T sex) {
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

    public T getSex() {
        return sex;
    }

    public void setSex(T sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
