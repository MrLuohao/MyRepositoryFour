package Static;

/*
1.带有继承的类创建父类对象指向子类引用时构造块的使用顺序：
先执行父类中静态构造块的内容，再执行子类中静态构造块的内容，再执行父类中非静态构造块的内容，再初始化父类构造方法，最后再执行子类中非静态构造块的内容，调用的方法内容最后执行
2.每创建一个对象都会执行一次构造块的内容
 */
public class OverviewText extends Overview {
    {
        System.out.println("子类非静态构造块的使用！");
    }

    static {
        System.out.println("子类静态构造块的使用！");
    }

    public void show() {
        System.out.println("构造块的使用！");
    }

    public static void main(String[] args) {
        Overview O1 = new OverviewText();
        ((OverviewText) O1).show();
    }
}
