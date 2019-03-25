package com.zoy.java.isActive;

import static org.junit.Assert.*;

/**
 * ·isActive()判断当前线程是否活跃
 * ·注意 this与 Thread.currentThread的区别
 * Created by zouzp on 2019/3/25.
 */
public class MyThreadTest {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Thread thread = new Thread(myThread);
        thread.setName("A");
        System.out.println("==========thread start============");
        System.out.println("thread.isAlive() : " + thread.isAlive());
        thread.start();
        /* ·下面一条 System.out.println("thread.isAlive() : " + thread.isAlive());可能为true。因为 sout打印语句与 thread线程
           ·之间的顺序是不确定的，可能在 sout结束之前 thread线程还在执行。
        * */
//        thread.sleep(1000);
        System.out.println("thread.isAlive() : " + thread.isAlive());
        System.out.println("==========thread end============");
    }
}