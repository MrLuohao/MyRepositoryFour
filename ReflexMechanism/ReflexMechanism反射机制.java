package ReflexMechanism;

import javax.lang.model.element.TypeParameterElement;

public class ReflexMechanism反射机制 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取String类型的class对象，返回值为包名.类名（完全限定名）,自动调用toString方法
        System.out.println(String.class);
        //获取Integer类型的class对象
        System.out.println(Integer.class);
        //获取Boolean类型的class对象
        System.out.println(Boolean.class);
        //获取person类型的class对象
        System.out.println(person.class);
        //获取void类型的class对象
        System.out.println(void.class);
        System.out.println("--------------------");
        //使用引用对象.getClass()的方式来获取对应类型的class对象
        String s = new String();
        //获取String类型的class对象
        System.out.println(s.getClass());
        //获取Integer类型的class对象
        Integer integer = Integer.valueOf("1");
        System.out.println(integer.getClass());
        System.out.println("---------------------");
        //使用包装类.TYPE的方式获取对应基本数据类型的class对象
        System.out.println(Integer.TYPE);
        System.out.println(Boolean.TYPE);
        System.out.println(Byte.TYPE);
        System.out.println("---------------------");
        //使用class类中的forName方法来获取对应的class对象
        System.out.println(Class.forName("java.lang.String"));
        System.out.println(Class.forName("ReflexMechanism.ReflexMechanism反射机制"));
//        System.out.println(Class.forName("int"));不能获取基本数据类型的Class对象
    }
}
