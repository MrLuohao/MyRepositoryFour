package CommonClass.MapGather;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        //1.准备一个Map集合并打印:java.utill.Map<K,V>
        Map<String, String> map = new HashMap<>();
        System.out.println("map=" + map);
        //map集合中添加元素并打印
        map.put("0", "我爱java");
        map.put("1", "我爱C语言");
        map.put("2", "我爱C++");
        map.put("3", "我爱Python");
        System.out.println("map=" + map);
        //修改map集合中Key为0的value
        String s = map.put("0", "我爱Hadoop");//V put(K Key,v value)将Key-value对存入Map，若集合中已经包含该Key,则替换该Key所对应的value，返回值为该Key原来所对应的value，若没有则返回null
        System.out.println(s);//返回原来Key值0对应的value“我爱Java”
        String s1 = map.put("4", "我爱Java");
        System.out.println(s1);//没有则返回null
        System.out.println("map=" + map);
        System.out.println("-------------------------------------");
        boolean b = map.containsKey("5");//判断该集合中是否存在参数指定的Key，有则返回true，没有返回false
        System.out.println(b);//false
        boolean b1 = map.containsKey("1");
        System.out.println(b1);//true
        boolean value = map.containsValue("我爱Java");//判断集合中是否存在参数指定的value值，有返回true，没有返回false
        System.out.println(value);
        String remove = map.remove("1");//根据参数指定的Key值删除 K Key，V value对值，并返回删除的value值
        System.out.println(remove);
        System.out.println(map);//查看是否删除成功
        System.out.println(map.containsKey(1));//Key值也对应删除
        map.put("1", "我爱C语言");
        System.out.println(map);//添加成功，并且是有序添加
        Set<String> strings = map.keySet();//返回此映射中包含的Key键Set视图
        System.out.println(strings);
        Collection<String> values = map.values();//返回此映射中包含的value值的Set视图
        System.out.println(values);
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);//返回此映射中包含的映射的Set视图
        String s2 = map.get("3");
        System.out.println(s2);//获取指定Key值对应的value值

    }
}
