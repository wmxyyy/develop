package cn.wmxyyy.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wmxyyy
 * @date 2019/12/13 17:48
 * @state Map<k,v>集合
 * 特点:
 *  - Map集合是一个双列集合,一个元素包含两个值(key,value)
 *  - key和value的数据类型可以相同也可以不同
 *  - key是不允许重复,value可以重复
 *  - key和value是一一对应
 *
 * 常用方法:
 *  - public V put(K key, V value); 当key不重复时返回值为null；key重复时返回被替换的value
 *  - public V remove(Object key); 当key存在,返回删除的value；key不存在返回value
 *  - public V get(Object key);
 *  - boolean containsKey(Object key) 判断集合中是否包含指定的键
 *
 *  - public Set<K> keySet(); 获取Map集合中所有的键，存储到Set集合中
 *  - public Set<Map.Entry<K,V>> entrySet(); 获取到Map集合中所有键值对 对象的集合(Set集合)
 */
public class MapDemo01 {
    public static void main(String[] args) {
        show04();
    }

    //V put(K key, V value);
    public static void show01(){
        Map<String, String> map = new HashMap<>();
        String s = map.put("aaa", "AAA1");
        System.out.println("s1 :" + s);
        String s2 = map.put("aaa", "AAA2");
        System.out.println("s1 :" + s2);
        map.put("bbb", "BBB");
        map.put("ccc", "CCC");

        System.out.println(map);
    }
    //V remove(Object key);
    public static void show02(){
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        map.put("bbb", 43);
        map.put("ccc", 532);
        System.out.println(map);

        Integer remove = map.remove("bbb");
        System.out.println("删除了 " + remove);
        System.out.println(map);

        Integer remove2 = map.remove("vvv");
        System.out.println("删除了 " + remove2);
        System.out.println(map);
    }
    public static void show03(){
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        map.put("bbb", 43);
        map.put("ccc", 532);

        Integer v1 = map.get("bbb");
        Integer v2 = map.get("vvv");
        System.out.println(v1);
        System.out.println(v2);
    }
    public static void show04(){
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        map.put("bbb", 43);
        map.put("ccc", 532);

        boolean b1 = map.containsKey("bbb");
        System.out.println("集合是否包含bbb的键? " + b1);
    }
}
