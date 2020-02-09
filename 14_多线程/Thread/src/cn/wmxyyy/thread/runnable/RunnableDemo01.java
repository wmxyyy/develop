package cn.wmxyyy.thread.runnable;

/**
 * @author wmxyyy
 * @date 2019/12/14 15:38
 * @state 创建多线程程序的第二种方式:实现Runnable接口
 *
 * java.lang.Thread类的构造方法:
 *      Thread(Runnable target) 分配新的Thread对象
 *      Thread(Runnable target, String name) 分配新的Thread对象
 *
 * 步骤:
 * 1.创建一个Runnable接口的实现类
 * 2.再实现类中重写run方法,设置线程任务
 * 3.创建一个Runnable接口的实现类对象
 * 4.创建Thread类对象,构造方法中传递Runnable接口的实现类对象
 * 5.调用Thread类中的start();开启新的线程执行run方法
 *
 * 好处:
 * - 避免单继承的局限性
 * - 增强了程序的扩展性,降低了程序的耦合性
 */
public class RunnableDemo01 {
    public static void main(String[] args) {
        RunnableImpl01 r = new RunnableImpl01();
        Thread t = new Thread(r);
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }


}
