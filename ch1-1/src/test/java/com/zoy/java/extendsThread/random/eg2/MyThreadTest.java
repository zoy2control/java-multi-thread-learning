package com.zoy.java.extendsThread.random.eg2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zouzp on 2019/3/18.
 */
public class MyThreadTest {
    @Test
    public void test() {
        // ·自定义线程 MyThread
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();

        // ·main线程
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