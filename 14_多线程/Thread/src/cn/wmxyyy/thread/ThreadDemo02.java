package cn.wmxyyy.thread;

/**
 * @author wmxyyy
 * @date 2019/12/14 15:19
 * @state 设置线程名称
 *  - 使用Thread类中setName(名字);
 *          void setName（String name);
 *  - 创建一个带参数的构造方法,参数传递线程的名称
 *          Thread(String name);
 */
public class ThreadDemo02 extends Thread{
    public ThreadDemo02(String name){
        super(name);
    }

    @Override
    public void run() {
        //获取线程的名称
        System.out.println(Thread.currentThread().getName());
    }
}
