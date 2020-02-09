package cn.wmxyyy.map.hashTable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author wmxyyy
 * @date 2019/12/13 20:50
 * @state HashTable<K,V>集合 implements Map<M,V>接口
 * 特点:
 *  - 底层是哈希表,是线程安全的集合，单线程集合，速度慢
 *  - 不能存储null键和null值
 *  - HashTable和Vector集合 被 HashMap和ArrayList取代了
 *  - HashTable的子类Properties集合依然活跃,它是唯一和IO流相结合的集合
 */
public class HashTableDemo01 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"aa");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> table = new Hashtable<>();
        table.put("a",null); //NullPointerException

    }
}
