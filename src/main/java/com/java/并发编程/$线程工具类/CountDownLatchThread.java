package com.java.并发编程.$线程工具类;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName:CountDownLatchThread
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/26 18:01
 **/
public class CountDownLatchThread implements Runnable {

    private final CountDownLatch start_latch;
    private final CountDownLatch end_latch;
    private final String hello;

    public CountDownLatchThread(CountDownLatch start_latch, CountDownLatch end_latch, String hello) {
        this.start_latch = start_latch;
        this.end_latch = end_latch;
        this.hello = hello;
    }


    @Override
    public void run() {
        try {
            start_latch.await();
            sayHello(this.hello);
            end_latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void sayHello(String hello) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(new Random().nextInt(2000));
        System.out.println(hello);
    }
}
