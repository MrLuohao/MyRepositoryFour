package object;
/*
封装：
  1.封装概述
      是面向对象三大特征之一（封装，继承，多态）
      是面向对象编程语言对客观世界的模拟，客观世界里成员变量都是隐藏在对象内部的，外界是无法直接操作的
  2.封装原则
      将类的某些信息隐藏在类内部，不允许外部程序直接访问，而是通过该类提供的方法来实现对隐藏信息的操作和访问
      成员变量private，提供对应的getXxx()和setXxx()方法
  3.封装好处
      通过方法来控制成员变量的操作，提高了代码的安全性（在方法中，是可以对数据进行安全检验的）
      把代码用方法进行封装，提高了代码的复用性
 */

/*
构造方法概述：
    构造方法是一种特殊的方法
    作用：创建对象
         格式：                                                  举例：
         public class 类名{                                      public class Book{
              修饰符 类名（参数）{                                     public Book(){
              }                                                        //构造方法内书写的内容}
         }                                                       }
    功能：主要是完成对象数据的初始化                             修饰符一般用：public
 */

/*
构造方法的注意事项：
   1.构造方法的创建
      如果没有定义构造方法，系统将给出一个默认的无参构造方法
      如果定义了构造方法，系统将不再提供默认的构造方法
   2.构造方法的重载
      如果自定义了带参构造方法，还要使用无参数构造方法，就必须再写一个无参数构造方法
   3.推荐的使用方式
      无论是否使用，都手工书写无参构造方法
 */

public class Book {
    private String brand;
    private int price;

    /* public Book(){
         System.out.println("无参构造方法！");
     }*/

//    有点类似于方法重载
    public Book(){}
    public Book(String brand) {
        this.brand = brand;
    }

    public Book(int price) {
        this.price = price;
    }

    public Book(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void show() {
        System.out.println("笔记本品牌:" + brand + "\n笔记本价格为：" + price);
    }
}
 /* public String getbrand() {
        return brand;
    }

    public void setbrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }*/
