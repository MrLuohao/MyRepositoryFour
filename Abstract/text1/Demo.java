package Abstract.text1;

public class Demo {
    public static void main(String[] args) {
        //    animal s = new animal();//animal' is abstract; cannot be instantiated,animal是抽象类，不能被实例化
        animal s = new cat();//猫类重写了父类animal类中所有的抽象方法，所以猫类不是抽象类，可以实例化
//    animal s1 = new dog();狗类没有重写父类动物类所有的抽象方法，所以只能将狗类也定义为抽象类程序才不会报错，而抽象类不能实例化，所以狗类不能实例化
        s.eat();
        s.sleep();
    }
}
