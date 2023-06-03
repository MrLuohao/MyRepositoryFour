package CommonClass.ExceptionAndFileClass;

public class Student extends Person {

    //    public static void show() throws Exception {//不允许子类重写的方法中抛出比父类更大的异常
//    public static void show() throws ClassNotFoundException {//不允许子类抛出和父类平级的异常
    /*public static void show() throws ArithmeticException {//可以抛出和父类一样的异常
        show();
    }*/
    /*@Override
    public void show() {//子类可以不抛出异常
        show();
    }*/

    public Student() {
    }

    public Student (String name, int age) throws AgeException{
        super(name, age);
    }

    /*public static void main(String[] args) {
        Person p = new Student();
        ((Student) p).show();
    }*/
}
