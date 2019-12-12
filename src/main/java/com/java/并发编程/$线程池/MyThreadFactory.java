package com.java.并发编程.$线程池;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName:MyThreadFactory
 * @Description:自定义线程工厂
 * @Author: guoyong
 * @Date:2019/12/9 15:04
 **/
public class MyThreadFactory implements ThreadFactory {
    private static final AtomicInteger POOL_NUMBER = new AtomicInteger(1);
    private final ThreadGroup group;
    private final AtomicInteger thread_number = new AtomicInteger(1);
    private final String namePrefix;

    public MyThreadFactory() {
        SecurityManager s = System.getSecurityManager();
        group = (s!=null)?s.getThreadGroup():Thread.currentThread().getThreadGroup();
        namePrefix = "my-pool"+POOL_NUMBER.getAndIncrement()+"-thread-";
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(group,r,namePrefix+thread_number.getAndIncrement(),0);
        if (t.isDaemon()){
            t.setDaemon(false);
        }
        if (t.getPriority()!=Thread.NORM_PRIORITY){
            t.setPriority(Thread.NORM_PRIORITY);
        }
        return t;
    }
}
