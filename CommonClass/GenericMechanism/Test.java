package CommonClass.GenericMechanism;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student<String> S = new man<String, Integer>();//类中添加了几类泛型，创建对象时就需要添加几类泛型
        S.setName("小华");
        S.setAge(20);
        S.setSex("男");
        System.out.println(S.toString());
        man man = new man();
        Integer[] arr = {19, 2, 33, 44, 55};
        man.printArray(arr);
        System.out.println("-----------------------");
        List<?> list = new LinkedList<>();//表示该集合中可以传入任意类型的参数
//        System.out.println(list.get(0));
//        list.add(new Animal());//不支持元素的添加操作
        List<Animal> list1 = new ArrayList<>();
        List<Cat> list2 = new LinkedList<>();
    }
}
