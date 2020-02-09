package cn.wmxyyy.ThreadSafe;

/**
 * @author wmxyyy
 * @date 2019/12/14 16:31
 * @state 实现卖票案例
 */
public class ThreadSafetyDemo01 {
    public static void main(String[] args) {
        RunnableImpl01 r = new RunnableImpl01();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();

    }
}
