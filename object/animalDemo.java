package object;

public class animalDemo {
    public static void main(String[] args) {
        animal a = new animal();
        a.show();
        System.out.println("动物的类型是:" + a.getType() + "\n动物的名称叫:" + a.getName() + "\n动物的身高为:" + a.getHeight()+"cm" + "\n动物的体重为:" + a.getWeight()+"斤");
        System.out.println("\n————————————————");
        animal b = new animal();
        b.setType("哺乳动物");
        b.setName("老虎");
        b.setHeight(240);
        b.setWeight(400.5);
        b.show();   
        System.out.println("动物的类型是:" + b.getType() + "\n动物的名称叫:" + b.getName() + "\n动物的身高为:" + b.getHeight()+"cm" + "\n动物的体重为:" + b.getWeight()+"斤");
        System.out.println("\n————————————————");
        animal c = new animal("两栖动物","青蛙",10,0.2);
        c.show();
        System.out.println("动物的类型是:" + c.getType() + "\n动物的名称叫:" + c.getName() + "\n动物的身高为:" + c.getHeight()+"cm" + "\n动物的体重为:" + c.getWeight()+"斤");
    }
}
