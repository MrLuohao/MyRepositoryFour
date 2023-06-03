package CommonClass.GatherClass;

public class Overview {
    /*
    1.当需要在Java程序中记录单个数据内容时，则声明一个变量
    2.当需要在Java程序中记录多个类型相同的数据内容时，声明一个一维数组
    3.当需要在Java程序中记录多个类型不同的数据内容时，则创建一个对象
    4.当需要在Java程序中记录多个类型相同的对象数据时，创建一个对象数组
    5.当需要在Java程序中记录多个类型不同的对象数据时，则准备一个集合

    集合的框架结构：
     1.Java中集合框架顶层框架时Java，util.Collection集合和Java.util.Map集合
     2.其中Collection集合中存取元素的基本单位是：单个元素
     3.其中Map集合中存取元素的基本单位是：单对元素
                                                 Collection接口                                                              Map接口
               list接口                                     Queue接口               set接口                   HashMap类         TreeMap类          Hashtable类
  ArrayList类  LinkedList类   Stack类    Vector类                           HashSet类     TreeSet类         LinkedHashMap类                        Properties类
                                                                          LinkedHashSet类
    因为Collection接口是List接口、Queue接口以及Set接口的父接口，因此该接口里定义的方法，List集合、Queue集合以及Set集合都可以使用

    Iterator接口
     该接口主要用于描述迭代器对象，可以遍历Collection集合中的所有元素
     Collection接口继承Iterator接口，因此所有实现Collection接口的实现类都可以使用该迭代器对象
     iterator迭代器相当于一个指针，存在于集合第一个元素的前一个位置，没获取一个元素，就指向下一个元素的位置（类似于：获取1元素的位置时迭代器在0，获取完1位置元素过后，迭代器+1，即由0指向1，获取的下一个元素就是第2个元素）
     常用的方法见测试代码
     */
}
