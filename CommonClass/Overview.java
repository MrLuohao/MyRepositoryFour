package CommonClass;

//包装类的意义在于把基本数据类型打包成类，再在类中重写或添加相关方法，从而实现通过类名调用类内部的方法实现各个类型之间的相互转换，更方便，更灵活，而且体现了万物皆对象的Java理念
public class Overview {
    /*
    常用的包：
       java.lang包，是Java语言的核心包，并且在该包中的所有内容由jvm虚拟机自动导入
       java.util包，是Java语言的工具包，里面提供了大量工具类以及集合类等
       java.io包是Java语言中的输入输出包，里面提供了大量读写文件相关的类等
       java.net包是Java的网络包，里面提供了大量网络编程相关的类等
       java.sql包是Java语言中的数据包，里面提供了大量操作数据库的类和接口

       Object类的概述
       1.java.lang.Object类是Java语言中层次结构的根类，也就是说任何一个类都是该类的直接或间接子类
       2.如果定义一个Java类时，没有使用extends关键字声明其父类，则默认继承自Object类
       3.Object类定义了“对象”的基本行为，被子类默认继承
       boolean equals(Object obj):  1.用于判断调用对象和参数对象是否相等
                                    2.该方法默认比较两对象地址是否相等，等同于==
                                    3.若希望比较两对象内容是否相同，则需要重写该方法
                                    4.若该方法被重写后，则应该重写hashCode方法来保证结果一致性
       int hashCode()：             1.用于获取调用对象的哈希码值（内存地址的编号）
                                    2.若两个对象调用equals方法相等，则各自调用该方法的结果必须相同
                                    3.若两个对象调用equals方法不相等，则各自调用该方法的结果应该不相同
                                    4.为了使得该方法与equals方法保持一致，需要重写该方法
       String toString()            1.用于获取调用对象的字符串形式
                                    2.该方法默认返回的字符串为：包名.类名.@哈希码值的十六进制
                                    3.为了返回更有意义的数据，需要重写该方法
                                    4.使用print或println打印引用或字符串拼接引用都会自动调用该方法
       Class<?>getClass()           用于返回调用对象执行时的Class实例，反射机制使用

       Integer类的概述
       1.基本概念：Java.lang.Integer类内部包装了一个int类型的变量作为成员变量，主要用于实现int类型的包装并提供int类型到String类之间的转换等方法
       2.常用的常量
          常量类型和名称                                             功能介绍
          public static fianl  int MAX_VALUE                        表示int类型可以描述的最大值，即2^31-1
          public static fianl  int MIN_VALUE                        表示int类型可以描述的最大值，即-2^31
          public static fianl  int SIZE                             表示int类型采用二进制补码形式的位数
          public static fianl  int BYTES                            表示int类型所占的字节个数
          public static fianl  int Class<Integer>TYPE               表示int类型的Class实例
       Integer类中常用的方法（测试类中测试）
       装箱和拆箱的概念
       Java5以前，使用包装类对象进行运算时，需要较为繁琐的“拆箱”和“装箱”操作；即运算前需要先将包装类对象拆分为基本类型数据，运算后再将结果封装成包装类对象
       从Java5开始增加了自动拆箱和自动装箱的功能
       自动装箱池
       在Integer类的内部提供了自动装箱池技术，将-128到127之间的整数已经装箱完毕，当程序中使用该范围之间的整数时，无需装箱直接取用自动装箱池中的数据即可，从而提高效率
       从int类型到Integer类型的转换，叫做装箱
       从Integer类型到int类型的转换，叫做拆箱

       Double类的概述
        double类型内部包装了一个double类型的变量作为成员变量，主要用于实现对double类型的包装并提供double类型到String类之间的转换等方法
        常用的常量public static final修饰int SIZE   表示double类型的二进制位数
        常用的常量public static final修饰int BYTES   表示double类型的字节个数
        常用的常量public static final修饰Class<double>TYPE   表示double类型的class实例
        常用方法见测试代码
        八个常见的基本数据类型都继承自Number类

        Boolean类的概述
        Boolean类型内部包装了一个Boolean类型的变量作为成员变量，主要用于实现对Boolean类型的包装并提供Boolean类型到String类之间的转换等方法
        常用的常量：FALSE,TRUE,Class<boolean>TYPE
        常用方法见测试代码

        Character类的概述
        Character类型内部包装了一个Char类型的变量作为成员变量，主要用于实现对Char类型的包装并提供字符类别的判断和转换等方法
        常用的常量：SIZE,BYTES,Class<Character>TYPE
        常用方法见测试代码

                                                包装类的使用总结
                                    1.基本数据类型转换为对应包装类的方式
                                      调用包装类的构造方法或静态方法即可：
                                      包装类名.ValueOf(赋值)
                                   2.获取包装类对象中基本数据类型变量数值的方式
                                     调用包装类中的  包装类对象的对象名.xxxValue方法即可   xxx指需要获取的基本数据类型的类型
                                   3.字符串转换为基本数据类型的方式
                                      调用包装类中的  包装类类名.parseXXX（）方法即可   XXX指将字符串类型的数据转换为的对应的数据类型

       数学处理类
       Math类的概述：该类主要用于提供执行数学运算的方法，如：对数，平方根
       常见方法见测试类   :该类中常用的方法基本基本都加了static关键字，意味着隶属于类层级，可以直接使用类名去调用

       BigDecimal类的概述
       由于float类型和double类型在运算时可能会有误差，若希望实现精确运算则借助Java.math.BigDecimal类型加以描述

      若需要表示比long类型范围还大的整数数据，则需要借助java.math.BigInteger类型描述

      String类的概述和使用
      1.java中所有的“字面值”（指常量）都可以使用该类的对象加以描述，如"abc"
      2.该类由final关键字修饰，表示该类不能被继承
      3.jdk1.9开始该类的底层采用byte[]加上编码标记，而非char[]来存储数据，因为byte占一个字节，char占两个字节，从而节省了一些空间
      4.该类描述的字符串内容是个常量不可更改，因此可以被共享
      private final byte[] value;   String类中有byte[] value成员变量，而该成员变量又被final修饰，且数组长度一旦定义不能修改，因此说明该成员变量是一个常量，不可修改
     5.常量池的概念（原理）
      由于String类型描述的字符串内容是常量不可以改变，因此Java虚拟机将首次出现的字符串放入常量池中，若后续代码中出现了相同的字符串内容则直接使用池中已有的字符串对象而无需申请内存以及创建对象，从而提高了性能
     6.String类的常用方法见测试代码

     StringBuilder类
     概述：1.String类型描述的字符串是常量不可以改变，如果Java中需要用到大量的类似的字符串是非常占空间的，而StringBuilder类型描述的字符串是可以改变的，就很好的解决了这个问题，避免了空间的浪费
          2.StringBuilder和StringBuffer的相同和不同：1.相同点：都是可变字符串，内容是可以改变的
                                                    2.不同点：StringBuffer类型是线程安全类，但是效率低。而StringBuilder类型是非线程安全性类，但是效率高
         3.效率高低排序：StringBuilder  >   StringBuffer  >   String
     ·StringBuilder很多方法的返回值均为StringBuilder类型，它们的返回语句均为：return  this;(this关键字，谁调用它它就指谁)

     System类的概述：Java.lang.System类中提供了一些有用的类字段和方法
     Date类的概述：Java.util.Date类主要用于描述特定的瞬间，也就是年月日时分秒，可以精确到毫秒
     常用方法见测试代码
     SimpleDateFormat:该类主要用于实现日期和文本之间的转换
     常用的方法见测试代码
     Calendar类的概述：该类主要用于描述特定的瞬间，取代Date类中的过时方法实现全球化
     ·该类是个     抽象类     ，因此不能实例化对象，其具体子类针对不同国家的日历系统，其中应用最广泛的是GregorianCalendar，对应世界上绝大多数国家/地区使用的标准日历系统
     常用的方法见测试代码
     1.面试题
      Calendar instance = Calendar.getInstance();
      Calendar是一个抽象类，为什么还能声明Calendar的引用呢？
      ·答：由源码可知，返回的并不是Calendar类型的对象，而是Calendar类子类GregorianCanlendar等对象，形成了多态

  多态的使用场合：
  ·通过方法的参数传递形成多态
    public static void draw（Shape s）{
    s.show();
    }
    draw(new Rect(1,2,3,4));
  ·在方法体中直接使用多态的语法格式
    Account acc =new FixedAccount();
   ·通过方法的返回值类型形成多态
   Calendar getInstance(){
    return new GregorianCalendar(zone,aLocale);
   }
      */
}
