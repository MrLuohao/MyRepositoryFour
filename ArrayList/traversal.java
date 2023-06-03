package ArrayList;

import java.util.ArrayList;

/*
案例：存储字符串并遍历

 需求：创建一个存储字符的集合，存储3个字符元素，使用程序实现在控制台遍历该集合
 */
public class traversal {
    public static void main(String[] args) {
        ArrayList<String> Array = new ArrayList<String>();
        Array.add("猴子");
        Array.add("老虎");
        Array.add("蛇");
//        遍历集合的通用格式：
        for (int i = 0; i < Array.size(); i++) {
            String s = Array.get(i);
            System.out.println(s);
        }
    }
}
