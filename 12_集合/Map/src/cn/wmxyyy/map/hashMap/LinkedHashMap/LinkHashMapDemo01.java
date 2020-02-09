package cn.wmxyyy.map.hashMap.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * @author wmxyyy
 * @date 2019/12/13 19:43
 * @state LinkedHashMap<K,V>集合 extends HashMap<K,V>集合
 * 特点:
 *  - 底层:哈希表 + 链表(保证有序)
 */
public class LinkHashMapDemo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a", "A");
        map.put("c", "C");
        map.put("b", "B");
        map.put("d", "D");
        System.out.println(map);

        LinkedHashMap<String, String> linked = new LinkedHashMap<>();
        linked.put("a", "A");
        linked.put("c", "C");
        linked.put("b", "B");
        linked.put("d", "D");
        System.out.println(linked);


    }
}
