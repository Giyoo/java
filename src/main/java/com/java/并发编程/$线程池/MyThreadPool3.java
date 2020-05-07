package com.java.并发编程.$线程池;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.BlockingQueue;

/**
 * @ClassName:MyThreadPool3
 * @Description:TODO
 * @Author: guoyong
 * @Date:2020/3/16 9:02
 **/
public class MyThreadPool3 {
   private int coreSize;
   private int workSize;
   private BlockingQueue<Runnable> queue;
   private List<Woker> list;

   public void execute(Runnable runnable) throws InterruptedException {
       if (runnable == null)
           throw new NullPointerException();
       if (coreSize<workSize){
           coreSize++;
           Woker woker = new Woker(runnable);
           Thread thread = new Thread(woker);
           thread.start();
       }else {
           queue.put(runnable);
       }
   }

   class Woker implements Runnable{
       public Woker(Runnable runnable) {
           queue.offer(runnable);
       }


       @Override
       public void run() {
           for (;;){
               Runnable runnable;
               try {
                   runnable = queue.take();
                   runnable.run();
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
       }
   }
    public static final String REGEX_MOBILE = "^[1][3-9][0-9]{9}$";
    public static final String REGEX_PHONE = "0\\d{2,3}[-]?\\d{7,8}|0\\d{2,3}\\s?\\d{7,8}|13[0-9]\\d{8}|15[1089]\\d{8}";

    public static void main(String[] args) {
        String mobile = "18308396380";
        System.out.println(mobile.matches(REGEX_MOBILE));
    }

}
