package cn.wmxyyy.ThreadSafe.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wmxyyy
 * @date 2019/12/15 9:24
 * @state 解决线程安全问题的三种方案:使用Lock锁
 * java.util.concurrent.locks.Lock接口
 * Lock接口中的方法:
 *      void lock(); 获取锁
 *      void unlock(); 释放锁
 *
 * java.util.concurrent.looks.ReentrantLock implements Lock接口
 *
 * 步骤:
 * 1.在成员位置创建一个ReentrantLock对象
 * 2.在可能会出现安全问题的代码前调用lock()获取锁
 * 3.在可能会出现安全问题的代码后调用unlock()释放锁
 */
public class RunnableImpl01 implements Runnable{
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            lock.lock();
            if (ticket>0){
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock(); //无论程序是否异常,都会把锁释放
                }
            }
        }
    }
}
