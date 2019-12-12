package com.java.并发编程.$线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @ClassName:ExecutorParams
 * @Description:线程池各项参数设置
 * @Author: guoyong
 * @Date:2019/12/9 14:13
 **/
public class ExecutorParams {
    public static void main(String[] args) {
        //计算较为复杂，请异步导图查看链接
        ExecutorService executorService = new ThreadPoolExecutor(7,9,1, TimeUnit.SECONDS,new LinkedBlockingDeque<>(10));
    }
}
