package JavaNewFeature.ElementFiltration;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*
Stream流实现集合元素的过滤和打印
 */
public class ElementFiltration2 {
    public static void main(String[] args) {
        List<person> Array = new ArrayList<>();
        Array.add(new person("小华", 23, "男"));
        Array.add(new person("小明", 22, "男"));
        Array.add(new person("小东", 26, "男"));
        Array.add(new person("小周", 25, "女"));
        Array.add(new person("小百", 13, "女"));
        Array.add(new person("小李", 15, "男"));
        Array.stream().filter(new Predicate<person>() {
            @Override
            public boolean test(person person) {
                return person.getAge() >= 18;
            }
        }).forEach(new Consumer<person>() {
            @Override
            public void accept(person person) {
                System.out.println(person);
            }
        });
        System.out.println("--------------------------");
        //使用lambda表达式进行优化
//        Array.stream().filter(person -> person.getAge() >= 18).forEach(person -> System.out.println(person));
        Array.stream().filter(person -> person.getAge() >= 18).forEach(System.out::println);
    }
}
