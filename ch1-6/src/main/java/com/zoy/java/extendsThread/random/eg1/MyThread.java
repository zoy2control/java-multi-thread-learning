package com.zoy.java.extendsThread.random.eg1;

/**
 * ·演示：继承 Thread类
 * Created by zouzp on 2019/3/18.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
