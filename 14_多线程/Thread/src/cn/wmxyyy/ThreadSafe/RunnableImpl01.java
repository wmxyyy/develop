package cn.wmxyyy.ThreadSafe;

/**
 * @author wmxyyy
 * @date 2019/12/14 16:34
 * @state 模拟卖票案例: 创建3个线程，对共享的票进行出售
 */
public class RunnableImpl01 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            if (ticket > 0){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在销售第" + ticket-- + "张的票");
            }
        }
    }
}
