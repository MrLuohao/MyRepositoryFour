package CommonClass.GenericMechanism;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMechanismTest {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("1");
        list.add(1);
        list.add(1, 2);
        System.out.println(list);//此时集合里面的元素为Object类型，所以什么类型的元素都可以添加
        String s = (String) list.get(0);//我们为了取出里面真实的元素类型就必须做强转，这时就容易发生类型转换异常的错误
        //所以我们新增了泛型的概念
        List<String> list1 = new ArrayList<>();//泛型具有菱形特征，前面<>括号里面设置了数据类型，后面就可以不写了
//        list1.add(1);//因为规定了集合里面只能存放String类型的数据，而我们添加了int类型的数据，所以就出现了报错
        list1.add("1");//这时就不会报错了,但是该集合中就只能添加String类型的元素了
        list1.add("我");
        list1.add("爱");
        list1.add("学");
        list1.add("习");
        String s1 = list1.get(0);//这时默认返回值也是String类型而不再是Object类型了
        //采用for循环打印该集合元素
        for (String s2 : list1) {
            System.out.println("list1里面的元素有：" + s2);
        }
        System.out.println(list1);
//        List<int> list2 = new ArrayList<>();
//        List<String, Double> list2 = new ArrayList<>();报错，类型参数只能有一个且不能为基本数据类型
    }
}
