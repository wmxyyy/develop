package cn.wmxyyy.innerClassThread;

/**
 * @author wmxyyy
 * @date 2019/12/14 16:14
 * @state 简化代码: 匿名内部类方式实现线程的创建
 * 格式:
 *      new 父类/接口(){
 *          重写方法
 *      };
 */
public class InnerClassThreadDemo01 {
    public static void main(String[] args) {
        //继承Thread
        new Thread(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }.start();

        //实现Runnable接口
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        };
        new Thread(r).start();

        //简化Runnable接口
        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + "-->" + i);
                }
            }
        }).start();
    }
}
