package practice;

public class Heima21 {
    /*
    案例：逢七过

        需求：朋友聚餐玩游戏，逢七过。为了帮大家更好的玩这个游戏，我们打印出1-100之间满足规则的数据
        规则：从任意一个数字开始报数，当你要报的数字包含七或者是七的倍数时都要说：过。
     */
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        for (int i = 1; i < 101; i++) {
            if (i % 7 == 0 || i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
