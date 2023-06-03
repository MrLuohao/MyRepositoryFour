package polymorphic.text1;

//测试类
public class demo {
    public static void main(String[] args) {
        animal animal1 = new cat();//3.有父类引用指向子类对象
        animal animal2 = new dog();//向上转型
        animal1.eat();//编译看左边，执行看右边
        animal2.eat();
        System.out.println(animal1.age);//成员变量·编译看左边，执行看左边
        System.out.println((animal2).age);
        System.out.println(((cat) animal1).age);//强转访问子类成员变量
        System.out.println(((dog) animal2).age);
        System.out.println("-------------");
        cat c = new cat();
        dog d = new dog();
        animalOperator o = new animalOperator();
        o.Operator(c);
        o.Operator(d);
        c.catchTheMouse();
        d.lookDoor();
        cat c1 = (cat) animal1;//向下转型
        c1.catchTheMouse();
    }
}
