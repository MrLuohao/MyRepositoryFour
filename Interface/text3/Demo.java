package Interface.text3;

//测试类
public class Demo {
    public static void main(String[] args) {
        Jumpping j = new animal("加菲猫", 4);
        System.out.println("名字：" + ((animal) j).getName() + "\n年龄：" + ((animal) j).getAge());
        j.jump();
        ((animal) j).eat();
        System.out.println("-----------------");
        animal s = new cat();
        s.setName("橘猫");
        s.setAge(3);
        System.out.println("名字：" + s.getName() + "\n年龄：" + s.getAge());
        s.jump();
        s.eat();
        System.out.println("-----------------");
        animal s1 = new dog();
        s1.setName("拉布拉多");
        s1.setAge(5);
        System.out.println("名字：" + s1.getName() + "\n年龄：" + s1.getAge());
        s1.jump();
        s1.eat();
        System.out.println("-----------------");
        animal s2 = new dog("金毛", 6);
        System.out.println("名字：" + s2.getName() + "\n年龄：" + s2.getAge());
        s2.jump();
        s2.eat();
    }
}
