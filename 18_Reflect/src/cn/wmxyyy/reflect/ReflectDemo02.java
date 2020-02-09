package cn.wmxyyy.reflect;

import cn.wmxyyy.domain.Person;

import java.lang.reflect.Field;

/**
 * @author wmxyyy
 * @date 2019/12/20 16:59
 * @state Class对象获取成员变量
 *   - Field[] getFields();获取所有public修饰的成员变量
 *   - Field getField(String name);获取指定名称的public修饰的成员变量
 *
 *   - Field[] getDeclaredFields();获取所有的成员变量，不考虑修饰符
 *   - Field[] getDeclaredField(String name); 获取指定名称的成员变量，不考虑修饰符
 *
 * Field成员变量操作
 *   - void set(Object obj, Object value)
 *   - Object get(Object obj)
 *   - setAccessible(true):暴力反射(忽略访问权限修饰符的安全检查)
 */
public class ReflectDemo02 {
    public static void main(String[] args) throws Exception {
        //获取Person的Class对象
        Class personClass = Person.class;

        //Field[] getFields(),获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields){
            System.out.println(field);
        }

        //getField(String name);获取指定名称的public修饰的成员变量
        Field a = personClass.getField("a");
        //Field成员变量get(Object obj);
        Person p = new Person();
        //获取成员变量a的值get(Obj obj);
        Object value = a.get(p);
        System.out.println(value);
        //设置成员变量的值set(Obj obj);
        a.set(p,"王明");
        System.out.println(p);

        System.out.println("---------------------------------------");
        //getDeclaredFields();获取所有的成员变量，不考虑修饰符
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field field : declaredFields){
            System.out.println(field);
        }

        //getDeclaredField(String name); 获取指定名称的成员变量，不考虑修饰符
        Field d = personClass.getDeclaredField("d");
        //暴力反射
        d.setAccessible(true);
        Object value2 = d.get(p);
        System.out.println(value2);
    }
}
