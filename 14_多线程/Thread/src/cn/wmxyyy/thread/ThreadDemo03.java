package cn.wmxyyy.thread;

/**
 * @author wmxyyy
 * @date 2019/12/14 15:34
 * @state public static void sleep(long millis)
 */
public class ThreadDemo03 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                //使用sleep()让程序睡眠1s
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
