package enumerate;

/*
编程实现所有方向的枚举：向上、向下、向左、向右
 */
public class test1 {
    private final String direction;
    //创建好所有枚举对象并私有化
    public static final test1 UP = new test1("向上");//UP是test1创建的一个对象，对象里direction的值为UP
    public static final test1 DOWN = new test1("向下");
    public static final test1 LEFT = new test1("向左");
    public static final test1 RIGHT = new test1("向右");

    //私有化构造方法，此时构造方法只能在本类中使用
    private test1(String direction) {//有参构造方法
        this.direction = direction;
    }

    //通过公有的get方法可以在本类的外部访问该类成员变量的值
    public String getDirection() {
        return direction;
    }

}
