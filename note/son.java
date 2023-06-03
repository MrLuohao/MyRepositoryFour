package note;

//这里虽然没有添加任何注解，但是默认继承了父类person中的注解
public class son extends person {
    public void show() {//这里的show方法打了斜杠，说明被标记为过时方法，即@Deprecated
    }
}
