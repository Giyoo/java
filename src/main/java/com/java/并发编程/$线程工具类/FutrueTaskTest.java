package com.java.并发编程.$线程工具类;

import java.util.concurrent.*;

/**
 * @ClassName:FutrueTaskTest
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/27 9:46
 **/
public class FutrueTaskTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTaskThread task = new FutureTaskThread(200);
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        executorService.submit(futureTask);
        Future future = executorService.submit(task);
        executorService.shutdown();
        System.out.println("主线程正在执行任务！");
        try {
            System.out.println("task运行结果："+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("全部执行完毕！");

    }
}
