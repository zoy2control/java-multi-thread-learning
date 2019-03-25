package com.zoy.java.extendsThread.random.eg3;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * ·.start()顺序不代表 线程执行顺序
 * Created by zouzp on 2019/3/19.
 */
public class MyThreadTest {

    @Test
    public void test() {
        MyThread myThread01 = new MyThread(01);
        MyThread myThread02 = new MyThread(02);
        MyThread myThread03 = new MyThread(03);
        MyThread myThread04 = new MyThread(04);
        MyThread myThread05 = new MyThread(05);
        MyThread myThread06 = new MyThread(06);

        // ·.start()顺序不代表 线程执行顺序
        myThread01.start();
        myThread02.start();
        myThread03.start();
        myThread04.start();
        myThread05.start();
    }
}