package com.java.并发编程.$线程池;

import java.util.concurrent.BlockingQueue;

/**
 * @ClassName:MyThreadPool4
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/5/6 18:34
 **/
public class MyThreadPool4 {
    private int coreSize;
    private int workSize;
    private BlockingQueue<Runnable> queue;


    public MyThreadPool4(int workSize, BlockingQueue<Runnable> queue) {
        this.workSize = workSize;
        this.queue = queue;
    }

    public void excute(Runnable runnable) throws InterruptedException {
        if (runnable == null){
            throw new NullPointerException();
        }
        if (coreSize<workSize){
            coreSize++;
            Worker worker = new Worker(runnable);
            Thread thread = new Thread(worker);
            thread.start();
        }else {
            queue.put(runnable);
        }
    }

    private class Worker implements Runnable{

        public Worker(Runnable runnable) {
            queue.offer(runnable);
        }

        @Override
        public void run() {
            while (true){
                try {
                    Runnable runnable = queue.take();
                    runnable.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
