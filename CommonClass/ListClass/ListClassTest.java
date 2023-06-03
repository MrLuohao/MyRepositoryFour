package CommonClass.ListClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListClassTest {
    public static void main(String[] args) {
        //创建ArrayList集合
//        List list3 = new ArrayList();
        List list2 = new LinkedList();
        list2.add("爱");
        List list = new ArrayList(list2);//ArrayList带参构造方法里的参数可以传集合对象，相当于把参数集合中的内容传入新建集合中,参数内容不改变
        list.add("学习");
        List list3 = new ArrayList(list);
        System.out.println(list2);//
        System.out.println("list3=" + list3);
        //向集合中添加元素,查看源码可知，调用add方法添加元素时会给数组申请长度为10的一维数组，扩容原理是原始长度的1.5倍
        list.add("one");
        System.out.println("list=" + list);
        list.add("1");
        list.add("我");
        list.remove("我");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println("-----------------------------");
        /*
        LinkedList是双向链表进行数据管理的
        双向链表的意思就是从前往后，从后往前都可以访问
        Linkedlist集合的元素是不连续的，每个元素都是一个节点，节点里存放着元素内容以及连接的上一个和下一个元素的地址，第一个元素没有存放上一个的地址但有下一个元素的地址，因为第一个元素没有上一个元素，但是有下一个元素，而最后一个没有存放下一个元素的地址但是有上一个元素的地址，因为最后一个元素没有下一个元素，但是有上一个地址
        特点是增删方便，访问不方便，增删方便是因为元素之间彼此不连续，所以增删不会影响到其他元素，不需要大量元素往前往后移动，只需要改变以下地址连接即可
         */
        List list1 = new LinkedList();
        List list4 = new ArrayList();
        System.out.println(list1);
        System.out.println(list4);
        //给集合增加元素
        list1.add("wo爱");
        list4.add("wo爱");
        list1.add("xue习");
        list4.add("xue习");
        System.out.println(list1);
        System.out.println(list4);
        list1.addAll(list4);//往集合中添加指定参数集合中的所有内容
        System.out.println(list1);
        System.out.println(list4);
        //从集合中获取指定位置的元素
        System.out.println(list1.get(3));
        //查找参数指定对象在集合中对应的索引位置，返回int类型，没找到返回-1
        System.out.println(list1.indexOf("wo爱"));
        //反向查找指定参数在集合中对应的索引位置
        System.out.println(list1.lastIndexOf("xue习"));
        //将参数指定内容修改到集合中参数指定索引元素的位置（修改指定位置的元素）
        list1.set(1, "我想");
        System.out.println(list1);
        //删除参数指定位置的元素
        list1.remove(2);
        System.out.println(list1);
        //用于截取集合中参数指定范围的元素内容：包含起始元素不包含末尾元素
        System.out.println(list1.subList(1, 2));
        System.out.println("----------------------------------------");
        /**案例：准备一个stack集合，将数据11、22、33、44、55依次入栈并打印，然后查看栈顶元素并打印，然后将栈中所有数据依次出栈并打印
         *       再准备一个stack对象，将数据从第一个栈中取出来放入第二个栈中，然后再从第二个栈中取出并打印
         */
        Stack stack = new Stack();
        Stack stack1 = new Stack();
//        System.out.println(stack);
        for (int i = 1; i <= 5; i++) {
//            stack.push(i * 11);
            Object o = stack.push(i * 11);//push方法：用于把元素推到集合最顶部，并返回该元素
            System.out.println("入栈的元素有：" + o);
        }
        System.out.println("栈顶元素为：" + stack.peek());//peek方法：用于获取集合中最顶部的元素，但不删除
        System.out.println("stack=" + stack);
        int size = stack.size();
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            Object pop = stack.pop();//pop方法，用于把集合中最顶部的元素从集合中取出，并返回该元素，删除元素
            System.out.println("出栈的元素为：" + pop);
            stack1.push(pop);//将stack中出栈的元素放入stack1中，并将该元素推到集合最顶部
        }
        System.out.println("stack=" + stack);
        System.out.println("stack1=" + stack1);
        int size1 = stack1.size();
        for (int i = 0; i < size1; i++) {
            Object pop = stack1.pop();
            System.out.println("出栈的元素为：" + pop);
        }
        System.out.println("stack1=" + stack1);
        //stack集合中的元素出栈过后就代表该元素已经不存在与集合中了,pop方法和peek方法和push方法只使用于stack集合
    }
}
