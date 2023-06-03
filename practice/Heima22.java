package practice;

public class Heima22 {
    /*
    案例：不死神兔

       需求：有一对兔子，从出生后第三个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
             假如兔子都不死，问第二十个月的兔子对数为多少？
     */
    public static void main(String[] args) {
        rabbit();
    }

    public static void rabbit() {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int x = 2; x < arr.length; x++) {
            arr[x] = arr[x - 2] + arr[x - 1];
        }
        System.out.println("第二十个月过后兔子的对数为：" + arr[19] + "只。");
    }
}