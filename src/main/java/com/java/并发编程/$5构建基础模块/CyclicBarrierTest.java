package com.java.并发编程.$5构建基础模块;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName:CyclicBarrierTest
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/26 18:45
 **/
public class CyclicBarrierTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
            CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("终于搞完了！");
            }
        });
        for (int i =0;i<5;i++){
           executorService.execute(new CyclicBarrierThread(cyclicBarrier,i));
        }
    }


}
