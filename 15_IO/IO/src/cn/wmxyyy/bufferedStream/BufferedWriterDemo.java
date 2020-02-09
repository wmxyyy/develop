package cn.wmxyyy.bufferedStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/16 19:34
 * @state 字符缓冲输出流:java.io.BufferedWriter extends Writer
 * 子类共性方法:
 *  - void write(int c):
 *  - void write(char[] cbuf);
 *  - void write(char[] cbuf, int off, int len);
 *  - void write(String str);
 *  - void write(String str, int off, int len);
 *  - void flush();
 *  - void close();
 *
 * 构造方法:
 *  - BufferedWriter(Writer out);
 *  - BufferedWriter(Writer out, int size);
 *
 * 特有的成员方法:
 *  - void newLine();写入一个行分隔符
 *      换行:换行符号  windows:\r\n   linux:/n   mac:/r
 *
 * 步骤:
 * 1.创建字符缓冲输出流对象,构造方法中传递字符输出流
 * 2.调用字符缓冲输出流的write();把数据写入到内存缓冲区中
 * 3.调用字符缓冲输出流中的flush();把内存缓冲区中的数据刷新到文件中
 * 4.释放资源
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\bw.txt"));
        bw.write("归属感浮动");
        bw.newLine();
        bw.write("归属感浮动");
        bw.write("\r\n");
        bw.write("归属感浮动");

        bw.flush();
        bw.close();
    }
}
