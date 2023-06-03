package CommonClass.DateClass;

import java.util.Date;

public class DateClassTest {
    public static void main(String[] args) {
        //static long currentTimeMillis()
        long l = System.currentTimeMillis();
        System.out.println("当前系统时间距离1970年1月1日0时0分0秒已经过去" + l + "毫秒了！");//企业开发中我们可以用这个方法来创建订单号之类的，还可以用于测试一段代码的执行效率
        System.out.println("-------------------------");
        //采用无参构造方法创建对象，也就是当前系统的时间
        Date date = new Date();
        System.out.println(date);
        //根据指定毫秒数构造对象，参数距离1970年1月1日0时0分0秒的毫秒数,一秒等于1000毫秒
        int i = 1000;
        Date date1 = new Date(i);//参数也可以直接传具体时间，
        System.out.println("距离1970年1月1日0时0分0秒过去" + i + "毫秒数的时间为：" + date1);//1970 1 1 8 0 1：8小时为时差，我们属于东8区
        long time = date1.getTime();//获取对象距离1970年1月1日0时0分0秒的毫秒数
        System.out.println(date1 + "距离1970年1月1日0时0分0秒以及过去了" + time + "毫秒了");
        date1.setTime(2000);//设置调用对象所表示的时间点为参数指定的毫秒数
        System.out.println( "修改后的时间为："+date1);//由原来的1秒变成了2秒，因为参数传了2000.一秒等于1000毫秒
    }
}
