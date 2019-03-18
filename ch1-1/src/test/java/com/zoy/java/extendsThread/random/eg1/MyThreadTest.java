package com.zoy.java.extendsThread.random.eg1;

import org.junit.Test;

/**
 * Created by zouzp on 2019/3/18.
 */
public class MyThreadTest {

    /**
     * ·从结果可知，虽然在代码中 MyThread.start()先调用，但是先执行 sout，MyThread.run()比较晚执行
     * ·所以，线程中，代码顺序与 执行顺序无关。即 CPU随机调用 线程的run()方法
     */
    @Test
    public void test() {
        MyThread myThread = new MyThread();
        myThread.start();// ·启动线程
        System.out.println(Thread.currentThread().getName() + " Thread运行结束");
    }

}