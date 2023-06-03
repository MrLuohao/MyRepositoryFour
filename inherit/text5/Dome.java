package inherit.text5;

/*
测试类
 */
public class Dome {
    public static void main(String[] args) {
        //采用无参构造方法
        teacher tch = new teacher();
        tch.setName("小华");
        tch.setAge(34);
        System.out.println("老师的名字叫：" + tch.getName() + "\n老师的年龄为：" + tch.getAge());
        System.out.print("老师的职责是：");
        tch.teach();
        student sd1 = new student();
        sd1.setName("小王");
        sd1.setAge(20);
        System.out.println("学生的名字叫：" + sd1.getName() + "\n学生的年龄为：" + sd1.getAge());
        System.out.print("学生的任务是：");
        sd1.study();
        System.out.println("-------------");
        //采用带参构造方法
        teacher tch1 = new teacher("小东", 40);
        student sd2 = new student("小穆", 22);
        System.out.println("老师的名字叫：" + tch1.getName() + "\n老师的年龄为：" + tch1.getAge());
        System.out.print("老师的职责是：");
        tch1.teach();
        System.out.println("学生的名字叫：" + sd2.getName() + "\n学生的年龄为：" + sd2.getAge());
        System.out.print("学生的任务是：");
        sd2.study();
    }
}
