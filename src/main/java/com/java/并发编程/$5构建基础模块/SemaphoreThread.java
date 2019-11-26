package com.java.并发编程.$5构建基础模块;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName:SemaphoreThread
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/26 19:42
 **/
public class SemaphoreThread implements Runnable {

    private final Semaphore semaphore;

    private final String name;

    public SemaphoreThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(name+"拿到钥匙，进饭馆开始喝汤了！");
            TimeUnit.MILLISECONDS.sleep(new Random().nextInt(20000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
            System.out.println(name+"喝完了，释放钥匙了！");
        }

    }
}
