package com.zoy.java.implementsRunnable;

/**
 * Created by zouzp on 2019/3/23.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " 正在运行中");
    }
}
