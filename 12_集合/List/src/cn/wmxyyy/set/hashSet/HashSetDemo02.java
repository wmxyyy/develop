package cn.wmxyyy.set.hashSet;

import java.util.HashSet;

/**
 * @author wmxyyy
 * @date 2019/12/13 13:53
 * @state HashSet自定义类型元素，必须重写元素的hashcode()和equals()
 *
 */
public class HashSetDemo02 {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("小新",18);
        Person p2 = new Person("小新",18);
        Person p3 = new Person("小明",123);

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));

        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
