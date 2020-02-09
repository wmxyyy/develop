package cn.wmxyyy.ThreadSafe.Synchronized;

/**
 * @author wmxyyy
 * @date 2019/12/14 20:42
 * @state 卖票案例出现了线程安全问题
 * 解决线程安全问题的一种方案:使用同步方法
 *
 * 格式:
 *      修饰符 synchronized 返回值类型 方法名(参数列表){
 *          共享数据的代码
 *      }
 */
public class RunnableImpl02 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        System.out.println(this);
        while (true){
            payTicketStatic();
        }
    }

    /*
        同步方法的锁对象:new RunnableImpl() （this）
     */
    public /*synchronized*/ void payTicket(){
        synchronized (this){
            if (ticket>0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }

    /*
        静态同步方法锁对象:本类的class属性-->文件对象(属性)
        this是创建对象后产生,静态方法优先于对象产生
     */
    public /*synchronized*/ void payTicketStatic(){
        synchronized (RunnableImpl02.class){
            if (ticket>0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-->正在卖第" + ticket + "张票");
                ticket--;
            }
        }
    }
}
