package com.java.并发编程.$线程池;

import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName:MyExecutorThreadPool1
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/13 9:23
 **/
public class MyExecutorThreadPool1 {
    int coreSize;
    int workSize;
    BlockingQueue<Runnable> queue;
    List<Worker> wokers;

    public MyExecutorThreadPool1(int workSize, BlockingQueue<Runnable> queue) {
        this.workSize = workSize;
        this.queue = queue;
    }

    public void execute(Runnable runnable){
        if (runnable == null)
            throw new NullPointerException();
        if (coreSize<workSize){
            addThread(runnable);
        }else {
            try {
                queue.put(runnable);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }

    private void addThread(Runnable runnable){
        coreSize++;
        Worker worker = new Worker(runnable);
        Thread thread = new Thread(worker);
        thread.start();
    }


    class Worker implements Runnable{

        public Worker(Runnable runnable) {
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
