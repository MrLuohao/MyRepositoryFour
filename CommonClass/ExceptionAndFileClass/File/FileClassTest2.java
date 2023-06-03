package CommonClass.ExceptionAndFileClass.File;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class FileClassTest2 {
    //创建用于打印参数指定目录下的所有目录和所有文件
    public static void show(File file) {
        File[] FileArray = file.listFiles();
        //打印所有文件(如果想打印指定目录下的所有子目录的子目录的...所有文件可以采用递归的思想，再次调用show方法)
        for (File f : FileArray) {
            String name = f.getName();
            if (f.isFile()) {
                System.out.println("文件名为：" + name);
            }
        }
        //打印所有目录
        for (File f : FileArray) {
            String name = f.getName();
            if (f.isDirectory()) {
                System.out.println("该目录名为：" + name);
            }
        }
    }

    public static void main(String[] args) throws IOException {//抛出异常，先不处理
        //创建目录以及文件
        File file = new File("d:/我爱学习Java/部分代码");
        if (file.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println(file.mkdirs() ? "创建目录成功" : "创建目录失败");
        }
        File file1 = new File("d:/我爱学习Java/部分代码/l.avi");
        if (file.exists()) {
            System.out.println("文件存在");
        } else {
            System.out.println(file1.createNewFile() ? "创建文件成功" : "创建文件失败");
        }
        System.out.println("--------------------------------");
        File file2 = new File("d:/我爱学习Java/部分代码");
        File[] FileArr = file2.listFiles();//查看源码可知，list.Files（）方法是用于将指定的File文件里的内容装入到数组中（获取目录下满足筛选器的所有内容）
        //打印该目录下的文件
        for (File f : FileArr) {
            String name = f.getName();
            if (f.isFile()) {
                System.out.println("获取到的文件名为：" + name);
            }
        }
        //打印该目录下的目录
        for (File f : FileArr) {
            String name = f.getName();
            if (f.isDirectory()) {
                System.out.println("获取到的目录名称为：[" + name + "]");
            }
        }
        System.out.println("---------------------------");
        /*//方式一
        FileFilter fileFilter = new FileFilter() {//采用匿名内部类的方式获取该接口的引用
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".avi");//用于获取满足筛选条件的文件，后缀是.avi结尾就返回true，否则返回false
            }
        };*/
        //方式二
        //lambda表达式的格式：（参数列表）->{方法体}
        FileFilter fileFilter = (File pathname) -> {
            return pathname.getName().endsWith(".avi");
        };
        File[] files = file2.listFiles(fileFilter);//（这句代码的意思是：将file2目录下，满足获取的FileFilter接口的fileFilter引用的筛选条件的文件放入类型为File名为files的数组中）可以将该接口创建的引用当成参数传递给该数组，再加以遍历，就能筛选出满足条件的文件
        for (File file3 : files) {
            String name = file3.getName();//获取满足筛选条件的文件的文件名
            System.out.println("满足条件的文件名为：" + name);
        }
        System.out.println("------------------------------------");
        show(new File("d:/APP"));//调用方法答应参数指定（d:/APP）目录下的所有文件和目录
    }
}
