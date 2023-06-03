package ReflexMechanism;

import java.lang.reflect.Method;

/*
利用反射机制获取成员方法的方式
 */
public class ReflexMechanism反射机制test3 {
    public static void main(String[] args) throws Exception {
        //获取单个成员方法并打印相关属性的方法
        //1.先调用Class.forName方法获取到想要得到的Class类型
        Class C = Class.forName("ReflexMechanism.person");
        //2.获取该Class对象类中名字和参数为参数指定内容的公共成员方法
        Method setName = C.getMethod("setName", String.class);
        //3.打印该方法的相关信息
        System.out.println("该成员方法的名称为：" + setName.getName());
        System.out.println("该成员方法的访问修饰符是：" + setName.getModifiers());
        System.out.println("该成员方法的返回值类型是：" + setName.getReturnType());
        System.out.println("----------------------------");
        //打印指定的Class类型中的所有成员方法
        int i = 1;
        //1.获取需要的Class类型对象
        Class C1 = Class.forName("ReflexMechanism.person");
        //调用getMethods方法获取该Class类型中的所有成员方法
        Method[] methods = C1.getMethods();
        //使用for each循环打印所有方法的相关信息
        for (Method m : methods) {
            System.out.println("第" + (i++) + "个成员方法的名称为：" + m.getName());
            System.out.println("该成员方法的访问修饰符是：" + m.getModifiers());
            System.out.println("该成员方法的返回值类型是：" + m.getReturnType());
            System.out.println("---------------");
        }
    }
}
