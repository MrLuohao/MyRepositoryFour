package beginningJava;

public class Heima9 {
    /*
    方法的定义：
                格式：public static void 方法名(){
                          方法体
                       }
                范例：public static void isEvenNumber(){
                          方法体
                       }
     方法的调用：
                格式：方法名（）；
                范例：isEvenNumber();
     */
    public static void main(String[] args) {
        //实现功能：定义一个用于判断偶数的方法
        isEvenNumber();
        //实现功能：定义一个判断两个数谁大的方法
        getMax();
    }

    public static void isEvenNumber() {
        int number = 11;
        if (number % 2 == 0) {
            System.out.println(number + "是偶数");
        } else {
            System.out.println(number + "不是偶数");
        }
    }

    public static void getMax() {
        int A = 67;
        int B = 89;
        System.out.println(A > B ? "A大" : "B大");
    }
}
