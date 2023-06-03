package Abstract.text2;

public class Demo {
    public static void main(String[] args) {
        animal s = new cat();
        s.setName("加菲猫");
        s.setAge(2);
        System.out.println("名字：" + s.getName() + "\t年龄:" + s.getAge());
        s.eat();
        System.out.println("----------------");
        animal s1 = new dog("拉布拉多", 5);
        System.out.println("名字：" + s1.getName() + "\t年龄：" + s1.getAge());
        s1.eat();
    }
}
