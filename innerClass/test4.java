package innerClass;

/*
回调模式：
   开发经验：1.当接口/类类型的引用作为方法的形参时，实参的传递方式有两种：
             2.自定义类实现接口/继承类并重写方法，然后创建该类对象作为实参传递
             3.使用上述匿名内部类的语法格式得到接口/类类型的引用即可
 */
public class test4 {
    public static void show(CallbackMode t) {
        t.show();
//        t.show1();
    }

    public static void main(String[] args) {
        /*CallbackMode C = new CallbackModeImpl();多态的方式
        test4 t = new test4();
        t.show(C);*/
        //为了方便调用show方法，这里采用static关键字修饰
//        test4.show(new CallbackMode());'CallbackMode' is abstract; cannot be instantiated接口不能实例化对象，因为是抽象类
        test4.show(new CallbackModeImpl());//所以通过多态的方式实现方法中参数为接口类的方法实现
        System.out.println("---------------------");
     /*   匿名内部类的语法格式（重点）*********
    ·接口/父类类型 引用变量名=new 接口/父类类型（）{方法的重写}；*/
        CallbackMode C = new CallbackMode() {//相当于省略了接口实现类的编写，而是在创建接口实现对象时直接重写接口类里的所有抽象方法
            @Override
            public void show() {
                System.out.println("这就是匿名内部类");
            }

           /* @Override
            public void show1() {
                System.out.println("接口类里的所有成员方法（抽象）必须全部重写");
            }*/
        };
        C.show();
//        C.show1();
        AAAA A = new AAAA() {
            @Override
            public void show() {
                System.out.println("AAAA");
            }
        };
        A.show();
        //从Java8开始提出新特性lamda表达式可以简化上述代码，格式为：（参数列表）->{方法体}
        CallbackMode C2 = () -> System.out.println("lamda表达式");
        test4.show(C2);
    }
}
