package inherit.text2;

/*
创建一个新手机类（子类）继承手机类
 */
public class newphone extends phone {
    @Override
    public void call(String name) {
        System.out.println("开启视频功能");//子类newphone重写的call方法，为call方法添加了一个开启视频的新功能
        super.call(name);//调用父类phone类中的call方法
    }
}
