package com.zoy.java.implementsRunnable;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ·MyThread类实现 Runnable接口
 * Created by zouzp on 2019/3/23.
 */
public class MyThreadTest {
    @Test
    public void test() {
        MyThread myThread = new MyThread();
//        myThread.run();// ·这里不直接执行 .run()，而是用 Thread进一层封装，可以执行 .start()方法
        Thread thread = new Thread(myThread);
        thread.start();// ·唯有 Thread类才可以执行 .start()方法。对于 实现Runnable接口的类，需要用 Thread类封装
        System.out.println(Thread.currentThread().getName() + " 运行结束");
    }
}