package com.java.并发编程.$线程池;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @ClassName:MyRejectedExecutionHandler
 * @Description:自定义拦截
 * @Author: guoyong
 * @Date:2019/12/9 15:12
 **/
@Slf4j
public class MyRejectedExecutionHandler implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        log.info("向线程池中添加任务被拦截！"+r.toString());
        if (!executor.isShutdown()){
            r.run();
        }
        throw new RejectedExecutionException("Task"+r.toString()+"reject from"+executor.toString());
    }
}
