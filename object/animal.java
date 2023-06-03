package object;

/*
标准类制作
   1.成员变量
     使用private修饰
   2.构造方法
     提供一个无参构造方法
     提供一个带多个参数的构造方法
   3.成员方法
     提供每一个成员变量对应的setXxx()和getXxx()
     提供一个显示对象信息的show()
   4.创建对象并为其成员变量赋值的两种方式
     无参构造方法创建对象后使用getXxx()赋值
     使用带参构造方法直接创建带有属性的对象
 */
public class animal {
    /*public static void main(String[] args) {
        animal b = new animal();
        b.setType("哺乳动物");
        b.setName("老虎");
        b.setHeight(240);
        b.setWeight(400.5);
        b.show();
    }*/
    private String Type;
    private String Name;
    private int Height;
    private double Weight;

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int Height) {
        this.Height = Height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public animal() {
    }//构造无参构造方法

    public animal(String Type, String Name, int Height, double Weight) {
        this.Type = Type;
        this.Name = Name;
        this.Height = Height;
        this.Weight = Weight;
    }

    public void show() {
        System.out.println("动物的类型是:" + Type + "\n动物的名称叫:" + Name + "\n动物的身高为:" + Height+"cm" + "\n动物的体重为:" + Weight+"斤");
    }

}
