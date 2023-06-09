package Multithreading;

public class OverView {
    /*
    程序和进程的概念：
    程序：数据结构+算法
    进程：主要指运行在内存中的可执行文件.exe文件
    （没有运行的放在磁盘上的可执行文件叫做程序，运行起来在内存中的可执行文件叫做进程）
    进程是重量级的，会占用较多的计算机资源，所以我们提出了线程的概念，指的是在一个进程下运行多个线程
    1.线程就是进程内部的程序流，也就是说计算机内部支持多进程，而每个进程的内部又是支持多线程的，线程是轻量的，新建线程会共享所在进程的系统资源，因此目前主流的开发的都是采用多线程
    2.多线程是采用时间片轮转法来保证多个线程的并发执行，所谓并发就是指宏观并行微观串行的机制

    Thread类
    Java.lang.Thread类代表线程，任何线程对象都是Thread类（子类）的实例
    1.该类是线程的模板，封装了复杂的线程开启等操作，封装了操作系统的差异性
    2.自定义类继承该类并重写run方法，创建该类的对象作为实参来构造该类类型的对象，然后使用该类类型的对象调用start方法

    main方法的线程叫做主线程，执行run方法的线程叫做新线程/子线程，当run方法执行完了过后子线程结束，当main方法执行完了过后主线程结束，两个线程之间没有执行的先后顺序，由操作系统调度算法来决定

     */
}
