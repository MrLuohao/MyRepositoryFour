package inherit.text3;

//父类中私有方法不能被重写，也不能被调用
public class Zi extends Fu {
/*    @Override
    public void show() {
        System.out.println("Zi中show方法被调用");
    }*/

    //    @Override
//    权限低于父类将会报错
   /* private void method() {
        System.out.println("Zi中method方法被调用");
    }*/
    void method() {
        System.out.println("Zi中method方法被调用");
    }
}
