package practice;

import java.util.Scanner;

/*
案例：用户登录
 */
public class LoginCase {
    public static void main(String[] args) {
        String userName = "小明";
        String userpassword = "123456";
        for (int i = 2; i >= 0; i--) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你的用户名：");
            String name = sc.nextLine();
            System.out.println("请输入你的密码：");
            String password = sc.nextLine();
            if (userName.equals(name) && userpassword.equals(password)) {
                System.out.println("登陆成功！");
                break;
            } else if (i == 0) {
                System.out.println("您的账户已被安全锁定，请和管理员联系！");
            } else {
                System.out.println("用户名或密码错误，登陆失败，你还有" + i + "次机会。");
            }
        }
    }
}
