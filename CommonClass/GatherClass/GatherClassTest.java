package CommonClass.GatherClass;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GatherClassTest {
    public static void main(String[] args) {
        ArrayList Array = new ArrayList();
        System.out.println("Array=" + Array);
        boolean b = Array.add("我");//集合中添加元素,返回Boolean类型的对象
        Array.add("爱");
        Array.add("学");
        Array.add("习");
        System.out.println("Array=" + Array);
        ArrayList Array1 = new ArrayList();
        Array1.add("爱");
        Array1.add("学");
        Array1.add("习");//一个一个放，每放的一个数据都是一个对象，判断是否存在的时候也是一个一个的判断，连起来判断就会返回false
        System.out.println("Array1=" + Array1);
        Array.addAll(Array1);//用于将参数指定集合中所有元素添加到当前集合中
        System.out.println("Array=" + Array);
        boolean b1 = Array.contains("爱学");//用于判断当前集合中是否包含指定参数的内容，返回Boolean类型
        System.out.println(b1);
        boolean b2 = Array.containsAll(Array1);//用于判断当前集合中是否包含参数指定集合中的所有对象，必须是所有对象都存在才返回true，否则都返回false
        System.out.println(b2);//true
        //保留当前集合中存在且参数集合中存在的所有对象（取交集）
        Array.retainAll(Array1);
        System.out.println(Array);
        Array.remove("爱");//删除集合中参数指定内容的单个元素
        System.out.println(Array);
        System.out.println(Array.isEmpty());//判断当前集合是否为空
        System.out.println(Array.hashCode());//获取当前集合的哈希码值
        Object[] objects = Array.toArray();//将当前集合转换为数组
        System.out.print("[");
        //打印数组内容
        for (int i = 0; i < objects.length; i++) {
            if (i != objects.length - 1) System.out.print(objects[i] + ",");
            else System.out.print(objects[i]);
        }
        System.out.print("]");
        System.out.println("\n" + objects);//打印的是该数组的地址
        System.out.println("-----------------");
        //创建集合
        ArrayList Array2 = new ArrayList();
        //创建person类的引用指向person类的对象
        person p = new person("小明", 21);
        System.out.println(p.toString());//调用重写过的toString方法输出对象p的内容，这里的int类型对象和String类型对象自动调用toString方法是因为在Character类中和Integer类中已经重写过toString方法了
        Array2.add(p);//将创建的类的对象放进集合
        System.out.println("Array2的内容为：" + Array2);
        Array2.add(1);//自动装箱机制，int 类型自动转换为Integer类型的对象
        Array2.add("上学");
        System.out.println("Array2的内容为：" + Array2);//多种不同类型都可以添加，打印集合的时候，本质上就是打印集合中的每一个对象，也就是调用对应类的toString方法
        Array2.addAll(Array);//将整个Array的内容放进Array2中
        System.out.println("Array2的内容为：" + Array2);
        System.out.println(Array);//Array集合中的对象还是存在，并没有因为把内容装进Array2中就消失
        System.out.println(Array2.contains(p));
        System.out.println(Array2.contains(Integer.valueOf(2)));
        /*
        System.out.println(Array2.contains(new person("小明", 21)));//没有重写equals方法之前，默认比较的是地址，因为new的是两个对象，所以地址不相等，返回false
         */
        System.out.println(Array2.contains(new person("小明", 21)));//true，重写equals方法过后返回true，因为此时二者比较的是内容
        System.out.println("===========================================");
        //笔试考点
        boolean b3 = Array2.contains(Array);//相当于把集合Array整体当作一个元素去判断，false
        boolean b4 = Array2.containsAll(Array);//相当于判断Array2中是否包含Array中的所有元素，把Array中的元素一个一个拿去比较，true
        System.out.println(b3);
        System.out.println(b4);
        System.out.println("===========================================");
        /*没有重写equals方法和hashCode方法时：
        Array2.remove(new person("小明",21));还是一样的，如果没有重写equals方法和hashCode方法，删除时就是去判断参数对象地址是否与集合中元素的地址相同，相同就删除成功，返回true，不相同就返回false，因为找不到该元素
        System.out.println("Array2的内容为：" + Array2);Array2的值不变*/
        //重写equals方法和hashCode方法过后比较的就是内容，所以能够找到该相同元素，返回true
        Array2.remove(new person("小明", 21));
        System.out.println("Array2的内容为：" + Array2);//元素被删除
        System.out.println(Array);
        //从集合Array2中删除Array的所有元素
        Array2.remove(Array);//把Array整体当作一个元素，所以在Array2中找不到该元素，所以false，没删除成功，Array2中的元素不变
        System.out.println(Array2);
        Array2.removeAll(Array);//删除Array中的所有元素，一个一个查找并删除，而不是当作一个整体，所以删除成功，返回true，Array2中元素改变
        System.out.println(Array2);
        Array2.add(Array);//把Array整体当作一个元素添加
        System.out.println(Array2);
        Array2.addAll(Array);//将集合Array中的元素一个一个添加到集合Array2中
        System.out.println(Array2);
        Array2.removeAll(Array);//将集合Array中的元素一个一个从集合Array中删除
        System.out.println(Array2);
        Array2.remove(Array);//把Array整体当作一个元素删除
        System.out.println(Array2);
        System.out.println("========================================");
        Array2.addAll(Array);
        Array2.add(Array);
        Object[] objects1 = Array2.toArray();//将集合转换成数组并打印
        System.out.print("[");
        //打印数组内容
        for (int i = 0; i < objects1.length; i++) {
            if (i != objects1.length - 1) System.out.print(objects1[i] + ",");
            else System.out.print(objects1[i]);
        }
        System.out.print("]");
        System.out.println("\n========================================");
        //Iterator接口的使用
        //1.获取该集合中的迭代器对象
        Iterator i = Array2.iterator();
        //2.判断是否有元素可以访问
        boolean b5 = i.hasNext();//true
        //3.取出一个元素并指向下一个
        Object o = i.next();//返回的是Object类型，说明存放的时候也是按Object类型存放的
        //这样一个一个取太麻烦，我们用循环做
        System.out.println("取出的元素为：" + o);
        System.out.println("取出的元素为：" + i.next());
        System.out.println("取出的元素为：" + i.next());
        System.out.println("取出的元素为：" + i.next());
        System.out.println("取出的元素为：" + i.next());
        System.out.println("取出的元素为：" + i.next());
        i = Array2.iterator();//由于刚刚迭代器已经跑过了几个元素了，所以我们需要重置迭代器
        for (int i1 = 0; i1 < Array2.size(); i1++) {
            if (i1 != Array2.size()) {
                System.out.println("取出的元素为：" + i.next());
            }
        }
        //重置迭代器
        i = Array2.iterator();
        System.out.println("-----------------");
        //采用while循环简单
        while (i.hasNext()) {
            System.out.println("取出的元素为：" + i.next());
        }
        System.out.println("=============================================");
        //案例：如何用迭代器的方式实现toString的效果
        //方式一
        System.out.println("重置迭代器i");
        i = Array2.iterator();
        System.out.print("[");
        while (i.hasNext()) {
            Object o1 = i.next();
            if (!i.hasNext()) System.out.print(o1);
            else System.out.print(o1 + ",");
        }
        System.out.print("]");
        //方式二
        System.out.println("\n重置迭代器i");
        i = Array2.iterator();

        StringBuilder builder = new StringBuilder();
        builder.append("[");
        while (i.hasNext()) {
            Object o2 = i.next();
            if (i.hasNext() == false) {
                builder.append(o2).append("]");
            } else {
                builder.append(o2).append(",");
            }
        }
        System.out.println(builder);
        System.out.println("--------------------------");
        //不断地获取集合中地元素并判断，当元素为“习”时则删除该元素
        i = Array2.iterator();
        while (i.hasNext()) {
            Object o1 = i.next();
            if ("学".equals(o1)) {
//                Array2.remove(o1);编译OK，执行报错ConcurrentModificationException，并发修改异常
                i.remove();
            }
        }
        System.out.println("删除元素后的Array2=" + Array2);
        System.out.println("---------------------------");
        /*for each循环：可以应用数组和集合的遍历
        语法格式：for(元素类型  变量名  ：数组/集合名称){
          循环体;
         }
         执行流程：不断地从数组/集合中取出一个元素赋值给变量名并执行循环体，直到取完所有元素为止
         */
        for (Object o1 : Array2) {
            System.out.println("取出来的元素是：" + o1);
        }
        int[] arr = {12, 3, 44, 34, 56, 78, 99, 999};
        for (int o1 : arr) {
            System.out.println("获取到的元素为：" + o1);
            o1 = 66;
        }
        System.out.println("数组中的元素有：" + Arrays.toString(arr));
    }
}
