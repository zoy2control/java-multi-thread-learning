package com.zoy.java.hello;

/**
 * ·一个进程中至少运行一个线程，这个在 Java中也一样（JVM）
 * ·线程调用  public static void main()方法，由JVM创建，在后台默默运行
 * ·一个名为 main的线程在执行 main()方法中的代码。所以 控制台输出的 main是指 线程名字而不是 方法名
 * Created by zouzp on 2019/3/18.
 */
public class helloThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
    }
}
