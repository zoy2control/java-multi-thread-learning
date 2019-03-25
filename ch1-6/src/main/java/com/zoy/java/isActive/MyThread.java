package com.zoy.java.isActive;

/**
 * Created by zouzp on 2019/3/25.
 */
public class MyThread extends Thread {
    public MyThread() {
        System.out.println("==========Constructor start============");
        System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread() isActive : " + Thread.currentThread().isAlive());
        System.out.println("this.getName() : " + this.getName());
        System.out.println("this.isAlive() : " + this.isAlive());
        System.out.println("==========Constructor end============");
    }

    @Override
    public void run() {
        System.out.println("==========run start============");
        System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
        System.out.println("Thread.currentThread() isActive : " + Thread.currentThread().isAlive());
        System.out.println("this.getName() : " + this.getName());
        System.out.println("this.isAlive() : " + this.isAlive());
        System.out.println("==========run end============");
    }
}
