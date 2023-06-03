package practice;

public class Heima23 {
    /*
    案例：百钱百鸡

       规则：鸡翁一值五钱，鸡母一值三钱，鸡雏三值一钱。百钱买百鸡，问鸡翁，鸡母，鸡雏各几何？
     */
    public static void main(String[] args) {
        int cocksucker, chickenMother, chick;
        for (cocksucker = 0; cocksucker <= 20; cocksucker++) {
            for (chickenMother = 0; chickenMother <= 33; chickenMother++) {
                chick = 100 - cocksucker - chickenMother;
                if (chick % 3 == 0 && cocksucker * 5 + chickenMother * 3 + chick / 3 == 100) {
                    System.out.println("鸡翁：" + cocksucker + "鸡母：" + chickenMother + "鸡雏：" + chick);
                }
            }
        }
    }
}
