package StringBuilderPractice;

/*
StringBuilder概述：
  如果字符串进行拼接操作，每次拼接，都会构建一个新的String对象，既耗时，又浪费内存空间，而这种操作还不可避免。
  于是就通过java提供的StringBuilder类来解决这个问题
  1.StringBuilder是一个可变的字符序列，这里指StringBuilder对象中的内容是可以改变的（String类型一旦创建便不可改变），可以把它看成一个容器
  2.区别：String（创建便不可改变）StringBuilder(内容是可变的)******************
 */
public class overview {
    public static void main(String[] args) {
       /* StringBuilder构建方法
            public StringBuilder():创建一个空白可变字符对象，不含有任何内容
            public StringBuilder(String str):根据字符串的内容，来创建可变字符串对象    */
        StringBuilder s = new StringBuilder();//创建一个空白可变字符对象
        System.out.println("s：" + s);
        System.out.println("s.length():" + s.length());
        StringBuilder sb = new StringBuilder("hello");//根据字符串的内容，来创建可变字符串对象
        System.out.println("sb：" + sb);
        System.out.println("sb.length():" + sb.length());
       /* public StringBuilder append(任意类型)：添加数据，并返回对象本身
          public StringBuilder reverse():返回相反的字符序列        */
        s.append("hello");
        sb.append(",world");
        System.out.println("s:" + s);
        System.out.println("sb:" + sb);
        sb.append(",java");
        System.out.println("sb:" + sb);
        //因为append方法返回的是对象本身，所以对象就可以继续调方法，于是就可以写作：
        s.append(",word").append(",java").append(2131);//链式编程，后面可以无限添加，这样就不需要一个一个去添加,而且还不限数据类型，因为对象本身返回的值就是以字符串形式存在
        System.out.println("s:" + s);
        s.reverse();
        System.out.println("s:" + s);//返回s相反的字符序列

        /*StringBuilder和String相互转换
                1.StringBuilder转换为String
                     public String toString():通过toString()方法就可以实现将StringBuilder类型转换为String类型
                2.String转换为StringBuilder
                     public StringBuilder(String s):通过构造方法就可以实现将String类型转换为StringBuilder类型*/
        String str = "小明是一个好学生!";
        StringBuilder k = new StringBuilder(str);
        System.out.println("StringBuilder对象k为:" + k);
        StringBuilder line = new StringBuilder("小明是一个好学生！");
        String G=line.toString();
        System.out.println("String类型对象G为："+G);
    }
}
