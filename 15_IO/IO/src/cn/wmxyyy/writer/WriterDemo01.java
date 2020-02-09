package cn.wmxyyy.writer;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/15 19:55
 * @state java.io.Writer:此抽象类表示字符输出流的所有类的超类
 * 子类共性方法:
 *  - void write(int c);写入单个字符
 *  - void write(char[] cbuf);写入字符数组
 *  - void write(char[] cbuf, int off, int len);
 *  - void write(String str);写入字符串
 *  - void write(String str, int off, int len);
 *  - void flush();刷新该流的缓冲区
 *  - void close();
 *
 *  java.io.FileWriter extends OutputStreamWriter extends Writer
 *  FileWriter文件字符输出流: 把内存中字符数据写入硬盘文件
 *
 * 构造方法:
 *      FileWriter(File file;
 *      FileWriter(String fileName);
 *      FileWriter(String fileName, boolean append);
 *      FileWriter(File file, boolean append);
 *
 *  步骤:
 *  1.创建FileWriter对象
 *  2.使用write();把数据写入内存缓冲区中(字符转为字节的过程)
 *  3.使用flush();把内存缓冲区中的数据刷新到文件中,流对象还能继续使用
 *  4.释放资源(会先把内存缓冲区的数据刷新到文件中，流对象不能再使用)
 */
public class WriterDemo01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("file\\fw01.txt",true);

        //void write(int c)
        fw.write(97);
        fw.flush(); //刷新缓冲区,流对象还能使用
        fw.write(98);

        //void write(char[] cbuf)
        //void write(char[] cbuf, int off, int len);
        char[] chars = {'v', 'r', 'y', 'o'};
        fw.write(chars);
        fw.write(chars,2,2);

        //void write(String str);
        //void write(String str, int off, int len);
        fw.write("王明佛山");
        fw.write("\r\n");
        fw.write("春眠不觉晓",1,2);
        fw.close();
    }
}
