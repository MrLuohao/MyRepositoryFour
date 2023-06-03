package CommonClass.ExceptionAndFileClass;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) throws AgeException /*throws表示可以抛出多个异常，但是必须跟在方法参数的后面*/{
        setAge(age);
        setName(name);
        /*this.name = name;
        this.age = age;*/
    }

  /*  public void show() throws ArithmeticException {
        int a = 12;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("发生了算术运算错误");
        }
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {
        if (age > 0 && age < 150) {
            this.age = age;
        } else {
//            System.out.println("你输入的年龄不合理，请重新输入！");
            throw new AgeException("年龄不合理!");//throw表示抛出一个异常，可以由开发者自行产生并抛出异常，但是要注意throw不能抛出非runtimeException，否则将报错!
        }
    }

   /* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }*/

    /*@Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }*/

    @Override
    public String toString() {//如果不重写toString方法默认打出来就是该对象在内存中的地址
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
