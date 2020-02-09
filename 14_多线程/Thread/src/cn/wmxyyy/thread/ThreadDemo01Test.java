package cn.wmxyyy.thread;

/**
 * @author wmxyyy
 * @date 2019/12/14 15:14
 * @state
 */
public class ThreadDemo01Test {
    public static void main(String[] args) {
        ThreadDemo01 t1 = new ThreadDemo01();
        t1.start();

        //链式编程
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
