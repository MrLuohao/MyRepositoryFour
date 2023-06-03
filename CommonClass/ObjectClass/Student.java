package CommonClass.ObjectClass;

//没有extends关键字修饰其他类，即没有明确指定继承某个类，所以默认继承自Object类，也就是同时也继承了Object里的所有成员方法
public class Student {
    private String name;
    private int id;

    public Student() {
    }

    public Student(String name, int age) {
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

    public void show() {
        System.out.println("该学生的姓名为：" + name + "\t该学生的学号为：" + id);
    }

    //为了比较的是里面的内容，这里我们重写equals方法
    @Override
    public boolean equals(Object obj) {//这里的参数我们不好确定传什么类型，就采用传Object类型的方式，因为万物皆对象
        //当调用对象和参数对象指向同一个对象时，则内容一定相同
        if (this == obj) return true;
        //当调用对象不为空而参数对象为空时，则内容一定不相同
        if (null == obj) return false;
        //先判断传进来的参数是否与比较参数是相同类型即Student类型，如果是，再进行其他判断，如果不是，没有可比性，则直接false
        if (obj instanceof Student) {
            Student st = (Student) obj;//此时obj是属于Object类型的对象，我们要向下转型（Student默认继承自Object，父转子）为Student类型才能继续做判断，并创建st作为接收对象
            return this.getName() == st.getName() && this.getId() == st.getId();
        }
        return false;
    }
    //为了使得该方法与equals方法的结果保持一致，从而满足Java官方的常规协定，重写了equals方法过后还需要重写hashCode方法

    @Override
    public int hashCode() {
        final int type = 12;
        return type * 31 + getName().hashCode();
    }

    //为了使toString方法打印出有用信息，我们在Student类中重写toString方法
    @Override
    public String toString() {
        String str1 = "该学生的姓名为：" + name + "\t该学生的学号为：" + id;
        return str1;
    }
}
