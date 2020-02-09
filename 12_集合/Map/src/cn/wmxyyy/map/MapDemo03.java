package cn.wmxyyy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/13 19:21
 * @state Map集合遍历方式:(2)使用Entry对象遍历
 *  - public Set<Map.Entry<K,V>> entrySet(); 获取到Map集合中所有键值对 对象的集合(Set集合)
 *
 *  Entry对象方法:
 *  - public K getKey();获取Entry对象中的键
 *  - public V getValue();获取Entry对象中的值
 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        map.put("bbb", 43);
        map.put("ccc", 53);

        //1.使用Map集合中的方法entrySet()，把Map集合中多个Entry对象存储到Set集合
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        //2.遍历Set集合，获取每一个Entry对象
        for (Map.Entry<String, Integer> entry : entries){
            //3.使用Entry对象中的getKey()和getValue()获取键和值
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "---" + value);
        }

        Iterator<Map.Entry<String, Integer>> it = entries.iterator();
        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "---" + value);
        }
    }
}
