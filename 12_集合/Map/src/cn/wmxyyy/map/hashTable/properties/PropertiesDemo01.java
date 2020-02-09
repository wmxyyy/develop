package cn.wmxyyy.map.hashTable.properties;

import java.util.Properties;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/15 20:26
 * @state java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
 *  Properties类表示了一个持久的属性集，是一个唯一和IO流相结合的集合
 *     - store(); 把集合中的临时数据持久化写入硬盘中存储
 *     - load(); 那硬盘中保存的文件(键值对)读取到集合中使用
 *
 *  Properties集合是一个双列集合,key和value默认都是字符串
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建Properties集合对象
        Properties pro = new Properties();
        //Object setProperty(String key, String value);调用 Hashtable 的方法 put
        pro.setProperty("aaa","AAA");
        pro.setProperty("bbb","BBB");
        pro.setProperty("ccc","CCC");

        //Set<String> stringPropertyNames();返回此属性列表中的键集
        Set<String> set = pro.stringPropertyNames();

        //遍历Set集合,取出Properties集合的每一个key
        for (String key : set){
            //String getProperty(String key);通过key找到value值
            String value = pro.getProperty(key);
            System.out.println(key + "=" + value);
        }
    }
}
