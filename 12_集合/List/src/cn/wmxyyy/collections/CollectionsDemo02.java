package cn.wmxyyy.collections;



import cn.wmxyyy.collections.Person;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wmxyyy
 * @date 2019/12/13 16:02
 * @state Collections是集合工具类，用来对集合进行操作
 *  - public static <T> void sort(List<T> list); 讲集合中元素按照默认规则排序
 *  被排序的集合元素必须实现Comparable，重写接口中的方法compareTo定义排序的规则
 */
public class CollectionsDemo02 {
    public static void main(String[] args) {
        //排序数字
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        //排序字符串
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("d");
        list2.add("李");
        list2.add("c");
        System.out.println(list2);

        Collections.sort(list2);
        System.out.println(list2);

        //排序对象
        ArrayList<Person> list3 = new ArrayList<>();
        list3.add(new Person("王明",12));
        list3.add(new Person("王发",34));
        list3.add(new Person("浮动",15));
        System.out.println(list3);

        Collections.sort(list3);
        System.out.println(list3);
    }
}
