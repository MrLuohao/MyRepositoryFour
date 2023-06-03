package CommonClass.CalendarClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/*
1.先获取Calendar类型的引用
2.为该引用设置参数时间
3.将Calendar类型用getTime方法转换为Date类型
4.创建设置打印格式的对象并设置格式，simpleDateFormat类型
5.用创建的打印格式的对象（simpleDateFormat类型）调用format方法，并将Calendar转换为Date类型的对象当作参数传入格式打印的对象中，再用String变量接收
6.打印该String类型的对象
 */
public class CalendarClassTest {
    public static void main(String[] args) {
        Date date = new Date(2023 - 1900, 3 - 1, 1, 11, 03, 20);//使用过时的方法获取当前系统时间
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println("系统当前时间为：" + date);
        System.out.println("格式转换后的时间为：" + format1);
        System.out.println("===================================");
        //获取Calendar类型的引用
        Calendar instance = Calendar.getInstance();
       /* Calendar是一个抽象类，为什么还能声明Calendar的引用呢？
      ·答：由源码可知，返回的并不是Calendar类型的对象，而是Calendar类子类GregorianCanlendar等对象，形成了多态*/
        //设置指定的年月日时分秒信息(推荐使用)
        instance.set(2023, 3 - 1, 01, 11, 03, 20);
        //转换为Date类型的对象
        Date time = instance.getTime();
        String format = simpleDateFormat1.format(time);
        System.out.println("获取到的时间为：" + format);
        System.out.println("===================================");
        //修改年份信息
        instance.set(Calendar.YEAR, 2025);
        time = instance.getTime();
        format = simpleDateFormat1.format(time);
        System.out.println("修改年份后的时间为：" + format);
        //修改月份信息
        instance.set(Calendar.MONTH, 5 - 1);
        time = instance.getTime();
        format = simpleDateFormat1.format(time);
        System.out.println("修改月份后的时间为：" + format);
    }
}
