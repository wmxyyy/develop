package cn.wmxyyy.set.hashSet;

import java.util.HashSet;

/**
 * @author wmxyyy
 * @date 2019/12/13 13:27
 * @state HashSet集合 implements Set接口
 * 特点:
 *  - 不允许存储相同的元素
 *  - 没有索引
 *  - 无序集合,存取元素的顺序不一致
 *  - 底层是一个哈希表结构(查询的速度非常的快):数组 + 链表/红黑树
 */
public class HashSetDemo01 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        /*
            Set集合在调用add方法会调用元素的hashCode()和equals()判断元素是否重复
            数据结构:初始数组容量为16,如果链表的长度超过了8位，把链表转换为红黑树
         */
        set.add("abc");
        set.add("王");
        set.add("王明");
        set.add("wmxyyy");
        set.add("abc");
        System.out.println(set);
    }
}
