package com.java.并发编程.$线程工具类;

import com.java.面向对象.$8泛型.Worker;

import java.util.concurrent.BlockingQueue;

/**
 * @ClassName:MyExcutorThreadPool
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/4/27 10:41
 **/
public class MyExcutorThreadPool {
    private int coreSize;
    private int workSize;
    private BlockingQueue<Runnable> queue;

    public MyExcutorThreadPool(int workSize, BlockingQueue<Runnable> queue) {
        this.workSize = workSize;
        this.queue = queue;
    }

    public void excute(Runnable runnable) throws InterruptedException {
        if (runnable == null){
            throw new NullPointerException();
        }

        if (coreSize<workSize){
            Woker woker = new Woker(runnable);
            Thread thread = new Thread(woker);
            thread.start();
        }else {
            queue.put(runnable);
        }

    }

    private class Woker implements Runnable{

        public Woker(Runnable runnable) {
            queue.offer(runnable);
        }

        @Override
        public void run() {
            for (;;){
                Runnable runnable;
                try {
                    runnable = queue.take();
                    runnable.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
