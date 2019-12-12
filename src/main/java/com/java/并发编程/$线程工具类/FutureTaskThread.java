package com.java.并发编程.$线程工具类;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName:FutureTaskThread
 * @Description:TODO
 * @Author: guoyong
 * @Date:2019/11/27 9:49
 **/
public class FutureTaskThread implements Callable<Integer> {
    private final Integer num;

    public FutureTaskThread(Integer num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        TimeUnit.MILLISECONDS.sleep(2000);
        for (int i=0;i<num;i++){
            sum +=i;
        }
        return sum;
    }
}
