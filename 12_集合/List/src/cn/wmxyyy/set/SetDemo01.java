package cn.wmxyyy.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/13 13:18
 * @state Set接口 extends Collection接口
 * 特点:
 *  - 无序集合
 *  - 不允许存储重复的元素
 *  - 没有索引
 */
public class SetDemo01 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            Integer next = it.next();
            System.out.print(next + " ");
        }

        System.out.println();

        for (Integer i : set){
            System.out.print(i + " ");
        }
    }
}
