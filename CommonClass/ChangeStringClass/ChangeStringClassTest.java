package CommonClass.ChangeStringClass;

public class ChangeStringClassTest {
    public static void main(String[] args) {
        //StringBuilder类：
        StringBuilder SB = new StringBuilder();//使用无参构造方法创建不指定容量的StringBuilderd对象（默认容量为16）
        StringBuilder SB1 = new StringBuilder(200);//使用带参构造方法创建指定容量的StringBuilder对象（容量为200）
        StringBuilder SB2 = new StringBuilder("好好学习，天天向上");//使用带参构造方法直接创建带有参数内容的StringBuilder对象，容量为16+字符串长度
        System.out.println(SB2);
        System.out.println("-----------------------------");
        //返回调用对象的容量
        System.out.println(SB2.capacity());//25(16+字符串长度)
        //返回调用对象的长度
        System.out.println(SB2.length());//9，字符串的长度
        System.out.println(SB2.insert(0, "我要"));//在SB2对象索引为0的位置插入字符“我要”，并返回SB2（可以在对象索引前面一个位置添加字符，前面两个位置的话就会引发空指针异常）
        System.out.println(SB2.insert(7, "我还要"));//在对象中间位置添加字符时，会把参数索引位置的字符往后移一位
        System.out.println(SB2.insert(14, "，加油!"));//可以在对象后面一个位置添加字符，后面两个位置添加的话就会引发空指针异常
        //追加字符串
        System.out.println(SB2.append("加油!"));//该方法添加的字符直接添加在对象最后索引的后一个位置（其实就是在最后面加字符）
        System.out.println(SB2.indexOf("我"));//0，查找在SB2中“我”第一次出现的位置
        System.out.println(SB2.deleteCharAt(0));//删除SB2中索引为0的字符，并返回SB2本身,只能删除单个字符
        System.out.println(SB2.indexOf("我", 0));//从SB2字符串的索引为0的位置开始检索字符“我”第一次出现的位置
        System.out.println(SB2.delete(0, 6));//删除指定索引范围内的字符串，包含初始值，不包含末尾值，即包含索引为0的元素，不包含索引为6的元素
        System.out.println(SB2.length());//14

        /*char c = SB2.charAt(13);
        char类型转换为String类型三种方式
          String s = "" + c;
          String s1 = Character.toString(c);
           String s = String.valueOf(c);*/

        //利用for循环删除元素，删除索引位置为6后面的元素
        for (int i = 1; i < 8; i++) {
            SB2.deleteCharAt(7);
        }
        System.out.println("删除后的字符为:" + SB2);
        StringBuilder SB3 = new StringBuilder("好好学习，天天向上");
        //删除索引为4后的所有元素
        System.out.println(SB3.delete(4, SB3.length()));//可以删除多个字符
        SB3.append(",天天向上");
        SB3.replace(4,9,",报效祖国");//替换指定范围内的内容，将参数内容替换进去
        System.out.println(SB3);
        System.out.println(SB3.reverse());//反转字符
    }
}
