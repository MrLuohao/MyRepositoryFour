package inherit.text4;

public class son extends father {
    public void study() {
        System.out.println("我喜欢学习");
    }

    @Override
    public void Smoke() {
        System.out.println("我不喜欢抽烟");
    }

    @Override
    public void drink() {
        System.out.println("我不喜欢喝酒");
        super.drink();
    }
}
