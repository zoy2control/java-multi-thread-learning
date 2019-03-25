package com.zoy.java.extendsThread.random.eg2;

/**
 * Created by zouzp on 2019/3/18.
 */
public class MyThread extends Thread{
    @Override
    public void run() {
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
