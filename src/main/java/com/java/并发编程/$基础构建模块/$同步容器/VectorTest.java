package com.java.并发编程.$基础构建模块.$同步容器;

import java.util.Vector;

/**
 * @ClassName:VectorTest
 * @Description:Vector使用加锁情况
 * @Author: guoyong
 * @Date:2020/3/4 9:55
 **/
public class VectorTest {
    static Vector<Integer> vector = new Vector<>();

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            vector.add(i);
        }
        System.out.println(vector);
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<vector.size();i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("删除："+i);
                    vector.remove(i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("size:"+vector.size());
                for (int i=0;i<vector.size();i++){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(vector.get(i));
                }
            }
        });
        thread2.start();
        thread1.start();
    }
}
