package CommonClass.ExceptionAndFileClass;

public class AgeException extends Exception {//1,创建一个异常名称的类
    static final long serialVersionUID = -3387516993124229948L;//2.提供一个版本号

    public AgeException() {//3.创建一个无参构造方法
    }

    public AgeException(String string) {//和一个带字符串对象的构造方法
        super(string);//选择继承自超类Exception
    }

}
