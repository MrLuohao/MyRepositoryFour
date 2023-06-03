package note;

@MyType(value = "工人")
@MyType(value = "老师")//现在就不会报错了
//@MyType 报错：重复的注释。（在没有用@Repeatable修饰之前）
public class man {
}
