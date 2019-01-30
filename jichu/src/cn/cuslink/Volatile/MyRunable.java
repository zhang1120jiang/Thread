package cn.cuslink.Volatile;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:08 2019/1/28
 *
 * volatile：只能保证可见性，有序性（禁止指令重排），不能保证原子性
 *
 */

public class MyRunable implements Runnable {
   //private  static int i = 0;
   private volatile int i = 0;

   public MyRunable() {
   }

   // 这样就会出现线程安全问题
   @Override
   public void run() {
         while (i < 10) {
            test();
         }
      System.out.println("执行完毕");
   }

   // 同步锁方式,注意锁必须要相同
//   public synchronized void test() {
//      System.out.println("当前线程是：" + Thread.currentThread().getName() + "i = " + i);
//      i = i + 1;
//   }

   public void test(){
      System.out.println("当前线程是：" + Thread.currentThread().getName() +" 执行了(i + 1)，i = "+( i = (i + 1)));
   }
}
