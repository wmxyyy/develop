package cn.wmxyyy.ThreadSafe.Synchronized;

/**
 * @author wmxyyy
 * @date 2019/12/14 20:55
 * @state
 */
public class SynchronizedDemo02 {
    public static void main(String[] args) {
        Runnable r = new RunnableImpl02();

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);

        t1.start();
        t2.start();
        t3.start();
    }
}
