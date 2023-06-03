package innerClass;

public class CallbackModeImpl implements CallbackMode {
    @Override
    public void show() {//重写接口类所有成员方法
        System.out.println("这里是接口的实现类");
    }

   /* @Override
    public void show1() {
        System.out.println("接口类里的所有成员方法必须全部重写");
    }*/
}
