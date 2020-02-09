package cn.wmxyyy.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/13 19:38
 * @state HashMap<K,V>集合 implements Map<K,V>接口
 * 特点:
 *  - 底层是哈希表，是线程不安全集合，是多线程集合，速度快
 *      JDK1.8前:数组 + 单向链表
 *      JDK1.8后:数组 + 单向链表/红黑树(链表长度超过8)
 *  - 无序集合
 *
 *  HashMap存储自定义类型的键值，重写hashCode();和equals();以保证key唯一
 */
public class HashMapDemo01 {
    public static void main(String[] args) {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("王明",34),"阳江");
        map.put(new Person("王明",34),"阳江");
        map.put(new Person("叶问",34),"佛山");
        map.put(new Person("王",34),"北京");

        Set<Map.Entry<Person, String>> entrySet = map.entrySet();
        for (Map.Entry<Person,String> entry : entrySet){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "---" + value);


        }
    }
}
