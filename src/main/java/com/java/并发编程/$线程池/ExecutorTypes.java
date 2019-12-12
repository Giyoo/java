package com.java.并发编程.$线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName:ExecutorTypes
 * @Description:几个线程池类型和缺点
 * @Author: guoyong
 * @Date:2019/12/9 13:39
 **/
public class ExecutorTypes {
    public static void main(String[] args) {
        //允许的请求队列长度为 Integer.MAX_VALUE，可能会堆积大量的请求，从而导致 OOM。
        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(10);
        ExecutorService singleExcutorService = Executors.newSingleThreadExecutor();
        //允许的创建线程数量为 Integer.MAX_VALUE，可能会创建大量的线程，从而导致 OOM。
        ExecutorService cachedExcutorService = Executors.newCachedThreadPool();
        ExecutorService schedueExcutorService = Executors.newScheduledThreadPool(1);
    }
}
