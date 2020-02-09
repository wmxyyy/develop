package cn.wmxyyy.ThreadSafe.WaitAndNotify;

/**
 * @author wmxyyy
 * @date 2019/12/15 10:25
 * @state 进入TimeWaiting的两种方式
 * - sleep(long m); 毫秒值结束后,线程进入Runnable/Blocked状态
 * - wait(long m); 毫秒值结束之后,还没有被notify()唤醒就会自动醒来，线程进入Runnable/Blocked状态
 *
 * 唤醒方法:
 * - void notify();
 * - void notifyAll();
 */
public class WaitAndNotifyDemo02 {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("1.顾客一告知老板要的包子数量");
                        try {
                            //进入waiting状态
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("3.包子做好了，顾客一开吃!");
                        System.out.println("--------------------");
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    synchronized (obj){
                        System.out.println("1.顾客二告知老板要的包子数量");
                        try {
                            //进入waiting状态
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("3.包子做好了，顾客二开吃!");
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
                        obj.notify();
                    }
                }
            }
        }.start();
    }
}
