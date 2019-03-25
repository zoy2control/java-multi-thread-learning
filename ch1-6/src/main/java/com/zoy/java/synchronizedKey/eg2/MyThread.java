package com.zoy.java.synchronizedKey.eg2;

/**
 * ·非数据共享，count为线程私有变量
 * Created by zouzp on 2019/3/23.
 */
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        super();
        this.setName(name);
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println(Thread.currentThread().getName() + "计算 ： " + count);
        }
    }
}