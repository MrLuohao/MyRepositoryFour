package beginningJava;

import java.util.Random;//导入生成随机数的Random包

/*
 * Random
 * 作用：用于产生一个随机数
 * 使用步骤：1：导包
 *            import java.util.Random；
 *            2：创建对象
 *            Random r = new Random();
 *            3:获取随机数
 *            int number = r.nextInt(10);
 *            获取数据的范围【0，10）包括0，不包括10
 * */
public class Heima1 {
    public static void main(String[] args) {
        Random r = new Random();//创建对象
        //随机获取10个数
        for (int i = 1; i <= 10; i++) {
            int number = r.nextInt(10);//获取随机数
            System.out.println(number);//输出随机数number
        }
        //获取一个0到100的随机数
        int x = r.nextInt(100) + 1;//或者int x =r.nextInt(101);
        System.out.println(x);
    }
}
