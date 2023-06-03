package packagePractice.text4;

public class Demo {
    public static void main(String[] args) {
        Student.university = "清华大学";
        Student s1 = new Student();
        s1.name = "小华";
        s1.age = 21;
//        s1.university = "清华大学";
        s1.show();
        Student s2 = new Student();
        s2.name = "小王";
        s2.age = 22;
//        s2.university = "清华大学";
        s2.show();
    }
}
