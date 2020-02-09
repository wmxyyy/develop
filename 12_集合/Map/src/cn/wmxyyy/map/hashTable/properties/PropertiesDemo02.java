package cn.wmxyyy.map.hashTable.properties;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wmxyyy
 * @date 2019/12/15 20:44
 * @state Properties集合的临时数据，持久化写入到硬盘中存储
 *  - void store(OutputStream out, String comments);
 *  - void store(Writer writer, String comments);
 *      参数: comments 注释，说明保存文件的作用(一般使用"")
 *
 * 步骤:
 * 1.创建Properties集合对象,添加数据
 * 2.创建输出流对象，构造方法中绑定要输出的目的地
 * 3.使用Properties集合中store();把数据持久化写入到硬盘中存储
 * 4.释放资源
 */
public class PropertiesDemo02 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("aaa","VVVV");
        prop.setProperty("VVV","VVWW");
        prop.setProperty("BBB","VVVV");

        FileOutputStream fos = new FileOutputStream("prop.txt");
        prop.store(fos,"");
    }
}
