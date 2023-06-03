package Abstract.text1;

public abstract class city {
    private int age = 20;
    private final String city = "北京";

    public city() {
    }

    public city(int age) {
        this.age = age;
//        this.city = city;因为成员变量city加了final关键字，所以此处调用将报错
    }

    public void show() {
        age = 40;
        System.out.println(age);
//        city = "北京";因为成员变量city加了final关键字，所以此处修改city值的话将报错
        System.out.println(city);
    }

    public abstract void eat();
}
