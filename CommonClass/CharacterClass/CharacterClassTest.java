package CommonClass.CharacterClass;

import java.sql.SQLOutput;

public class CharacterClassTest {
    public static void main(String[] args) {
        System.out.println(Character.SIZE);//表示char类型的二进制位数
        System.out.println(Character.TYPE);//表示char类型表示的class实例
        System.out.println(Character.BYTES);//表示char类型表示的字节个数
        System.out.println("-----------------------------------------");
        Character c = new Character('h');//构造方法的形式创建Character类型的对象
        System.out.println("-----------------------------------------");
        Character c1 = Character.valueOf('h');//相当于从Character类型转为char类型，装箱
        char c2 = c1.charValue();//相当于从char类型转换为Character类型，拆箱
        System.out.println(c1 + "  " + c2);
        System.out.println("-----------------------------------------");
        //自动拆箱装箱
        Character c3 = c2;//装箱
        char c4 = c3;//拆箱
        System.out.println(c3 + "  " + c4);
        System.out.println("-----------------------------------------");
        Character c5 = Character.valueOf('A');
        Character c6 = Character.valueOf('a');
        Character c7 = Character.valueOf('1');
        //判断参数指定字符是否为大写字符
        boolean b = Character.isUpperCase(c5);//true判断参数指定字符是否为大写字符
        System.out.println("参数指定字符" + b + "大写字母");
        boolean b1 = Character.isUpperCase(c6);//true
        System.out.println("参数指定字符" + b1 + "大写字母");
        System.out.println("参数指定字符" + Character.isLowerCase(c6) + "小写字母");//true判断参数指定字符是否为小写字符
        System.out.println("参数指定字符" + Character.isDigit(c7) + "数字");//true判断参数指定字符是否为数字
        char c8 = Character.toLowerCase(c5);//将参数指定的字符转换为小写字符
        System.out.println("将" + c5 + "转换为小写字母后的结果结为" + c8);
        System.out.println("将" + c6 + "转换为大写字母后的结果结为" + Character.toUpperCase(c6));//将参数指定的字符转换为大写字符
        System.out.println("-----------------------------------------");
        /*
        包装类的使用总结
         */
        int i = Integer.parseInt("456");//相当于通过调用包装类Integer中的parseInt方法将字符串类型的456转换为int类型的456，并用变量i保存起来
        Integer i1 = Integer.valueOf(i);//相当于通过Integer类中的valueOf方法把int类型中的变量i中的数值456转换成Intger包装类类型的456，并用变量i1保存起来，过程相当于装箱
        int i2 = i1.intValue();//相当于通过Integer类中的intvalue方法把Integer类型中i1的值456以int类型的方式获取出来，并用变量i2保存起来，过程相当于拆箱
        System.out.println(i + "  " + i1 + "  " + i2);//以上同理
        double d = Double.parseDouble("233.4");
        Double d1 = Double.valueOf(d);
        double d2 = d1.doubleValue();
        System.out.println(d + "  " + d1 + "  " + d2);
        boolean b2 = Boolean.parseBoolean("false");
        Boolean b3 = Boolean.valueOf(b2);
        boolean b4 = b3.booleanValue();
        System.out.println(b2 + "  " + b3 + "  " + b4);

    }
}
