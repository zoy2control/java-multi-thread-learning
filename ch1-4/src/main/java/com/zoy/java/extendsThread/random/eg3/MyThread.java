package com.zoy.java.extendsThread.random.eg3;

/**
 * Created by zouzp on 2019/3/19.
 */
public class MyThread extends Thread {
    private int i;

    MyThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        System.out.println(i);
    }
}
