package cn.wmxyyy.threadPool;

/**
 * @author wmxyyy
 * @date 2019/12/15 11:09
 * @state
 */
public class RunnableImpl01 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "创建了一个新的线程执行");
    }
}
