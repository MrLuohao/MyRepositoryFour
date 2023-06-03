package object;

public class BookDemo {
    public static void main(String[] args) {
        Book a = new Book();
        a.show();
        Book a1 = new Book("Huawei");
        a1.show();
        Book a2 = new Book(7999);
        a2.show();
        Book a3 = new Book("apple", 8999);
        a3.show();
    }
}
