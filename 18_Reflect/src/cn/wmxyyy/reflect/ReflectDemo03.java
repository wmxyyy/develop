package cn.wmxyyy.reflect;

import cn.wmxyyy.domain.Person;

import java.lang.reflect.Constructor;

/**
 * @author wmxyyy
 * @date 2019/12/20 17:33
 * @state Class对象获取构造方法
 *  - Constructor<?>[] getConstructors();
 *  - Constructor<T> getConstructor(类<?>... parameterTypes)
 *
 *  - Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
 *  - Constructor<?>[] getDeclaredConstructors()
 *
 *  构造方法创建对象
 *  - T newInstance(Object... initargs)
 *
 *  空参数构造方法创建对象简化：Class对象的newInstance方法
 */
public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        //getConstructor(类<?>... parameterTypes)
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);

        //创建对象: newInstance(Object... initargs)
        Object person = constructor.newInstance("张三", 34);
        System.out.println(person);

        Constructor constructor2 = personClass.getConstructor();
        System.out.println(constructor2);
        Object person2 = constructor2.newInstance();
        System.out.println(person2);

        //空参数构造方法创建对象简化：Class对象的newInstance方法
        Object person3 = personClass.newInstance();
        System.out.println(person3);
    }
}
