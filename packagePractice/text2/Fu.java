package packagePractice.text2;


public class Fu {
    private void show1() {
        System.out.println("private");
    }

    void show2() {
        System.out.println("默认");
    }

    protected void show3() {
        System.out.println("protected");
    }

    public void show4() {
        System.out.println("public");
    }

    public static void main(String[] args) {
        Fu s = new Fu();
        s.show1();
        s.show2();
        s.show3();
        s.show4();
    }
}
