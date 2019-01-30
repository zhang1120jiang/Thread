package cn.cuslink.threadLocal.版本2;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:08 2019/1/28
 *
 * ThreadLocal 通过为每一个线程设置一个变量的副本，让每一个线程都拥有一个属于自己的变量
 *             这样就不会出现因一个变量引起的多线程问题，但是这对于，如买票的情况时就不
 *             实用，卖了一张就会少一张，另一个线程是需要知道还剩多少张票的。如果是事务
 *             时是实用的，事务必须是由开启事务的连接才能进行关闭事务，所以可已使用。
 */

public class MyRunable implements Runnable {

   private final ThreadLocalDemo threadLocalDemo;

   public MyRunable() {
      threadLocalDemo = new ThreadLocalDemo();
   }

   // 这样就会出现线程安全问题
   @Override
   public void run() {
      while (threadLocalDemo.get() < 20 ) {
         System.out.println("当前线程是：" + Thread.currentThread().getName() + "  i = " + threadLocalDemo.get());
         threadLocalDemo.set();
      }
      System.out.println("执行完毕");
   }
}
