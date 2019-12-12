package com.java.并发编程.$避免活跃性危险;

/**
 * @ClassName:DeadLockByOrder
 * @Description:锁顺序死锁
 * @Author: guoyong
 * @Date:2019/12/10 17:14
 **/
public class DeadLockByOrder {
    private Object a = new Object();
    private Object b = new Object();

    void getA() throws InterruptedException {
        synchronized (a){
            Thread.sleep(1000);
            synchronized (b){
                System.out.println("getA");
            }
        }
    }

    void getB() throws InterruptedException {
        synchronized (b){
            Thread.sleep(1000);
            synchronized (a){
                System.out.println("getB");
            }
        }
    }

    public static void main(String[] args) {
        DeadLockByOrder deadLockByOrder = new DeadLockByOrder();
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    deadLockByOrder.getA();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    deadLockByOrder.getB();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        a.start();
        b.start();
    }
}
