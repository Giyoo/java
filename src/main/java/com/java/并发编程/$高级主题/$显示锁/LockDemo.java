package com.java.并发编程.$高级主题.$显示锁;

/**
 * @ClassName:LockDemo
 * @Description:显示锁基本使用
 * @Author: guoyong
 * @Date:2019/12/12 11:28
 **/
public class LockDemo {
    public static void main(String[] args) {
        LockClass lockClass = new LockClass();
//        System.out.println("-------------正常使用--------------");
//        for (int i=0;i<10;i++){
//            int finalI = i;
//            new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    lockClass.normalUse(""+ finalI);
//                }
//            }).start();
//        }
//        System.out.println("-------------正常使用结束--------------");
//        System.out.println("-------------中断使用使用--------------");
//        for (int i=0;i<10;i++){
//            int finalI = i;
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    lockClass.interruptUse(""+ finalI);
//                }
//            });
//            thread.start();
//            if (i==3){
//                thread.interrupt();
//            }
//        }
//        System.out.println("-------------中断使用使用结束--------------");
        for (int i=0;i<10;i++){
            int finalI = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        lockClass.trylockTimeUse(""+ finalI);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }

    }
}
