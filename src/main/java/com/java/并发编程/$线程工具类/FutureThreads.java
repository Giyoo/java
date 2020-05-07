package com.java.并发编程.$线程工具类;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName:FutureThreads
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/12 15:54
 **/
public class FutureThreads implements Runnable{
    int num;

    public FutureThreads(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        int sum = 0;
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=0;i<num;i++){
            sum +=i;
        }
    }
}
