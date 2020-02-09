package cn.wmxyyy.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/15 17:19
 * @state java.io.InputStream:此抽象类表示字节输入流的所有类的超类
 * 子类共性方法:
 *  - int read() 从输入流中读取数据的下一个字节，读到文件末尾返回-1
 *  - read(byte[] b) 从输入流中读取一定数量的字节将其存储在缓冲区数组b中
 *  - close() 关闭此输入流并释放与该流相关联的所有资源
 *
 * 文件字节输入流 java.io.FileInputStream extends InputStream:把硬盘文件中的数据读取到内存中使用
 *
 * 读取数据的原理(硬盘->内存):
 *      java程序 -> JVM -> OS -> OS调用读取数据的方法 -> 读取文件
 *
 * 步骤:
 * 1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 * 2.使用FileInputStream对象中的方法read读取文件
 * 3.释放资源
 */
public class InputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\fis01.txt");
        /*System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());*/

        int len = 0; //记录读取到的字节
        while((len = fis.read()) != -1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
