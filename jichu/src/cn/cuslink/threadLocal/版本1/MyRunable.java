package cn.cuslink.threadLocal.版本1;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:08 2019/1/28
 */

public class MyRunable implements Runnable {

   private static int i;
   public MyRunable() {
      i = 0;
   }
   // 这样就会出现线程安全问题
   @Override
   public void run() {
      while (i < 10 ){
         System.out.println("当前线程是："+Thread.currentThread().getName()+"i = "+i);
         i = i + 1;
      }
      System.out.println("执行完毕");
   }
}
