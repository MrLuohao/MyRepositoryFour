package packagePractice.text1;

import packagePractice.text2.Fu;//导入其他包

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi s = new Zi();
//        s.show2();//默认权限不能使用
        s.show3();
        s.show4();
    }
}
