package com.java.并发编程.$5构建基础模块;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName:CyclicBarrierThread
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/26 19:32
 **/
public class CyclicBarrierThread implements Runnable {

    private final CyclicBarrier cyclicBarrier;
    private final Integer i;

    public CyclicBarrierThread(CyclicBarrier cyclicBarrier, Integer i) {
        this.cyclicBarrier = cyclicBarrier;
        this.i = i;
    }

    @Override
    public void run() {
        try {
            for (int j=0;j<10;j++){
                System.out.println(i+"开始了第"+j+"次了！");
                cyclicBarrier.await();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
