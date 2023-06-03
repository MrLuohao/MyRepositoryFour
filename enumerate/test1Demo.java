package enumerate;

public class test1Demo {
    public static void main(String[] args) {
//        test1 t = new test1();test1(java.lang.String)' has private access in 'enumerate.test1报错：因为test1里的构造方法被private关键字修饰，所以外界不能创建对象
        test1 T1 = test1.UP;
        test1 T2 = test1.DOWN;
        test1 T3 = test1.LEFT;
        test1 T4 = test1.RIGHT;
        /*T1.setDirection("向前");final关键字修饰*/
        System.out.println("获取到的方向是：" + T1.getDirection());
        System.out.println("获取到的方向是：" + T2.getDirection());
        System.out.println("获取到的方向是：" + T3.getDirection());
        System.out.println("获取到的方向是：" + T4.getDirection());
    }
}
