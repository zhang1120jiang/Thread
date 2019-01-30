package cn.cuslink.thread;

import java.util.concurrent.CountDownLatch;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:28 2019/1/30
 */

public class Ticket implements Runnable {

   private static int count = 100;
   private Object obj;
   private CountDownLatch downLatch;

   public Ticket(CountDownLatch countDownLatch) {
      obj = new Object();
      downLatch = countDownLatch;
   }

   @Override
   public void run(){
      while (count > 0) {
         synchronized (obj) {
            if(count > 0) {
               System.out.println(Thread.currentThread().getName() + "卖出第" + count + "张票");
               count--;
            }
         }
         try {
            // 为了让线程能够进行均匀的抢到票
            Thread.sleep(1000);
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      downLatch.countDown();
   }
}
