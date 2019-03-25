package com.zoy.java.sleep;

/**
 * Created by zouzp on 2019/3/25.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("=========run start=========");
            System.out.println("Thread.currentThread().getName() : " + Thread.currentThread().getName());
            System.out.println("begin time : " + System.currentTimeMillis());
            Thread.sleep(5000);// ·正在执行的线程休眠
            System.out.println("end time : " + System.currentTimeMillis());
            System.out.println("=========run end=========");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
