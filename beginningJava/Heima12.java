package beginningJava;

public class Heima12 {
    /*
    带返回值方法的定义和调用

          带返回值方法的定义：
                        格式：public static 数据类型  方法名（参数）{
                                 ruturn数据;
                        }
                        范例1：public static int isEvenNumber(int number){
                                return 100;
                        }
                        范例2：public static boolean getMax(int a,int b){
                                return ture;
                        }
                   注意：方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错


          带返回值方法的调用：
                        格式1：方法名（参数）;
                        范例：isEvenNumber(5);

                        格式2：数据类型变量名 = 方法名（参数）;
                        范例：boolean flag = isEvenNumber(5);
                  注意：方法的返回值通常会使用变量接收，否则该返回值将无意义

            方法的注意事项：
                          1.方法不能嵌套定义
                          2.void表示无返回值，可以省略return,也可以单独写return，后面不加数据

            方法的通用格式：
                         public static 返回值类型 方法名（参数）{
                              方法体；
                              return数据；
                         }
              public static  ：修饰符，目前先记住这个格式
              返回值类型     ：方法操作完毕后返回的数据的类型
                               如果方法操作完毕，没有数据返回，这里写void，而且方法中一般不写return
              方法名         : 调用方法时使用的标识
              参数           ： 由数据类型和变量名组成，多个参数之间用逗号隔开
              方法体         ： 完成功能的代码块
              return         ： 如果方法操作完毕，有数据返回，用于把数据返回给调用者

           1.定义方法时，要做到两个明确：
                 明确返回值类型：主要明确方法操作完毕之后是否有数据返回，如果没有，写void；如果有，写对应的数据类型
                 明确参数：主要是明确参数的类型和数量
          2.调用方法时
                 void类型的方法，直接调用即可
                 非void类型的方法，推荐用变量接收调用
     */
    public static void main(String[] args) {
        //需求设计：定义一个方法，该方法带参数，判断参数是否为偶数，并返回真假值
        boolean flag = isEvenNumber(12);//定义flag用于接收返回值true并保存
        System.out.println(flag);//打印出返回值结果
        int number = 40;
        boolean j = isEvenNumber(number);//定义j用于接收返回值true并保存
        System.out.println(j);//打印出返回值结果
        isEvenNumber(50);//此处如果不定义一个变量（声明一个空间）用于接收（存放）返回值，控制台就不知如何打印返回值
        // System.out.println(?);

        int result = getMax(34, 45);//定义resul用于接收返回值并保存
        System.out.println(result);//打印出返回值结果
        System.out.println(getMax(34, 45));//也可以直接调用方法并直接打印出结果
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println(number + "为偶数");
            return true;
        } else {
            System.out.println(number + "不是偶数");
            return false;
        }
    }

    //需求设计：定义一个方法用于获取两个数中的最大值，数据来源于参数
    public static int getMax(int a, int b) {
        if (a > b) {
            System.out.println("Max:" + a);
            return a;
        } else {
            System.out.println("Max:" + b);
            return b;
        }
    }
}

