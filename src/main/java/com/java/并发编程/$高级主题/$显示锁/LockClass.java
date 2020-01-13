package com.java.并发编程.$高级主题.$显示锁;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName:LockClass
 * @Description:显示锁
 * @Author: guoyong
 * @Date:2019/12/12 11:29
 **/
public class LockClass {

    //锁
    Lock lock = new ReentrantLock();

    private final List<String> list = new ArrayList();

    //普通的锁使用方式
    void normalUse(String str) {
        lock.lock();
        try {
            System.out.println("添加String:" + str);
            list.add(str);
            System.out.println("添加完成:" + str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    void interruptUse(String str) {
        try {
            lock.lockInterruptibly();
        } catch (InterruptedException e) {
            System.out.println("线程中断了！！！");
            e.printStackTrace();
        }
        try {
            Thread.sleep(2000);
            System.out.println("添加String:" + str);
            list.add(str);
            System.out.println("添加完成:" + str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void trylockUse(String str) throws InterruptedException {
        while (true) {
            try {
                if (lock.tryLock()) {
                    Thread.sleep(1000);
                    System.out.println("添加String:" + str);
                    list.add(str);
                    System.out.println("添加完成:" + str);
                }
            } finally {
                lock.unlock();
            }
        }
    }

    void trylockTimeUse(String str) throws InterruptedException {
        while (true) {

                if (lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
                    try {
                        Thread.sleep(20000);
                        System.out.println("限时添加String:" + str);
                        list.add(str);
                        System.out.println("限时添加完成:" + str);
                        return;
                    }  finally {
                        lock.unlock();
                    }
                }
        }
    }
}
