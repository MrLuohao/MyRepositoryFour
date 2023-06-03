package packagePractice;
//import object.animal;举例

/*
初始包 package

    包的概述和使用
       简述：其实就是文件夹
       作用：对类进行分类管理

    包的定义格式
       格式：package包名；（多级包用.分开）
       范例：package范例：package com.itheima；

    带包的Java类编译和执行
      自动建包：Java-d.HelloWord.java        java com.itheima.HelloWorld

    导包的概述和使用
    使用不同包下的类时，使用的时候要写类的全路径，写起来太麻烦了
    为了简化带包的操作，Java就提供了导包的功能

    导包的格式
      格式：import包名
      范例：importcn.itcast.Teacher

     修饰符
       修饰符分类：1.权限修饰符  2.状态修饰符

    权限修饰符
      修饰符      同一个类中        同一个包中子类无关类        不同包的子类         不同包的无关类
      private         ·
      默认            ·                      ·
    protected         ·                      ·                     ·
     public           ·                      ·                     ·                     ·

     final
      final关键字是最终的意思，可以修饰成员方法，成员变量，类

      final修饰的特点
      修饰方法：表明该方法是最终方法，不能被重写
      修饰变量：表明该变量是常量，不能再次被赋值
      修饰类：表明该类是最终类，不能被继承

      final修饰局部变量
      变量是基本类型：final修饰指的是基本类型的数据值不能发生改变
      变量是引用类型：final修饰指的是引用类型的地址值不能发生改变，但是地址里面的内容可以发生改变

      static
      static关键字是静态的意思，可以修饰成员方法，成员变量
      static修饰的特点
       1.被类的所有对象共享
           这也是我们判断是否使用静态关键字的条件
       2.可以通过类名调用
           当然，也可以通过对象名调用
           推荐使用类名调用

    static访问特点
     非静态的成员方法：
     1.能访问静态和非静态的成员变量
     2.能访问静态和非静态的成员方法
     静态的成员方法
     1.能访问静态的成员变量和成员方法
     2.不能访问非静态的成员变量和成员方法
     总结一句话：静态成员方法只能访问静态成员
 */
public class packageOverview {
}
