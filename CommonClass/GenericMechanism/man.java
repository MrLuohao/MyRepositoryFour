package CommonClass.GenericMechanism;

//public class man extends Student {//不保留父类的泛型且不指定泛型类型
//public class man extends Student<String> {//不保留父类的泛型，但是指定了父类的泛型类型
//public class man<T> extends Student<String> {//保留父类的泛型，并指定了父类泛型类型
public class man<T, L> extends Student<String> {//保留了父类的泛型并指定父类泛型类型，同时在子类中添加了自己的泛型L

    @Override
    public String toString() {
        return "名字为：" + getName() + "年龄为：" + getAge() + "性别为：" + getSex();
    }

    public static <T> void printArray(T[] arr) {//在静态方法中使用泛型参数的时候，需要我们把静态方法定义为泛型方法
        for (T t:arr){
            System.out.println("arr:"+t);
        }
    }
}
