package com.java.并发编程.$线程池;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @ClassName:MyExcutorTest
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/13 9:33
 **/
public class MyExcutorTest {
    public static void main(String[] args) {
        MyExecutorThreadPool1 myExecutorThreadPool1 = new MyExecutorThreadPool1(3,new LinkedBlockingDeque<>());
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"-----------");
                System.out.println("haha");
            }
        };
        for (int i=0;i<5;i++){
            myExecutorThreadPool1.execute(runnable);
        }
    }
}
