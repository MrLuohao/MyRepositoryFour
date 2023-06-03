package CommonClass.StringClass;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Scanner;

//该类继承自Object类，表示该类同时也继承了Object类中的方法，查看API文档可知，其还重写了equals方法和hashCode方法
//String类中常用的方法基本都没有加static关键字修饰，说明隶属于对象层级，需要对象名.调用
public class StringClassTest {
    public static void main(String[] args) {
        /*
        这里str对象改变的只是地址的指向，创建的内容其实是一直存在在常量池中的，所以尽管str后来的值变成了abc，但是堆内存中对应的123并没有被改变，它依然存在于常量池中
         */
        String str = "123";
        str = "abc";
        System.out.println(str);
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);//true,证明了两个对象因为内容相同，所以用的是堆内存中同一块区域的内容，即123，从而证明了常量池的存在
        System.out.println(str == str1);//true
        System.out.println(str == str2);//true
        System.out.println("--------------------------------------");
        //常用的构造方法
        String str3 = new String();//使用无参构造对象得到空字符序列
        System.out.println("str3的值为" + str3);//输出结果为空白而不是null，因为是字符串类型而不是数值类型
        String str4 = "hello,world";
        System.out.println("str4的值为：" + str4);//自动调用toString方法
        //String(byte[]bytes,int offset,int length)方法，使用bytes数组中下标从offset位置开始的length个字节来构造对象
        byte[] arr = {97, 98, 99, 100, 101};//先创建byte类型的数组
        String str5 = new String(arr, 0, 4);//表示从数组arr的下标为o的位置开始，用arr里的元素构建长度为4的对象，并用String类型的变量str5接收
        System.out.println("str5的值为：" + str5);//abcd，ASCII码表，97，98，99，100，101自动转换为abcd
        String str6 = new String(arr);//String (byte[]bytes)，使用bytes数组中的所有内容构造对象
        System.out.println("str6的值为：" + str6);
//        String(char[]value,int offset,int count)方法，使用char数组中下标从offset位置开始的count个字节来构造对象
        char[] arr1 = {'g', 'o', 'o', 'd'};
        String str7 = new String(arr1, 0, 4);//表示从数组arr1中，下标从0开始，用arr1中的内容构建长度为4的对象，并用String类型的str7接收
        System.out.println("str7的值为：" + str7);
        String str8 = new String(arr1);//表示用char类型的数组arr1中的所有元素来构造对象
        System.out.println("str8的值为：" + str8);
        String str9 = new String("good  morning");//表示用参数指定值来构造对象
        System.out.println("str9的值为：" + str9);
        System.out.println("--------------------------------------");
        String a = "123";//一个对象，存放于常量池中
        String b = new String("123");//两个对象，一个在常量池中（首次创建的元素Java虚拟机会自动存放于常量池中，下次访问相同元素时，不用再继续申请内存，从而提高效率），一个在堆区（new）
        System.out.println(a == b);//false，因为在创建对象b的时候在堆区中new了一块新内存
        //常量有优化机制，而变量没有
        String string = "hello,world";
        //常量优化机制，自动拼接
        String string1 = "hello," + "world";//"运行hello," + "world"，jvm虚拟机判断二者拼接起来的结果就是hello，world，而string对象在创建时已经创建了hello，world存放于常量池中，所以运行时调用的是常量池中的hello，world
        System.out.println(string == string1);//true，所以二者的地址是相同的
        String string2 = "hello,";
        //string2属于变量，没有优化机制
        String string3 = string2 + "world";
        System.out.println(string3);//内容尽管相同
        System.out.println(string == string3);//地址是不相同的，因为string2+"world"时，string2指的是string2的地址，而不是常量池，也就是说常量池中并没有string2+“world”这个内容，所以就重新申请了一块内存
        System.out.println("--------------------------------------");
        //常用的成员方法
        System.out.println(string3.toString());//返回字符串本身
        byte[] arr2 = string3.getBytes();
        System.out.print("[");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(/*"下标为" + i + "的元素是：" + */(char) /*将int类型强制转为char类型*/arr2[i]);
        }
        System.out.print("]");
        //将byte类型的数组转换为String类型并打印
        String str10 = new String(arr2);
        System.out.println("\nstr10=" + str10);
        System.out.println("--------------------------------------");
        //将String类型转换为char类型的数组，存储并打印
        char[] arr3 = str10.toCharArray();
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        //将char类型的数组转换为String类型并打印
        String str11 = new String(arr3);
        System.out.println("str11=" + str11);
        System.out.println("--------------------------------------");
        String str12 = new String("hello,world");
        System.out.println(str12.length());//获取字符串序列的长度
        System.out.println(str12.charAt(5));//获取str12索引为5位置的字符
        System.out.println(str12.isEmpty());//用于判断字符串是否为空
        System.out.println(str12.length() == 0 ? "字符串为空字符串" : "字符串不为空");//也可以这样写
        /*int i9 = 1-Character.valueOf('0');
        System.out.println(i9);*/
        System.out.println("--------------------------------------");
        //使用两种方式实现字符串“12345”转换成为整数类型
        String str13 = new String("12345");
        //方式一
        Integer i = Integer.valueOf("12345");
        int i1 = i.intValue();
        System.out.println("整数i1的值为：" + i1);
        //方式二
        int i2 = Integer.parseInt("12345");
        System.out.println("整数i2的值为：" + i2);
        //方式三：利用ASCII码来打印,1->49
        int ib = 0;
        for (int ii = 0; ii < str13.length(); ii++) {
            ib = ib * 10 + (str13.charAt(ii) - '0');
        }
        System.out.println("转换出来的结果为：" + ib);
        System.out.println("--------------------------------------");
        //案例：判断字符串“上海自来水来自海上”是否为回文并打印
        String str14 = new String("上海自来水来自海上");
        for (int s = 0; s < str14.length() / 2; s++) {
            if (str14.charAt(s) != str14.charAt(str14.length() - s - 1)) {
                System.out.println("不是回文");
                return;//return  用于实现方法方法的结束
            }
        }
        System.out.println("是回文");
        //还可以这样写
        String str15 = new String("上海自来水来自海上");
        boolean b1 = true;
        for (int ss = 0; ss < str15.length() / 2; ss++) {
            if (str15.charAt(ss) != str15.charAt(str15.length() - 1 - ss)) b1 = false;
        }
        if (b1 = true) System.out.println("是回文");
        else System.out.println("不是回文");
        System.out.println("--------------------------------------");
        //int compareTo(String anotherString)用于比较调用对象和参数对象的大小关系（按字典顺序，即ASCII码表）  返回值为int类型，大多少就返回多少，小的话就是负数，相等就是0
        String str16 = new String("hello");
        System.out.println("str16=" + str16);
        //使用构造好的对象于其他字符串作比较
        System.out.println(str16.compareTo("hello"));//相等返回0
        System.out.println(str16.compareTo("Aello"));//第一个字母h在ASCII表中比A大39个字节，所以返回39
        System.out.println(str16.compareTo("helro"));//前面hel（前3位）是相等的，第四位l在ASCCI表中比r小6个字节，所以返回-6
        System.out.println(str16.compareTo("hell0"));//前面hell（前4位）是相等的，第四位o（111）在ASCCI表中比0（48）大63个字节，所以返回63
        System.out.println(str16.compareTo("helloo"));//前面hello（5位）是相等的，就比较字符串的长度，helloo比hello多出一位，所以返回-1
        System.out.println("--------------------------------------");
        String q1 = new String("你");
        String q2 = new String("好");
        System.out.println(q1.concat(q2));//用于实现字符串的拼接
        String q3 = new String("hello,world   ");
        System.out.println(q3.contains(",w"));//true用于判断当前字符串是否包含参数指定的内容,返回boolean类型的对象
        System.out.println(q3.toLowerCase());//用于返回字符串的小写形式
        System.out.println(q3.toUpperCase());//用于返回字符串的大写形式
        System.out.println(q3.trim());//返回去掉前后空白的字符串（开发中用于账户不小心输入空白字符引发报错的情况）
        System.out.println(q3.startsWith("h"));/*判断字符串是否以指定参数字符串开头*/
        System.out.println(q3.startsWith("he", 0));//判断从指定位置开始是否以参数字符串开头，这里的意思是判断q3字符串在位置为3的地方是不是以he开头,返回boolean类型
        System.out.println(q3.endsWith(" "));//判断字符串是否以参数指定字符串结尾，返回boolean类型
        System.out.println("--------------------------------------");
        String q4 = new String("World");
        String q5 = new String("world");
        System.out.println(q4.equals(q5));//比较内容（内容区分大小写）而非地址值，说明在String类的内部重写了继承的Object类中的equals方法，内容是不相同的相同返回false
        System.out.println(q4 == q5);//比较地址，new两个不同的对象，地址不同，返回false
        System.out.println(q4.hashCode());//返回调用对象的哈希码值
        System.out.println(q5.hashCode());//二者的哈希码值是不相同的，返回false说明在String类中重写了Object类中的equals方法，为了于equals方法结果保持一致，重写equals方法的同时也重写了hashCode方法
        System.out.println(q4.equalsIgnoreCase(q5));//比较二者字符串内容是否相等（不区分大小写），并返回，二者的内容不区分大小写的情况下是相等的，所以返回false
        System.out.println("--------------------------------------");
        //案例：提示用户从键盘输入用户名和密码信息，若输入admin和123456则提示登陆成功，欢迎使用，否则提示用户名或密码输入错误，您还有n次机会，若用户输入三次后依然错误则提示“账户已冻结，请联系客服人员！”
        /*Scanner sc = new Scanner(System.in);
        for (int i3 = 1; i3 <= 3; i3++) {
            System.out.println("请输入用户名：");
            String q6 = sc.nextLine();
            System.out.println("请输入密码：");
            String q7 = sc.nextLine();
            if (q6.equals("admin") && q7.equals("123456")) {
                System.out.println("登录成功，欢迎使用");
                break;
            } else if (3 - i3 != 0) System.out.println("用户名或密码输入错误，您还有" + (3 - i3) + "次机会");
            else System.out.println("账户已冻结，请联系客服人员！");
        }
        sc.close();//关闭扫描器*/
        String w = new String("I have a apple and two banana");
        System.out.println(w.indexOf('a'));//用于在字符串中检索参数返回其第一次出现的位置，若找不到就返回-1
        System.out.println(w.indexOf('b', 10));//用于从fromIndex的位置开始检索参数字符，返回其第一次出现的位置
        System.out.println(w.lastIndexOf('n'));//用于指定参数字符在字符串中最后一次出现的位置
        //打印字符串中所有a出现的位置
        int judge = w.indexOf("a");//字符a在字符串中第一次出现的位置
        System.out.print("字符a在该字符串中出现的位置有[");
        while (-1 != judge) {
            if (judge == w.lastIndexOf("a")) System.out.print(judge);//如果这是最后一个字符a，就不打印“,”号了
            else System.out.print(judge + ",");//否则打印a的位置加“，”号
            judge = w.indexOf("a", judge + 1);//相当于从这一次字符a出现位置的下一个位置开始检索
        }
        System.out.print("]这几个位置");
        System.out.println("\n----------------------------------");
        int pos = 0;
        System.out.print("字符an在该字符串中出现的位置有[");
        while (-1 != (pos = w.indexOf("an", pos))) {
            if (pos == w.lastIndexOf("an")) System.out.print(w.indexOf("an"));
            else System.out.print(pos + ",");
            pos += "an".length();
        }
        System.out.print("]这几个位置");
        System.out.println("\n2-18范围内的字符有：" + w.substring(2, 18));//打印字符串指定位置范围内的字符串内容
        System.out.println("从位置3开始到字符串结束的内容是：" + w.substring(3));//打印字符串指定开始位置到结束的字符串内容
        System.out.println("\n----------------------------------");
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String e = sc.nextLine();
        System.out.println("请输入一个字符：");
        String e1 = sc.nextLine();
        int judge1 = e.indexOf(e1);
        System.out.println("该字符后的字符串为：" + e.substring(judge1 + e1.length()));*/
        //使用字符串拼接过后的数据自动转换为String类型，推荐使用：
        int int1 = 89363783;
//        String d = int1;报错，类型不匹配
        String d = "" + int1;//不报错，并将int类型转换为了String类型
        System.out.println("字符串d为：" + d);
    }
}