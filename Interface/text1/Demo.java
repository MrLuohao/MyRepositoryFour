package Interface.text1;

public class Demo {
    public static void main(String[] args) {
//        Jumpping J3 = new Jumpping();该类是抽象类，不能实例化对象
        Jumpping j = new cat();
        j.jump();
     /*   Jumpping j1 = new dog();
        j1.jump();*/
    }
}