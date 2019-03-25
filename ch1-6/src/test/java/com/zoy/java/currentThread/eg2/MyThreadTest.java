package com.zoy.java.currentThread.eg2;


/**
 * Created by zouzp on 2019/3/23.
 */
public class MyThreadTest {
    public static void main(String[] args) {
        /*
        ·注意，thread.setName("A")只是改变了 thread对象的线程名称，和 myThread没有关系。
        ·thread对象和 myThread对象是两个对象（废话）
        * */
        MyThread myThread = new MyThread();// ·构造MyThread类由 main线程执行
        Thread thread = new Thread(myThread);
        thread.setName("A");
        thread.start();// ·执行 MyThread类的方法，由 A线程执行
//        a.run();// ·执行 MyThread类的方法，由 main线程执行

        System.out.println("========外部 start=========");
        System.out.println("外部：Thread.currentThread().getName() ： " + Thread.currentThread().getName());
        System.out.println("外部：this.getName() ： " + thread.getName());
        System.out.println("========外部 end=========");
    }
}