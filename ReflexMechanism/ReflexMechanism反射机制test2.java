package ReflexMechanism;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/*
使用反射机制获取想得到的类中的成员变量
 */
public class ReflexMechanism反射机制test2 {
    public static void main(String[] args) throws Exception {
        person person = new person("小明", 23);
        System.out.println("获取到的person对象的年龄为：" + person.getAge());
        /*//获取单个成员变量的值,私有成员变量也可以获取到
        System.out.println(Class.forName("ReflexMechanism.person").getDeclaredField("age"));*/
        Class C = Class.forName("ReflexMechanism.person");
        Constructor constructor = C.getConstructor(String.class, int.class);
        Object o = constructor.newInstance("小明", 23);
        Field F = C.getDeclaredField("age");//因为person类中的成员变量age加了private关键字，所以这样是获取不到的，非法访问异常
        F.setAccessible(true);//设置Java语言访问检查的取消：暴力反射（加了这个暴力反射private关键字修饰的成员变量也可以访问到）
        System.out.println("反射机制获取到的person类对象的年龄为：" + F.get(o));
        System.out.println("----------------------------");
        //获取所有的成员变量的实现
        int i = 1;
        Class C1 = Class.forName("ReflexMechanism.person");
        Field[] declaredFields = C1.getDeclaredFields();
        for (Field field : declaredFields) {
            System.out.println("第" + (i++)+"个成员变量的名称为：" + field.getName());
            System.out.println("该成员变量的访问修饰符是：" + field.getModifiers());
            System.out.println("该成员变量的类型是：" + field.getType());
        }
    }
}
