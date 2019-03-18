package com.zoy.java.extendsThread.random.eg2;

/**
 * Created by zouzp on 2019/3/18.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                int time = (int) Math.random() * 1000;
                Thread.sleep(time);// ·线程休眠，抛异常
                System.out.println("run = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
