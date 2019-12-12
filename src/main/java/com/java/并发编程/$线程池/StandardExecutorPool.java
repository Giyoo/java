package com.java.并发编程.$线程池;

import java.util.concurrent.*;

/**
 * @ClassName:StandardExecutorPool
 * @Description:标准线程池实现
 * @Author: guoyong
 * @Date:2019/12/9 15:19
 **/
public class StandardExecutorPool {
    public static ExecutorService cpuExecutorFactory(){
        ExecutorService executor = new ThreadPoolExecutor(7,9,1, TimeUnit.SECONDS,new LinkedBlockingDeque<>(10),new MyThreadFactory(),new MyRejectedExecutionHandler());
        return executor;
    }

    public static void main(String[] args) {
        ExecutorService executorService = StandardExecutorPool.cpuExecutorFactory();
        for (int i=0;i<100;i++){
            executorService.execute(new TestThread());
        }

    }
}
