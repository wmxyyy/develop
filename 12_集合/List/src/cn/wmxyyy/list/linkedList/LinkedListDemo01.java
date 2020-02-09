package cn.wmxyyy.list.linkedList;

import java.util.LinkedList;

/**
 * @author wmxyyy
 * @date 2019/12/13 12:33
 * @state LinkedList集合 implement List接口
 * 特点:
 *  - 底层是一个链表结构:查询慢，增删快
 *  - 特有的操作首尾元素方法,不能使用多态
 *
 * 特有方法:
 *  - public void addFirst(E e);
 *  - public void addLast(E e);
 *  - public E getFirst();
 *  - public E getLast();
 *  - public E removeFirst();
 *  - public E removeLast();
 *  - public void push(E e);
 *  - public E pop();
 *
 */
public class LinkedListDemo01 {
    public static void main(String[] args) {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("aaa");
        linked.add("bbb");
        linked.add("ccc");
        System.out.println(linked);

        //public void addFirst(E e);
        linked.addFirst("www");
        //public void addLast(E e);
        linked.addLast("com");
        System.out.println(linked);

        //public E getFirst();
        String first = linked.getFirst();
        System.out.println("第一个元素:" + first);
        // public E getLast();
        String last = linked.getLast();
        System.out.println("最后一个元素:" + last);

        //public E removeFirst();
        String removeFirst = linked.removeFirst();
        //public E removeLast();
        String removeLast = linked.removeLast();
        System.out.println("被移除的第一个元素: " + removeFirst);
        System.out.println("被移除的最后一个元素: " + removeLast);
        System.out.println(linked);




    }
}
