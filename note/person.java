package note;

@MyAnnotation(value = "hello", value1 = "word")//如果没有给默认值需要给值，并且类型要和注解中成员变量的类型相同，而且个数也要相同，每一个成员变量都要赋值
//@MyAnnotation(value1 = "word")也可以不重新给value给值，用默认的值
public class person {
    //    @MyAnnotation(value = "da", value1 = "22")Annotations are not allowed here该标记不能标注在这里
    /**
     * name是用于描述姓名的成员变量
     **/
    private String name;
    /**
     * age是用于描述年龄的成员变量
     **/
    private int age;

    /**
     * 构造无参构造方法
     **/
    public person() {
    }

    /**
     * 构造带参构造方法
     *
     * @param name
     * @param age
     */
    @MyAnnotation(value1 = "1")//修饰构造方法等
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 自定义成员方法用于设置成员特征的修改和获取
     *
     * @return
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 定义一个show方法用于打印该类对象的特征
     */
    @MyAnnotation(value1 = "hello")/*@MyAnnotation' not applicable to method报错，该注解不能标识成员方法，因为在MyAnnotation()注解中添加了@Target注解，限制了该标识能修饰的对象，从而限制了该标识对成员方法的注解，如果在@Target注解中添加一个可以标记成员方法的ElementType.METHOD即可*/
    @Deprecated
    public void show() {
        System.out.println("姓名为：" + name + "\n年龄为：" + age);
    }
}

