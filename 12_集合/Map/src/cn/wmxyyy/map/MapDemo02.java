package cn.wmxyyy.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/13 19:09
 * @state Map集合遍历方式:(1)通过键找值方式
 *  - public Set<K> keySet(); 获取Map集合中所有的键，存储到Set集合中
 *
 */
public class MapDemo02 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("aaa", 23);
        map.put("bbb", 43);
        map.put("ccc", 53);

        //1.使用Map集合的keySet();把Map集合的key存储到Set集合
        Set<String> keySet = map.keySet();
        //2.遍历set，获取Map集合中的key
        Iterator<String> it = keySet.iterator();
        while(it.hasNext()){
            String key = it.next();
            //3.通过Map集合的get(key)得到value
            Integer value = map.get(key);
            System.out.println(key + "---" + value);
        }

        for (String key : keySet){
            Integer value = map.get(key);
            System.out.println(key + "---" + value);
        }

        for (String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
