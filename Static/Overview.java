package Static;

/*
1.使用static关键字修饰的成员变量或者是成员方法，都隶属于类层级，可以直接使用类名.的方法直接调用，也就是整个类只有一份并被所有对象共享，该成员变量随着类的加载准备就绪，与是否创建对象无关
2.static关键字可以使用引用.的方式访问，但是推荐使用类名.的方式
 */
public class Overview {
    {
        //第二执行
        System.out.println("非静态构造块的使用！");
    }

    static {
        //最先执行
        System.out.println("静态构造块的使用！");
    }

    public Overview() {
        //最后执行
        System.out.println("构造块和静态构造块的使用！");
    }

    public static void main(String[] args) {
        Overview O1 = new Overview();
    }
}
