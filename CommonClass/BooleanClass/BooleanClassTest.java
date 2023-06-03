package CommonClass.BooleanClass;

public class BooleanClassTest {
    public static void main(String[] args) {
        System.out.println("返回判断结果为false的对象：" + Boolean.FALSE);
        System.out.println("返回判断结果为true的对象：" + Boolean.TRUE);
        System.out.println("表示boolean类型的class实例：" + Boolean.TYPE);
        System.out.println("------------------------------------------");
        //通过构造方法的方式来创建Boolean类型的对象，已过时，不推荐使用
        boolean b = new Boolean(false);
        boolean b1 = new Boolean("true");//构建string类型的数据来创建Boolean类型的对象
        System.out.println(b1);
        System.out.println("------------------------------------------");
        //大Boolean是类层级，而小boolean是对象层级
        //小转大-->装箱
        Boolean b2 = Boolean.valueOf(false);
        System.out.println(b2);
        //大转小--》拆箱
        boolean b3 = b2.booleanValue();
        System.out.println(b3);
        System.out.println("------------------------------------------");
        //java5过后就提供了自动装箱拆箱功能
        Boolean b4 = b3;//小转大，装箱
        boolean b5 = b4;//大转小，拆箱
        System.out.println(b4 + "    " + b5);
        System.out.println("------------------------------------------");
        //实现从String类型到boolean类型的转换
        //底层的执行逻辑是   只要不是false或者true，那么结果就为false，不区分大小写
        boolean b6 = Boolean.valueOf("true");
        System.out.println(b6);//true
        boolean b7 = Boolean.valueOf("tyty");
        System.out.println(b7);//false
        boolean b8 = Boolean.valueOf("TrUE");
        System.out.println(b8);//true
    }
}
