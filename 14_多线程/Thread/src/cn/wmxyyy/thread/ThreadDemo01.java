package cn.wmxyyy.thread;

/**
 * @author wmxyyy
 * @date 2019/12/14 14:39
 * @state java.lang.Thread类:描述线程的类
 * - 创建多线程第一种方式:创建Thread类的子类
 * - java程序属于抢占式调度
 *
 * 实现步骤:
 * 1.创建一个Thread类的子类
 * 2.重写Thread类run方法，设置线程任务
 * 3.创建Thread类的子类对象
 * 4.调用Thread类中的start方法，开启新的线程执行run方法
 *      start(); 使线程开始执行;JVM调用该线程的run();
 *
 * 获取线程的名称:
 *  - 使用Thread类中的getName();
 *          String getName();
 *  - 先获取当前正在执行线程，再使用getName();
 *          static Thread currentThread();
 */
public class ThreadDemo01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" + i);
        }
    }
}
