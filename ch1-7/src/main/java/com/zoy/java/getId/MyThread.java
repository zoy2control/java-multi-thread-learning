package com.zoy.java.getId;

/**
 * Created by zouzp on 2019/3/25.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("==========run start============");
        System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread().getId() : " + Thread.currentThread().getId());
        System.out.println("==========run end============");
    }
}
