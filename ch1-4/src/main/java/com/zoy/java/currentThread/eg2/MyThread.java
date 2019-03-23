package com.zoy.java.currentThread.eg2;

/**
 * ·Thread.currentThread().getName()与 this.getName()的区别
 * ·Thread.currentThread()是 静态方法，this.getName()是 实例方法
 * ·Thread.currentThread()是调用该方法的 线程，this是 实例对象线程
 * Created by zouzp on 2019/3/23.
 */
public class MyThread extends Thread{
    public MyThread() {
        System.out.println("========MyThread start=========");
        System.out.println("内部：Thread.currentThread().getName() ： " + Thread.currentThread().getName());
        System.out.println("内部：this.getName() ： " + this.getName());// ·如果没有显示指定 Thread名称，默认 Thread-数字
        System.out.println("========MyThread end=========");
    }

    @Override
    public void run() {
        System.out.println("========run() start=========");
        System.out.println("内部：Thread.currentThread().getName() ： " + Thread.currentThread().getName());
        System.out.println("内部：this.getName() ： " + this.getName());// ·如果没有显示指定 Thread名称，默认 Thread-数字
        System.out.println("========run() end=========");
    }
}
