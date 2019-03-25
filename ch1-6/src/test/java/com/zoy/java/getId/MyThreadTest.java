package com.zoy.java.getId;

import static org.junit.Assert.*;

/**
 * Created by zouzp on 2019/3/25.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        System.out.println("==========thread start============");
        thread.start();// ·线程等待有空闲之后执行
//        thread.run();// ·马上执行
        System.out.println("thread.getId() : " + thread.getId());
        System.out.println("==========thread end============");
    }
}