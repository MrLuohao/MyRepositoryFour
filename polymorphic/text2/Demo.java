package polymorphic.text2;

/*
测试类
 */
public class Demo {
    public static void main(String[] args) {
        animal s1 = new animal();//向上转型
        s1.setName("动物");
        s1.setAge(2);
        System.out.println("名字：" + s1.getName() + "\t\t年龄：" + s1.getAge());
        s1.eat();
        System.out.println("---------------");
        animal s = new cat();//向上转型
        s.setName("加菲猫");
        s.setAge(2);
        System.out.println("名字：" + s.getName() + "\t\t年龄：" + s.getAge());
        s.eat();
        System.out.println("---------------");
        animal s2 = new dog();//向上转型
        s2.setName("拉布拉多");
        s2.setAge(5);
        System.out.println("名字：" + s2.getName() + "\t\t年龄：" + s2.getAge());
        s2.eat();
        ((dog) s2).play();//这里s2是父类对象，而父类动物类里面没有play方法，所以要执行子类狗类里的play方法就必须向下转型，将父类型强转为子类狗类
        System.out.println("---------------");
        cat c = new cat();
        c.setName("加菲猫");
        c.setAge(2);
        System.out.println("名字：" + c.getName() + "\t\t年龄：" + c.getAge());
        c.eat();
        c.play();
        System.out.println("---------------");
        dog d = new dog();
        d.setName("拉布拉多");
        d.setAge(5);
        System.out.println("名字：" + d.getName() + "\t\t年龄：" + d.getAge());
        d.eat();
        d.play();
        System.out.println("---------------");
        animal s3 = new animal("狗", 5);//带参构造方法
        System.out.println("名字：" + s3.getName() + "\t\t年龄：" + s3.getAge());
        s3.eat();
        System.out.println("---------------");
        animal s4 = new cat("加菲猫", 2);//带参构造方法
        System.out.println("名字：" + s4.getName() + "\t\t年龄：" + s4.getAge());
        s4.eat();
        ((cat) s4).play();
        System.out.println("---------------");
        animal s5 = new dog("拉布拉多", 5);//带参构造方法
        System.out.println("名字：" + s5.getName() + "\t\t年龄：" + s5.getAge());
        s5.eat();
        ((dog) s5).play();
    }
}
