package com.java.并发编程.$线程工具类;

/**
 * @ClassName:ThreadLocalTest
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/11 14:00
 **/
public class ThreadLocalTest {
    private static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();
    private static int integer = 1;

    public static void main(String[] args) {
        for (int i=0;i<3;i++){
           new Thread(new Runnable() {
               @Override
               public void run() {
                   for (int i=0;i<3;i++){
                       threadLocal.set(i);
                       System.out.println(Thread.currentThread().getName()+"======="+threadLocal.get());
                   }
               };
           }).start();
        }
    }
}
