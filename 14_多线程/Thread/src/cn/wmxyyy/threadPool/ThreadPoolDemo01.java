package cn.wmxyyy.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wmxyyy
 * @date 2019/12/15 10:47
 * @state java.util.concurrent.Executors:线程池的工厂类，用来生成线程池
 * 静态方法:
 *  - static ExecutorService newFixedThreadPool(int nThreads) 创建一个可重用固定线程数的线程池
 *      - 返回值: ExecutorService线程池接口，用来从线程池中获取线程,调用start()执行线程任务
 *          - submit(Runnable task); 提交一个Runnable 任务用于执行
 *          - void shutdown(); 关闭/销毁线程池的方法
 *
 * 好处:
 *  - 降低资源消耗,减少创建和销毁线程的次数，每个工作线程可以重复利用、可执行多个任务
 *  - 提高响应速度，任务不需要等线程创建立即可以执行
 *  - 提高线程的可管理性。可以根据系统的承受能力调整线程池中工作线线程的数目防止宕机
 *
 * 步骤:
 *  1.使用Executors的静态方法newFixedThreadPool生产一个指定数量的线程池
 *  2.创建一个重写run()的RunnableImpl
 *  3.调用ExecutorService的submit(Runnable task),传递RunnableImpl
 *  4.调用ExecutorService的shutdown()销毁线程池(不建议执行)
 */
public class ThreadPoolDemo01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new RunnableImpl01());
        executorService.submit(new RunnableImpl01());
        executorService.submit(new RunnableImpl01());
        executorService.submit(new RunnableImpl01());

        executorService.shutdown();
        executorService.submit(new RunnableImpl01());
    }
}
