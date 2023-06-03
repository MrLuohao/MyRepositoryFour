package CommonClass.QueueClass;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClassTest {
    public static void main(String[] args) {
        //创建LinkedList作为Queue集合的实现类测试方法代码
        Queue l = new LinkedList();
        //将一个对象添加至队尾，若添加成功则返回true(boolean类型)
        boolean b = l.offer("我爱学习");
        System.out.println(b);
        System.out.println(l);
        l.add("好好学习");
        l.add("天天向上");
        System.out.println(l);
        l.offer("加油");
        System.out.println(l);
        //从队首删除并返回一个元素
        System.out.println(l.poll());
        System.out.println(l);
        //返回队首的元素（但不删除）
        System.out.println(l.peek());
        System.out.println("------------------------------");
        //题目案例：准备一个Queue集合，将数据11、22、33、44、55依次入队并打印，然后查看队首元素并打印，然后将队列中所有数据依次出队并打印
        Queue l1 = new LinkedList();//1.创建Queue类型的集合
        for (int i = 1; i <= 5; i++) {
            l1.offer(i * 11);//2.for循环将11、22、33、44、55依次入队
            System.out.println("入队的元素为：" + i * 11);//3.打印出入队元素
        }
        System.out.println("l1=" + l1);//4.打印集合查看是否入队成功
        System.out.println("Queue类型的集合l1的队首元素为：" + l1.peek());//5.查看集合队首元素（不删除）
        int size = l1.size();
        for (int i = 0; i < size; i++) {
            System.out.println("出队元素为：" + l1.poll());////6.利用for循环依次出队（删除）
        }
        System.out.println("l1=" + l1);//7.打印集合，查看是否出队成功
    }
}
