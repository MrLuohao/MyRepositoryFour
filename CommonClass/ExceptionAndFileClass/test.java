package CommonClass.ExceptionAndFileClass;

public class test {
    public static void main(String[] args) {
        Person person = null;
        try {//采用抛出异常的方式来处理不合理值的设置
            person = new Person("小明", -8);
        } catch (AgeException e) {
            e.printStackTrace();
        }
//        person.setAge(-23);
        System.out.println(person);
        try {
            Person person1 = new Student("小华", 21);
            System.out.println(person1);//这里并不会报错，因为构造的对象参数合理，所以不会报异常
        } catch (AgeException e) {
            e.printStackTrace();
        }
    }
}
