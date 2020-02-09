package cn.wmxyyy.thread.runnable;

/**
 * @author wmxyyy
 * @date 2019/12/14 16:06
 * @state
 */
public class RunnableImpl01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
