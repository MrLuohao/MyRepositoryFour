package Interface.text1;

/*public class cat extends Object implements Jumpping {     每个类都默认继承了超类Object，可写可不写，推荐不写
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}*/

public class cat implements Jumpping {
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}
