package com.zoy.java.sleep;


import static org.junit.Assert.*;

/**
 * ·测试 .sleep()
 * Created by zouzp on 2019/3/25.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        System.out.println("=========thread start=========");
        System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
        System.out.println("begin time : " + System.currentTimeMillis());
        thread.setName("A");
        thread.start();// ·线程等待执行
//        thread.run();// ·线程马上执行，进入 MyThread类
        System.out.println("end time : " + System.currentTimeMillis());
        System.out.println("=========thread end=========");
    }
}