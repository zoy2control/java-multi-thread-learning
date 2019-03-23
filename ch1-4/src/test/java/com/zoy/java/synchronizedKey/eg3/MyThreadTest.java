package com.zoy.java.synchronizedKey.eg3;



/**
 * Created by zouzp on 2019/3/23.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        // ·模拟多个线程共享同一个数据，因为 线程MyThread的 run()方法是 synchronized线程安全的方法，所以A、B、C线程会顺序执行
        MyThread t1 = new MyThread("t1");
        Thread thread01 = new Thread(t1, "A");
        Thread thread02 = new Thread(t1, "B");
        Thread thread03 = new Thread(t1, "C");

        thread01.start();
        thread02.start();
        thread03.start();
    }
}