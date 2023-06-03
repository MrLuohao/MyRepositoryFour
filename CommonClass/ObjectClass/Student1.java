package CommonClass.ObjectClass;

import java.util.Objects;

public class Student1 {
    private String name;
    private int id;

    public Student1() {
    }

    public Student1(String name, int age) {
        this.name = name;
        this.id = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int age) {
        this.id = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student1 student1 = (Student1) o;
        return getId() == student1.getId() &&
                Objects.equals(getName(), student1.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
