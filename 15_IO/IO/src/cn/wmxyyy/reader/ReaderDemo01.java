package cn.wmxyyy.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/15 19:23
 * @state java.io.Reader:此抽象类表示字符输入流的所有类的超类
 * 子类共性方法:
 *  - int read(); 读取单个字符并返回
 *  - int read(char[] cbuf); 一次读取多个字符到指定数组
 *  - void close();
 *
 * java.io.FileReader extends InputStreamReader extends Reader
 *  FileReader:文件字符输入流，把硬盘文件中的数据以字符的方式读取到内存中
 *
 *  String类的构造方法
 *    - String(char[] value):把字节数组转换为字符串
 *    - String(char[] value, int offset, int length):把字符数组从offset开始的length个转换为字符串
 */
public class ReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("file\\fr01.txt");
        /*int len = 0;
        while ((len = fr.read()) != -1){
            System.out.println((char)len);
        }*/

        char[] chars = new char[1024];
        int len = 0;
        while ((len = fr.read(chars)) != -1){
            System.out.println(new String(chars,0 ,len));
        }
        fr.close();
    }
}
