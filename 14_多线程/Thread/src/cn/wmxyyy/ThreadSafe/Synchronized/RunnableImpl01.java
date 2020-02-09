package cn.wmxyyy.ThreadSafe.Synchronized;

/**
 * @author wmxyyy
 * @date 2019/12/14 16:53
 * @state 卖票案例出现了线程安全问题
 * 解决线程安全问题的一种方案:使用同步代码块
 *
 * 格式:      synchronized(锁对象){
 *              共享数据代码
 *          }
 * 注意:
 *  - 锁对象可以使用任意的对象
 *  - 必须保证多线程使用的锁对象是同一个
 *  - 锁对象作用: 锁住同步代码块，只让一个线程再同步代码块中执行
 */
public class RunnableImpl01 implements Runnable{
    private int ticket = 100;
    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (obj){
                if (ticket > 0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket-- + "张的票");
                }
            }
        }
    }
}
