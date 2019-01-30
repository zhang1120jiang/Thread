package cn.cuslink.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author:zhangchundong
 * @Date:Create in 10:39 2019/1/30
 */

public class TicketMain {
   public static void main(String[] args) throws Exception{
      CountDownLatch countDownLatch = new CountDownLatch(5);
      Ticket ticket = new Ticket(countDownLatch);
      // 创建了一个线程为5的线程池
      ExecutorService executorService = Executors.newFixedThreadPool(5);
      // 提交了5个线程
      for(int i = 0 ; i < 5 ; i++){
         executorService.submit(ticket);
      }
      // 这里的main线程会阻塞，直到所有的子线程都执行完毕了才往后面执行
      countDownLatch.await();
      System.out.println("票卖完了");
      executorService.shutdown();
   }
}
