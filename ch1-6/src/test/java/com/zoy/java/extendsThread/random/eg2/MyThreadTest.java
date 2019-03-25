package com.zoy.java.extendsThread.random.eg2;

import org.junit.Test;


/**
 * ·.start()与 .run()的区别：
 * ·.start()方法是通知 “线程规划器”这个线程已经准备好，等待调用 该线程的 .run()方法。
 * ·这个过程是 系统有空了，去安排一个线程调用 该线程的 Thread.run()方法，启动线程，达到异步执行作用
 * ·if 直接调用代码 thread.run()，就不是 异步，而是同步执行线程。此时，线程对象并不是交给“线程规划器”
 * ·去执行，而是由 main主线程直接调用 .run()方法
 * Created by zouzp on 2019/3/18.
 */
public class MyThreadTest {
    @Test
    public void test() {
        // ·自定义线程 MyThread
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();

        // ·main线程
        try {
            for(int i = 0; i < 10; i++) {
                int time = (int) Math.random() * 1000;
                Thread.sleep(time);// ·线程休眠，抛异常。通常用 休眠来阻止当前线程快速运行完所有代码，休眠从而使 CPU去执行 其他线程。模拟线程切换
                System.out.println("run = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}