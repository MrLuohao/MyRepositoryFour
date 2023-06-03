package StringBuilderPractice;

/*
案例：拼接字符串
 需求：定义一个方法，把int数组中的元素按照指定的格式拼接成一个字符串返回，调用方法，并在控制太台输出结果。
        例如，数组int []arr={1，2，3}；执行方法后的输出结果为：{1，2，3}
 */
public class joint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        StringBuilder line = new StringBuilder();
        line = joint(arr);
        System.out.println("line:" + line);
    }

    public static StringBuilder joint(int[] arr) {
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s.append(arr[i]);
            } else {
                s.append(arr[i]).append(",");
            }
        }
        s.append("]");
        return s;
    }
}
