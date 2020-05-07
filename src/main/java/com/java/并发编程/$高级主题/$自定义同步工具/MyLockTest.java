package com.java.并发编程.$高级主题.$自定义同步工具;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName:MyLockTest
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/24 9:38
 **/
public class MyLockTest {
    public static int num = 0;
    public static void main(String[] args) throws InterruptedException {

        MyLock1 lock = new MyLock1();
        Lock lock1 = new ReentrantLock();
        for (int i = 0;i<10000;i++){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    lock.lock();
                    num++;
                    System.out.println(num);
                    lock.unlock();
                }
            });
            thread.start();
        }
    }
}
