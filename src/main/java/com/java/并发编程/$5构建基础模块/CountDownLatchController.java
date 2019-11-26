package com.java.并发编程.$5构建基础模块;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName:CountDownLatchController
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/26 18:14
 **/
public class CountDownLatchController implements Runnable {

    private final CountDownLatch start_latch;
    private final CountDownLatch end_latch;

    public CountDownLatchController(CountDownLatch start_latch, CountDownLatch end_latch) {
        this.start_latch = start_latch;
        this.end_latch = end_latch;
    }

    @Override
    public void run() {
        start_latch.countDown();
        System.out.println("开始说吧！");
        try {
            end_latch.await();
            System.out.println("说完了吧！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
