package CommonClass.LocalDateTimeClass;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeClassTest {
    public static void main(String[] args) {
        //获取当前日期信息并打印
        LocalDate now = LocalDate.now();
        System.out.println("当前日期为：" + now);
        //获取当前时间并答应
        LocalTime now1 = LocalTime.now();
        System.out.println("当前时间为：" + now1);
        //获取当前日期时间信息(使用最多)
        LocalDateTime now2 = LocalDateTime.now();
        System.out.println("当前日期时间为：" + now2);
        //获取今天是本月的第几天
        System.out.println("今天是本月的第" + now2.getDayOfMonth() + "天");
        //使用参数指定的年月日时分秒信息来获取对象并打印
        LocalDateTime of = LocalDateTime.of(2023, 03, 01, 13, 18, 30);
        System.out.println("指定参数的时间信息为：" + of);//自动调用toString方法
        System.out.println("获取到的年份是：" + of.getYear());//获取当前年份
        System.out.println("今天是一年中的第" + of.getDayOfYear() + "天");//获取今天是该年份中的第几天
        /*SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s1 = s.format(of);//编译OK，运行报错，因为format（Date类型），而of是LocalDateTime类型的引用，所以类型不匹配，报错
        System.out.println(s1);*/
        System.out.println("获取到当前月份是：" + of.getMonth());//查源码可知返回值为Month类型，所以返回MARCH，获取当前月份（英文）
        System.out.println("获取到当前月份是：" + of.getMonthValue());//3，查源码可知返回值为int类型，获取当前月份数值，3
    }
}
