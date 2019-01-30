package cn.cuslink.threadLocal.版本1;

/**
 * @Author:zhangchundong
 * @Date:Create in 9:53 2019/1/28
 */

public  class  duoxiancheng{

   public static void main(String[] args) {
      Thread t1 = new Thread(new MyRunable());
      Thread t2 = new Thread(new MyRunable());
      t1.start();
      t2.start();
   }
}
