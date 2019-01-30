package cn.cuslink.Volatile;

/**
 * @Author:zhangchundong
 * @Date:Create in 15:49 2019/1/28
 */

public class Test {
  private static int a = 0;
   private static int b = 0;

   public static void set() {
      System.out.println("执行了set方法");
      a = 1;
      b = 1;
   }

   public static void loop() {
      while (b == 0) continue;
      if (a == 1) {
         System.out.println("i'm here");
      } else {
         System.out.println("what's wrong");
      }
   }
}
