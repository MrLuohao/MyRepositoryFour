package CommonClass.CollectionsClass;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(99);
        System.out.println(list);
        //根据元素的自然顺序返回给定集合的最大元素
        Integer max = Collections.max(list);
        System.out.println("list集合中的最大值为：" + max);
        Integer min = Collections.min(list);
        System.out.println("list集合中的最小值为：" + min);
        Collections.reverse(list);
        System.out.println(list);//反转指定字符串的顺序
        /*Collections.shuffle(list);//使用默认随机源随机置换指定的列表
        System.out.println(list);*/
        Collections.swap(list, 0, 3);//交换指定列表中指定位置的元素
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);//从小到大排序
        List<Integer> list1 = new LinkedList<>();
        list1.add(277);
        list1.add(65);
        list1.add(87);
        list1.add(977);
        Collections.copy(list, list1);
        System.out.println(list);
        System.out.println(list1);
        List<Integer> list2 = Arrays.asList(new Integer[10]);//asList将指定的数组转换为集合，toArray（）：将集合转换为数组
        Collections.copy(list2, list1);//将集合list1的元素拷贝到list2中
        System.out.println(list2);
        Object[] objects = list2.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}
