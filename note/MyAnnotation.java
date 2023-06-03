package note;

import java.lang.annotation.*;

//@Retention(RetentionPolicy.SOURCE)//表示该注解只在源代码中有效
@Retention(RetentionPolicy.RUNTIME)//以保留到程序运行的时候，它会被加载进入JVM中，所以程序运行时可以获取到它们
//@Retention(RetentionPolicy.CLASS)//重复的注解，表示这三个类型只能存在一个（注解只会被保留到编译进行的时候，它并不会被加载到JVM中，默认方式）
//没有任何一个成员变量的注解叫做标记注解/标识注解
@Documented//表示注解也可以被提取了
@Target({ElementType.TYPE, ElementType.CONSTRUCTOR, ElementType.FIELD, ElementType.METHOD})
//Target注解里加了哪些类型，哪些类型就可以使用此注解，没有的话就会报错，就不能贴标签
@Inherited//表示下面的注解修饰的类中的注解可以被子类继承
public @interface MyAnnotation {
    //    public Direction value();注解成员变量的类型有要求
    public String value() default "123";//声明一个String类型的变量，名字叫做value,default关键字表示默认的意思，意思就是标记的时候可以重写，也可以不重写带有default关键字修饰的成员变量

    public String value1();
}
