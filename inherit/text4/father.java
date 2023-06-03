package inherit.text4;

public class father extends Granddad {
    @Override
    public void drink(){
        System.out.println("爸爸有一点喜欢喝酒");
        super.drink();
    }
    public void Smoke() {
        System.out.println("爸爸爱抽烟");
    }
}
