package CommonClass.MapGather;

public class OverView {
    /*
    Map集合：
        Map集合中存取元素的基本单位是：单对元素，其中参数类型如下：
                 K-此映射所维护的键（Key）的类型，相当于目录
                 V-映射值（value）的类型，相当于内容
        1.该集合中Key是不允许重复的，而且一个Key只能对应一个value
        2.该集合的主要实现类有：HashMap类、TreeMap类、LinkedHashMap类、Hashtable类
          其中HashMap类的底层是采用哈希表进行数据管理的
          其中TreeMap类的底层是采用红黑树进行数据管理的
          其中LinkedHashMap类与HashMap类的不同之处在于内部维护了一个双向链表，链表中记录了元素的迭代顺序，也就是元素插入集合中的先后顺序，因此便于迭代
       3.Map集合是面向查询优化的数据结构，在大数据量的情况下有着优良的查询性能
       4.经常用于根据Key检索value的业务场景
       5.相当于Set集合当作Key
       常用方法见测试代码
       6.HashMap的默认容量是16
       7.threshold：扩容的临界值，该数值为：容量*填充因子，也就是12（扩容的目的是：让每个下标包含的元素尽可能的少，这样在访问的时候有机会减少比较次数，从而提供效率）
     */
}
