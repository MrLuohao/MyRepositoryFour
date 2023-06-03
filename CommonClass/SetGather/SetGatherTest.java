package CommonClass.SetGather;

import java.util.*;

public class SetGatherTest {
    public static void main(String[] args) {
        //案例：准备一个Set集合指向HashSet对象，向该集合中添加元素“two”并打印，再向集合中添加元素“one”并打印，再向集合中添加元素“three”并打印，再向集合中添加“one”并打印
//        Set<String> s = new HashSet();（没有顺序）//Set集合是一个接口，接口不能实例化对象，所以要想实例化对象就只有父类引用指向子类对象形成多态，也可以采用匿名内部类的方式来创建Set接口的引用
        Set<String> s = new LinkedHashSet<>();//此时有顺序了
        s.add("two");
        System.out.println("s=" + s);
        s.add("one");
        System.out.println("s=" + s);
        s.add("three");
        System.out.println("s=" + s);
        boolean one = s.add("one");
        System.out.println(one);//false，验证了元素不能重复
        System.out.println("s=" + s);
        System.out.println("-----------------------------------");
        //Set集合的二叉树元素的比较排序
        //创建集合
        Set<String> set = new TreeSet<>();
        System.out.println("set:" + set);
        //向集合中添加元素并打印
        set.add("aa");
        System.out.println("set:" + set);
        set.add("cc");
        System.out.println("set:" + set);
        set.add("bb");
        System.out.println("set:" + set);//自动调用了toString方法，而toString实现了compara接口，自然排序
        System.out.println("----------------------------------");
        Set<Student> set1 = new TreeSet<>();
        set1.add(new Student("小华", 21, "男"));
        set1.add(new Student("小罗", 20, "男"));
        set1.add(new Student("小李", 23, "女"));
        set1.add(new Student("小李", 27, "女"));
        System.out.println("set1:" + set1);
        System.out.println("----------------------------------");
        //自定义比较器比较
        Comparator<Student> C = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();//按照年龄比较
//                return o1.getName().compareTo(o2.getName());//按照姓名比较
                int i = o1.getName().compareTo(o2.getName());//姓名相同比较年龄，姓名不同直接比较姓名
                return i != 0 ? i : o1.getAge() - o2.getAge();
            }
        };
        //lambda表达式：（参数列表）->{方法体}
        Comparator<Student> C1 = (Student o1, Student o2) -> {
            return o1.getAge() - o2.getAge();
        };//可以创建多个比较器，调用的时候要用哪一个直接传那一个比较器的名称即可
        Set<Student> set2 = new TreeSet<>(C);
        set2.add(new Student("小华", 21, "男"));
        set2.add(new Student("小罗", 20, "男"));
        set2.add(new Student("小李", 23, "女"));
        set2.add(new Student("小李", 27, "女"));
        System.out.println("set2:" + set2);//比较器优先执行于自然排序
    }
}
