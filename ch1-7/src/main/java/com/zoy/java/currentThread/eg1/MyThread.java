package com.zoy.java.currentThread.eg1;

/**
 * ·Thread.currentThread。构造函数、具体方法由 不同的线程调用
 * Created by zouzp on 2019/3/23.
 */
public class MyThread implements Runnable{
    public MyThread() {
        System.out.println(Thread.currentThread().getName() + "调用 MyThread类的构造函数");
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程正在运行中");
    }
}
