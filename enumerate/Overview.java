package enumerate;
/*
在日常生活中这些事物的取值只有明确的几个固定值，此时描述这些事物的所有值都可以一一列举出来，而这个列举出来的类型就叫做枚举类型
 1.Java5开始增加新特性，增加了一种引用数据类型。enum关键字来定义枚举类型
 2.枚举值就是当前类的类型，也就是指向本类的对象，默认使用public static final关键字共同修饰，因此采用枚举类型.的方式调用
 3.枚举类可以自定义构造方法，但是构造方法的修饰符必须是private，默认也是私有的

 Enum 类的概念和方法
 所有的枚举类都继承自 java.lang.Enum 类，常用方法如下：
  static T [] values ()   返回当前枚举类中的所有对象
  String toString ()    返回当前枚举类对象的名称
  int ordinal ()       获取枚举对象在枚举类中的索引位置
  static T valueOf ( String str )将参数指定的字符串名转为当前枚举类的对象
  int compareTo ( E o ) 比较两个枚举对象在定义时的顺序
 */
public class Overview {
}
