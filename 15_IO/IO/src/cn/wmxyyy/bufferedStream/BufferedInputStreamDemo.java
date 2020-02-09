package cn.wmxyyy.bufferedStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/16 17:58
 * @state 字节缓冲输入流: java.io.BufferedInputStream extends InputStream
 * 子类共性成员方法:
 *  - public void read(); 从输入流中读取数据的下一个字节
 *  - public void read(byte[] b); 中输入流读取一定数量的字节,将其存储再缓冲区数组b中
 *  - void close();
 *
 * 构造方法:
 *  - BufferedInputStream(OutputStream out); 创建新的缓冲输入流
 *  - BufferedInputStream(OutputStream out, int size); 创建具有指定缓冲区大小的新的缓冲输出流
 *
 * 步骤:
 *  1.创建FileInputStream对象,构造方法中绑定要读取的数据源
 *  2.创建BufferedInputStream对象，构造方法中传递FileInputStream对象,提高FileInputStream对象读取效率
 *  3.使用BufferedInputStream对象的read();读取数据
 *  4.释放资源
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\bis.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        /*int len = 0;
        while((len=bis.read()) != -1){
            System.out.println(len);
        }*/

        byte[] bytes = new byte[1024];
        int len = 0;
        while((len=bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        bis.close();
    }
}
