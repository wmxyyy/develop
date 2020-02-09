package cn.wmxyyy.ReverseStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @author wmxyyy
 * @date 2019/12/16 20:56
 * @state OutputStreamWriter:java.io.OutputStreamWriter extends Writer
 *  字符流到字节流的桥梁，可使用指定的charset将要写入流中的字符编码成字节
 *
 * 子类的共性方法:
 *  - void write(int c);
 *  - void write(char[] cbuf);
 *  - void write(char[] cbuf, int off, int len);
 *  - void write(String str);
 *  - void flush();
 *  - void close();
 *
 * 构造方法:
 *  - OutputStreamWriter(OutputStream out);
 *  - OutputStreamWriter(OutputStream out, String charsetName);
 *
 * 使用步骤:
 * 1.创建OutputStreamWriter对象,构造方法传递字节输出流和指定的编码
 * 2.使用对象write();把字符转换为字节存储缓冲区中(编码)
 * 3.使用对象flush();把内存缓冲区中的字节刷新到文件中(使用字节流写字节的过程)
 * 4.释放资源
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("file\\aaa\\gbk.txt"));
        osw2.write("你好吗");
        osw2.flush();
        osw2.close();*/

        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\aaa\\gbk.txt"),"GBK");
        osw.write("你好吗");
        osw.flush();
        osw.close();

    }
}
