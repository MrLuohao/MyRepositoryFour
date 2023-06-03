package JavaNewFeature.ElementFiltration;

import java.util.ArrayList;
import java.util.List;

/*
使用list集合实现元素的过滤
 */
public class ElementFiltration {
    public static void main(String[] args) {
        //创建一个list集合并将学生信息添加进集合中，再筛选集合中的成年人并将其装入另一个list集合中并打印出来
        List<person> Array = new ArrayList<>();
        List<person> Array1 = new ArrayList<>();
        Array.add(new person("小华", 23, "男"));
        Array.add(new person("小明", 22, "男"));
        Array.add(new person("小东", 26, "男"));
        Array.add(new person("小周", 25, "女"));
        Array.add(new person("小百", 13, "女"));
        Array.add(new person("小李", 15, "男"));
        for (person l : Array) {
            if (l.getAge() >= 18) {
                Array1.add(l);
            }
        }
        System.out.println("已成年的同学有：");
        for (person l : Array1) {
            System.out.println(l);
        }
    }
}
