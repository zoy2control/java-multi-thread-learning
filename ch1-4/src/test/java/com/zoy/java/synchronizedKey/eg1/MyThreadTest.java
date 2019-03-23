package com.zoy.java.synchronizedKey.eg1;

import org.junit.Test;


/**
 * Created by zouzp on 2019/3/23.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("A");
        MyThread t2 = new MyThread("B");
        t1.start();
        t2.start();
    }
}