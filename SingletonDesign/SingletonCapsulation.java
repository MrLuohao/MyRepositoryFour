package SingletonDesign;

/*

单例设计模式的实现流程
1.私有化构造方法，使用private关键字修饰。（目的是为了让外界不能随意的new对象）
2.声明本类类型的引用指向本类类型的对象，并使用private static关键字共同修饰（private关键字修饰的目的是为了私有化，让外界无法访问，static修饰的作用是将对象限制在本类之中，只能通过本类的调用访问，外界不能直接访问，static修饰的成员变量或者成员方法会在调用该类时自动分配内存，只有在调用本类时才会生效，更安全。在本类中创建对象的目的是为了限制用户随意的创建新对象，在本类中创建好对象，再提供get对象的方法返回给使用者即可）
3.提供共有的get方法负责将对象返回出去，并使用public static关键字共同修饰（使用public修饰的目的是为类外界能够使用到该方法，并成功将本类中创建好的对象返回给外界，static修饰的目的是为了将该方法限制在本类中，使得外界不能随意更改或者重写，使用时调用即可，更加安全）
案例：编程实现Singleton类的封装
      编程实现SingletonTest类对Singleton类进行测试，要求main方法中能得到且只能得到该类的一个对象
 */
public class SingletonCapsulation {
    private static SingletonCapsulation S1 = new SingletonCapsulation();
    //2.创建本类类型的引用指向本类类型的对象，并使用private static关键字修饰，让外界无法随意访问并且可以通过本类中的静态方法访问并返回给调用者（ 可以在本类中创建对象，因为private关键字修饰的成员变量或者成员方法可以在本类中引用）

    private SingletonCapsulation() {
    }//1.私有化构造方法，使得外界无法随意创建对象

    //3.提供公有的get方法负责将对象返回出去，使用public static关键字共同修饰
    public static SingletonCapsulation getInstance() {
        return S1;
    }

    public static void show() {
        System.out.println("单例设计模式。");
    }
}
