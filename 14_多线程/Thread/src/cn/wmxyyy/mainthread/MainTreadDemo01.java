package cn.wmxyyy.mainthread;

import cn.wmxyyy.mainthread.Person;

/**
 * @author wmxyyy
 * @date 2019/12/14 14:20
 * @state 主线程:执行main方法的线程
 *        单线程:程序只有一个线程,代码从上到下依次执行
 */
public class MainTreadDemo01 {
    public static void main(String[] args) {
        Person p1 = new Person("wmxyyy");
        p1.run();

        Person p2 = new Person("vvvvvv");
        p2.run();
    }
}
