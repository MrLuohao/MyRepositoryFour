package CommonClass.ObjectClass;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 23);
        Student s2 = new Student("小明", 23);
        s1.show();
        s2.show();
        boolean b = s1 == s2;//比较地址，两个对象的地址不相同
        System.out.println(s1.equals(s2));//比较地址，两个对象的地址不相同
        System.out.println(b);
      /*  s1 = s2;//相当于把s2的地址值给了s1，而s2本身并没有改变，所以二者==比较地址值是否相等返回true
        System.out.println(s1 == s2);//true*/
      /*
      现在我们想比较的不是地址值，而是里面的内容，所以就需要重写equals方法
       */
        boolean b1 = s1.equals(s2);
        System.out.println("b1=" + b1);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        String str1 = s1.toString();
//        System.out.println("str1=" + str1);//该方法默认返回的字符串为：包名.类名.@哈希码值的十六进制
        System.out.println(str1);//重写了toString方法过后
        Student1 ss = new Student1();
        Student1 mm = new Student1();
        System.out.println(ss.hashCode());
        System.out.println(mm.hashCode());
    }
}
