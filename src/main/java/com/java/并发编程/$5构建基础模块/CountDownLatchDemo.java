package com.java.并发编程.$5构建基础模块;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName:CountDownLatch
 * @Description:闭锁使用示例
 * @Author: guoyong
 * @Date:2019/11/26 17:56
 **/
public class CountDownLatchDemo {
    public static void main(String[] args) {
        List<String> helloList = new ArrayList<>();
        helloList.add("你好！");
        helloList.add("hi！");
        helloList.add("hello！");
        helloList.add("こんにちは！");
        helloList.add("안녕 하세요！");
        helloList.add("bonjour！");
        helloList.add("Guten Tag！");
        helloList.add("Hola！");
        helloList.add("Ciao！");
        ExecutorService executorService = Executors.newCachedThreadPool();
        CountDownLatch start_latch = new CountDownLatch(1);
        CountDownLatch end_latch = new CountDownLatch(helloList.size());
        for (String hello:helloList){
            executorService.execute(new CountDownLatchThread(start_latch,end_latch,hello));
        }
        executorService.execute(new CountDownLatchController(start_latch,end_latch));
        executorService.shutdown();

    }
}
