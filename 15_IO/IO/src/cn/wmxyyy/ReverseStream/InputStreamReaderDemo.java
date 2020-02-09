package cn.wmxyyy.ReverseStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author wmxyyy
 * @date 2019/12/16 21:21
 * @state InputStreamReader:java.io.InputStreamReader extends Reader
 * 字节流通向字符流的桥梁，它使用指定的charset读取字节并将其解码为字符
 *
 * 子类共性方法:
 *  - int read();
 *  - int read(char[] chuf);
 *  - close();
 *
 * 构造方法:
 *  - InputStreamReader(InputStream in)
 *  - InputStreamReader(InputStream, String charsetName);
 *
 * 步骤:
 * 1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的字符编码
 * 2.使用对象的read():读取文件
 * 3.释放资源
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\aaa\\gbk.txt"));
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();*/

        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\aaa\\gbk.txt"),"GBK");
        int len = 0;
        while ((len=isr.read())!=-1){
            System.out.println((char)len);
        }
        isr.close();
    }
}
