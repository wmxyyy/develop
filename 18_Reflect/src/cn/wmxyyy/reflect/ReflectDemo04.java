package cn.wmxyyy.reflect;

import cn.wmxyyy.domain.Person;

import java.lang.reflect.Method;

/**
 * @author wmxyyy
 * @date 2019/12/20 18:02
 * @state Class对象获取方法
 *  - Method[] getMethods()
 *  - Method getMethod(String name, 类<?>... parameterTypes)
 *
 *  - Method[] getDeclaredMethods()
 * 	- Method getDeclaredMethod(String name, 类<?>... parameterTypes)
 *
 * 	执行方法
 * 	- Object invoke(Object obj, Object... args)
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        Class personClass = Person.class;
        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        eat_method.invoke(p);

        Method eat_method2 = personClass.getMethod("eat", String.class);
        eat_method2.invoke(p,"rich");

        //读取所有的public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods){
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }
    }
}
