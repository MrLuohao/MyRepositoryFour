package note;

public class Overview {
    /*
    注解的本质就是一种标记，这些标记可以在类、编译阶段以及运行时执行指定的操作

    注解的语法格式：
       访问修饰符 @interface注解名称{
          注解成员；
       }
    通过@注解名称的方式可以修饰包、类、成员方法、成员变量、构造方法、参数、局部变量的声明等
    1.注解体中只有成员变量没有成员方法，而注解的成员变量以“无形参的方法”形式来声明，其方法名定义了该成员变量的名字，其返回值定义了该成员变量的类型
    2.如果注解中只有一个成员变量，推荐成员名为value，而类型只能八种基本数据类型、String类型、Class类型、enum类型以及Annotation类型

     元注解的概念：注解到注解上的注解
     元注解@Retention
     1.应用到一个注解上用于说明该注解的生命周期
       具体生命周期如下：RetentionPolicy.SOURCE注解只在源码阶段保留，编译器在编译时它将会被丢弃忽视
                         RetentionPolicy.CLASS注解只会被保留到编译进行的时候，它并不会被加载到JVM中，默认方式
                         RetentionPolicy.RUNTIME注解可以保留到程序运行的时候，它会被加载进入JVM中，所以程序运行时可以获取到它们
     元注解@Documented
     1.使用Javadoc工具可以从程序源代码中抽取类、方法、成员等注释形成一个和源代码配套的API帮助文档，而该工具抽取时默认不包括注解内容
     2.@Documented用于指定被该注解将被Javadoc工具提取成文档
     3.定义为@Documented的注解必须设置Retention值为RUNTIME（因为只有RUNTIME才会被加载到JVM中）

     元注解@Target
     用于指定被修饰的注解能用于哪些元素的修饰
     ElementType.FIELD:表示可以给属性进行注解（这里的属性表示成员变量）

     元注解@Inherited
     @Inherited并不是注解本身可以被继承，而是指如果超类的注解被该注解标记过时，超类的子类在没有任何注解的情况下，会默认继承超类（父类）的注解

     元注解@Repeatable
     ·@Repeatable表示自然可重复的含义，从Java8开始增加的新特性
     ·其中ElementType.TYPE_USE表示该注解能写在使用类型的任何语句中

     常见的预制注解：作者、版本、返回值说明、异常等
     @Deprecated用于表示所修饰的元素（类、方法等）已过时
     */
}
