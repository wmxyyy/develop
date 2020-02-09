package cn.wmxyyy.thread;

/**
 * @author wmxyyy
 * @date 2019/12/14 15:28
 * @state
 */
public class ThreadDemo02Test {
    public static void main(String[] args) {
        ThreadDemo02 t = new ThreadDemo02("小新");
        ThreadDemo02 t2 = new ThreadDemo02("小米");

        t.start();
        t2.start();
    }
}
