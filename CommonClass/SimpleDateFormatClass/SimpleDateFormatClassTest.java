package CommonClass.SimpleDateFormatClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClassTest {
    public static void main(String[] args)throws Exception/*抛出异常*/ {
        //使用无参构造方法创建simpleDateFormat对象
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        System.out.println(simpleDateFormat);//输出的是对象的地址值
        //获取当前系统时间
        Date date = new Date();
        System.out.println("当前系统时间为：" + date);
        //根据指定参数来创建SimpleDateFormat对象,模式主要有 y-年 m-月 d-日 H-时 m-分 s-秒
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");//指定时间打印格式
        String format = simpleDateFormat1.format(date);//先创建一个获取当前时间的对象，然后创建一个时间打印格式的对象，最后把获取时间的对象当作参数传入时间打印格式的对象，就可以按格式打印获取的时间
        System.out.println("转换日期格式后的时间为："+format);
    }
}
