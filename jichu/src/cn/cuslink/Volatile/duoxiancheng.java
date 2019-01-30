package cn.cuslink.Volatile;

/**
 * @Author:zhangchundong
 * @Date:Create in 9:53 2019/1/28
 */

public  class  duoxiancheng{

   public static void main(String[] args) {
      MyRunable myRunable = new MyRunable();
      Thread t1 = new Thread(myRunable);
      Thread t2 = new Thread(myRunable);
      t1.start();
      t2.start();
   }
}
