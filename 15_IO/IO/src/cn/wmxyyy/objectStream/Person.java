package cn.wmxyyy.objectStream;

import java.io.Serializable;

/**
 * @author wmxyyy
 * @date 2019/12/17 11:58
 * @state 类通过实现java.io.Serializable接口以启动其序列化功能
 *
 * static关键字:
 *    - 静态优于非静态(如对象)加载到内存，被static修饰的成员变量不能被序列化
 *
 * transient关键字:瞬态关键字
 *    - 被transient修饰的成员变量不能被序列化
 */
public class Person implements Serializable {
    private String name;
    /*private static int age;
    private transient int age;*/
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
