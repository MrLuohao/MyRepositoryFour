package SingletonDesign;

/*
这样设计的好处是更加安全，外界不能轻易随意访问内部类的成员变量或者成员方法或者对象，外界需要访问的内容用public关键字修饰过后返回即可
外界要想调用内部类中的对象需要自己声明一个该类类型的对象用于接收内部类返回的对象，但是内部类返回的外界不可更改，只能使用
相当于是在内部类中私有化想私有的对象，再在内部类中提供相应的get方法返回给外界，封装的意思
 */
public class SingletonCapsulationDemo {
    public static void main(String[] args) {
        //    SingletonCapsulation S1 = new SingletonCapsulation();
//    SingletonCapsulation S2 = new SingletonCapsulation();//不符合要求，要求只能得到一个对象，这里却可以创建无数个对象
//    SingletonCapsulation S1 = new SingletonCapsulation();//报错，因为SingletonCapsulation类中的构造方法加了private关键字修饰，外界无法访问
        SingletonCapsulation s1 = SingletonCapsulation.getInstance();//因为getInstance方法是static关键字修饰，隶属于类层级，所以可以直接类名.方法名的方式调用，调用getInstance方法过后返回的就是SingletonCapsulation类中创建的对象S1，并用s1接收
        SingletonCapsulation s2 = SingletonCapsulation.getInstance();//因为getInstance方法是static关键字修饰，隶属于类层级，所以可以直接类名.方法名的方式调用，调用getInstance方法过后返回的就是SingletonCapsulation类中创建的对象S1，并用s2接收
        System.out.println(s1 == s2);//说明此处的s1和s2指的是同一个对象，即是SingletonCapsulation类中创建的对象S1，说明外界创建且只能创建这一个对象
//        SingletonCapsulation.S1.show();//public修饰的话外界便可以直接调用
        s1.show();
    }
}
