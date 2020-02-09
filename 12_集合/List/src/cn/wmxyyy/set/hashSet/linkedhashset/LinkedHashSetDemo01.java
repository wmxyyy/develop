package cn.wmxyyy.set.hashSet.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author wmxyyy
 * @date 2019/12/13 14:15
 * @state LinkedHashSet集合 extends HashSet集合
 * 特点:
 *  - 底层: 哈希表(数组 + 链表/红黑树) + 链表(记录元素的存储顺序)
 */
public class LinkedHashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("wmxyyy");
        set.add("cn");
        System.out.println(set);

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("www");
        linked.add("wmxyyy");
        linked.add("cn");
        System.out.println(linked);
    }
}
