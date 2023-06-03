package enumerate;

/*
编程实现所有方向的枚举：向上、向下、向左、向右

枚举类实现接口的方式
     枚举类实现接口后需要重写抽象方法，而重写方法的方式有两种：重写一个，或者每个对象都写
 */
public enum test2 implements test2Interface {
    //声明本类类型的引用指向本类类型的对象
    UP("向上") {
        @Override
        public void show() {
            System.out.println("向上移动了一下");
        }
    }, DOWN("向下") {
        @Override
        public void show() {
            System.out.println("向下移动了一下");
        }
    }, LEFT("向左") {
        @Override
        public void show() {
            System.out.println("向左移动了一下");
        }
    }, RIGHT("向右") {
        @Override
        public void show() {
            System.out.println("向右移动了一下");
        }
    };//枚举类型中的对象必须写在最前面，否则将会报错
    //创建用于描述方向信息的成员变量
    private final String direction;

    //私有化构造方法，此时构造方法只能在本类中使用
    private test2(String direction) {
        this.direction = direction;
    }

    //通过公有的get方法可以在本类的外部访问该类成员变量的值
    public String getDirection() {
        return direction;
    }

    public static void show(String str) {
        switch (str) {
            case "向上":
                System.out.println("抬头望明月");
                break;
            case "向下":
                System.out.println("低头思故乡");
                break;
            case "向左":
                System.out.println("向左前进");
                break;
            case "向右":
                System.out.println("向右前进");
                break;
            default:
                System.out.println("没有这样的方向");
        }
    }

    /*@Override
    public void show() {
        System.out.println("接口类的方法重写了");
    }*/
}
