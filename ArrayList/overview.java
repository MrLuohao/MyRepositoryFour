package ArrayList;

import java.util.ArrayList;//util包下，使用需要导包

/*
集合概述：
  编程的时候如果我们要存储多个数据，使用长度固定的数组存储格式，不一定满足我们的需求，更适应不了变化的需求，这时我们就选择集合

集合类的特点：提供一种存储空间可变的存储模型，存储的数据容量可以发生改变
集合类有很多，我们先学习一个ArrayList

ArrayList<E>:
            1.可调整大小的数组实现
            2.<E>：是一种特殊的数据类型，泛型
        如何使用？
            在出现E的地方我们使用引用数据类型替换即可
            举例：ArrayList<String>,ArrayList<Student>

ArrayList构造方法和添加方法：
public ArrayList():创建一个空的集合对象
public boolean add(E e)：将指定的元素追加到此集合的末尾
public void add(int index,E element)：在此集合中的指定位置插入指定的元素

ArrayList集合常用方法：
public boolean remove(Object o)：删除指定的元素，返回删除是否成功
public E remove(int index):删除指定索引处的元素，返回被删除的元素
public E set(int index,E element):修改指定索引处的元素，返回被修改的元素
public E get(int index):返回指定索引处的元素
public int size()：返回集合中元素的个数
 */
public class overview {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();//创建一个String类型的集合
        System.out.println("array:" + array);
        array.add("小明");//将指定元素“小明”插入到集合末尾
        System.out.println("array:" + array);
        array.add("小张");
        array.add("小王");
        System.out.println("array:"+array);//输出的元素之间系统会自动用逗号隔开
        array.add(1,"小罗");//在集合中指定的索引处插入指定的元素（在索引为1处插入元素“小罗”）
        System.out.println("array:"+array);
        array.add(4,"小天");
        System.out.println("array:"+array);
       /* array.add(6,"小天");//可以在集合最后一个索引后面添加比集合长度大一的索引并添加指定元素，如果大二则会报索引越界的错误
        System.out.println("array:"+array);*/

        System.out.println(array.remove("小明"));//删除集合中内容为"小明"的元素,并返回是否删除成功（true）
        System.out.println(array.remove("大王"));//因为集合中没有内容为"大王"的元素，所以删除失败，返回false
        System.out.println(array.remove("小天"));
        System.out.println("array:"+array);

        System.out.println(array.remove(2));//删除集合中索引为0处的元素，并返回被删除的元素
//        System.out.println(array.remove(4));//删除指定索引如果在集合中不存在就会报索引越界的错
        System.out.println("array:"+array);

        System.out.println(array.set(0,"小何"));//修改集合中索引为0处的元素，并返回被修改的元素
//        System.out.println(array.set(4,"小何"));//修改的指定索引如果在集合中不存在，就会报索引越界的错
        System.out.println("array:"+array);

        System.out.println(array.get(1));//返回(获取)集合中索引为1处的元素值
//        System.out.println(array.get(4));//返回（获取）的指定索引如果在集合中不存在，就会报索引越界的错
        System.out.println(array.size());//返回（获取）集合中元素的个数
    }
}
