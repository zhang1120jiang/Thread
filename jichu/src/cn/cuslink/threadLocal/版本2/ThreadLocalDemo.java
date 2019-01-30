package cn.cuslink.threadLocal.版本2;

/**
 * @Author:zhangchundong
 * @Date:Create in 16:02 2019/1/25
 */

public class ThreadLocalDemo {

  public static ThreadLocal<Integer> th = new ThreadLocal<Integer>(){
     // 设置一个初始值
     @Override
     protected Integer initialValue() {
        return 1;
     }
  };

  public int get(){
     return th.get();
  }
  public void set(){
     th.set(th.get()+1);
  }
}
