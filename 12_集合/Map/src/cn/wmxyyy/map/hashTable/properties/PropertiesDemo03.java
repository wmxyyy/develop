package cn.wmxyyy.map.hashTable.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/15 20:56
 * @state Properties集合把硬盘中的保存的文件(键值对)，读取到集合中使用
 *  - void load(InputStream input);
 *  - void load(Reader reader);
 *
 * 步骤:
 * 1.创建Properties集合对象
 * 2.使用load()读取保存键值对的文件
 * 3.遍历Properties集合
 */
public class PropertiesDemo03 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("prop.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set){
            String value = prop.getProperty(key);
            System.out.println(key + "=" +value);
        }
    }
}
