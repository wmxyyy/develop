package cn.wmxyyy.ThreadSafe.WaitAndNotify;

/**
 * @author wmxyyy
 * @date 2019/12/15 9:54
 * @state 等待唤醒机制:线程之间的通信
 * 注意:
 *  - 顾客和老板线程必须使用同步代码块,保证等待和唤醒只有一个在执行
 *  - 同步使用的锁对象必须保证唯一
 *  - 只有锁对象才能调用wait()和notify();
 *
 *  void wait(); 在其他线程调用锁对象的notify()或notifyAll()前，导致当前线程等待
 *  void notify() 或notifyAll(); 唤醒在此锁对象上等待的单个线程,会继续执行wait()之后的代码
 */
public class WaitAndNotifyDemo01 {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("1.告知老板要的包子数量");
                        try {
                            //进入waiting状态
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("3.包子做好了，开吃!");
                        System.out.println("--------------------");
                    }
                }
            }
        }.start();

        //老板线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (obj){
                        System.out.println("2.告诉顾客:包子做好了");
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}
