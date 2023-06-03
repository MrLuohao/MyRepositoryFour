package practice;
/*
String类型的练习：
   String在lang包下，所以不需要导包，直接调用即可

   String类代表字符串，Java程序中所有的双引号字符串，都是String类的对象

   特点：
       1.字符串不可变，它们的值在创建后不可以修改
       2.虽然String的值是不可以被修改的，但是它们是可以被共享的
       3.字符串的效果相当于字符数组(char[]),但是底层原理是字节数组（byte[]）

  ***********推荐使用直接赋值的方式给String类型赋值即String 变量名="";的方式

  字符串的比较：
  使用==做比较：
     基本类型比较的是数据值是否相同
     引用类型比较的是地址值是否相同
  字符串是对象，它比较内容是否相同，是通过一个方法来实现的，这个方法叫做：equals()
  public boolean equals(Object anObject)：将此字符串与指定的对象进行比较。由于我们比较的是字符串对象，所以参数直接传递一个字符串
 */
public class StringPractice {
    public static void main(String[] args) {
        //通过public String(){}方法来创建对象
        String s = new String();
        System.out.println("s:" + s);
        //通过public String（char[]chs）{}方法来创建对象
        char[] b = {'a', 'b', 'c'};//先定义一个char类型数组并初始化
        String a = new String(b);//再将该char类型数组赋值给创建的String对象a
        System.out.println("a:" + a);
        //通过public String（byte[]bys）{}方法来创建对象
        byte[] c = {97, 98, 99};//先定义一个byte类型的数组
        String d = new String(c);//再将该byte类型数组赋值给创建的String对象d
        System.out.println("d:" + d);//这里的输出结果为d:abc，因为在计算机底部97，98，99是通过byte数值存储，而这里我们接受的变量是String类型，而97，98，99在计算机底部对应的字符串就是abc，所以计算机在输出结果时就自动将数字转换成了字符串abc输出
        //直接赋值的方式String s="abc";
        String e="abc";
        System.out.println("e:"+e);
        /*
        String类型的特点：
           1.创建过后不能修改，否则将报错
           2.不能修改但是可以共享
         */
        String k ="llll";
//        k=llll;报错
        System.out.println(k);
          String p="kkkkk";
          String o=p;
          String r=p;
        System.out.println("p:"+p+"\no:"+o+"\nr:"+r);
        System.out.println(o==p);//true这里指的是地址相同并不是内容相同
        System.out.println(o==r);//true
         /*
        每次new一个String类型的对象JVM都会开辟一个新的空间，但是此处3个变量的内容是相同的，即它们是共享的堆内存里同一个地址的值
         */

         //public boolean equals(Object anObject)：通过此方法比较两个字符串类型内容是否相同
        String j ="adada";
        System.out.println(o.equals(r));//true,这里指的是字符串内容相同而不是地址值
        System.out.println(o.equals(j));//false
    }
}
