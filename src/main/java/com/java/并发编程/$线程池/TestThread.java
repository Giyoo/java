package com.java.并发编程.$线程池;

/**
 * @ClassName:TestThread
 * @Description:测试线程
 * @Author: guoyong
 * @Date:2019/12/9 15:24
 **/
public class TestThread implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行中...");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()+"被中断！");
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName()+"执行完毕！");
    }
}
