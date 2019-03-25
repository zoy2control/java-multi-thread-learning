package com.zoy.java.synchronizedKey.eg3;

/**
 * ·count为线程私有变量，多个其他线程执行 这个线程的时候，count就是公共变量
 * Created by zouzp on 2019/3/23.
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public synchronized void run() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + "计算 ： " + count);
        }
    }
}