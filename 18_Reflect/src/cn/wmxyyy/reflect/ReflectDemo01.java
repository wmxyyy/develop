package cn.wmxyyy.reflect;

import cn.wmxyyy.domain.Person;

/**
 * @author wmxyyy
 * @date 2019/12/20 16:28
 * @state 反射：将类的各个组成部分(成员变量、构造方法、成员方法)封装为多个对象
 * 作用:可以在程序运行过程中操作这些对象
 *
 * 获取Class对象的方式
 *    1. Class.forName("全类名"):将字节码文件加载进内存，返回Class对象
 *    2. 类名.class:通过类名的属性class获取
 *    3. 对象.getClass()
 *
 * 获取全类名
 *    - String getName();
 */
public class ReflectDemo01 {
    public static void main(String[] args) throws Exception {
        //1.Class.forName("全类名")
        Class cls1 = Class.forName("cn.wmxyyy.domain.Person");
        System.out.println(cls1);

        //2.类名.class
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.对象.getClass
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        //同一个字节码文件在一次程序运行过程中，只会被加载一次
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls3);

        //获取全类名
        String name = cls1.getName();
        System.out.println(name);
    }
}
