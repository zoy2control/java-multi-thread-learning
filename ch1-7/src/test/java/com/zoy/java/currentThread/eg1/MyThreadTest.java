package com.zoy.java.currentThread.eg1;

import static org.junit.Assert.*;

/**
 * Created by zouzp on 2019/3/23.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();// ·构造MyThread类由 main线程执行
        Thread a = new Thread(myThread, "A");
//        a.start();// ·执行 MyThread类的方法，由 A线程执行
        a.run();// ·执行 MyThread类的方法，由 main线程执行
    }
}