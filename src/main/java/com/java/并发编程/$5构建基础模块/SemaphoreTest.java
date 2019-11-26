package com.java.并发编程.$5构建基础模块;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @ClassName:SemaphoreTest
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/26 19:41
 **/
public class SemaphoreTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(4);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0;i<50;i++){
            executorService.execute(new SemaphoreThread(semaphore,"张"+i));
        }
    }
}
