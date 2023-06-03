package object;
/*
成员变量：类中方法外的变量
局部变量：方法中的变量

   成员变量和局部变量的区别：
               区别 ：               成员变量                                    局部变量
        类中的位置不同              类中方法外                   方法内或方法声明上（指定义方法时方法名后面的形式参数）
        内存中位置不同                 堆内存                                    栈内存
        生命周期不同           随着对象的存在而存在              随着方法的调用而存在，随着方法的调用完毕而消失
                               随着对象的消失而消失
        初始化不同             有默认的初始化值                  没有默认的初始化值，必须先定义，赋值，才能使用
 */

//封装：
               /*
               peivate关键字：
                     1.是一个权限修饰符
                     2.可以修饰成员即成员变量和成员方法
                     3.作用是保护成员不被别的类使用，被private修饰的成员只在本类中才能访问

              针对private修饰的成员变量，如果需要被其他类使用，提供相应的操作
                    1.提供“get变量名（）”方法，用于获取成员变量的值，方法用 public 修饰
                    2.提供“setget变量名（参数）”方法，用于设置成员变量的值，方法用 public 修饰
                */

public class Heima32 {
    public static void main(String[] args) {
       /* People a = new People();
        a.name="小明";
        a.age=21;
        a.show();
        //如果我这里输入的年龄为负数，显然是不符合实际的，所以就需要用private关键字对用户使用类进行限制和设置相应格式
        a.age=-21;//不符合实际
        a.show();*/
        People a = new People();//创建对象
        //此时我已经对相应的成员变量name以及age添加了private关键字
//        a.age=21;//此时再想给age赋值程序就会报错，所以此时就需要在People类中给成员变量age添加get和set方法
        a.setname("小明");
        a.setage(21);
        a.show();
//        a.setage(130);
        //使用get方法获取成员变量的值
        System.out.println("学生姓名为：" + a.getname() + "\n学生年龄为：" + a.getage());
        System.out.println("\n\n" + "以下是另一个测试:" + "\n\n");
        Heima33 s = new Heima33();
        s.setName("李华");
        s.setAge(33);
        s.setWeight(130);
        s.setHeight(180);
        System.out.println("学生姓名为：" + s.getName() + "\n学生年龄为：" + s.getAge() + "\n学生体重为：" + s.getWeight() + "\n学生身高为：" + s.getHeight());
    }
}
