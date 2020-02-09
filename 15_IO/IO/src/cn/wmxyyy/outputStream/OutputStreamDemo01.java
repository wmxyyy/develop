package cn.wmxyyy.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


/**
 * @author wmxyyy
 * @date 2019/12/15 12:49
 * @state java.io.OutputStream:此抽象类是表示字节输出流所有类的超类
 * 子类共性方法:
 *  - public void close(); 关闭此输出流并释放与此流相关联的任何系统资源
 *  - public void flush(); 刷新此输出流并强制任何缓冲的输出字节点被写出
 *  - public void write(byte[] b); 将b.length字节从 指定的字节数组 写入此输出流
 *  - public void write(byte[] b, int off, int len); 从偏移量off开始的指定len长度字节数组写入到此输出流
 *  - public abstract void write(int b); 将指定的字节写入到输出流
 *
 * 文件字节输出流: java.io.FileOutputStream extends OutputStream 把内存中的数据写入到硬盘的文件
 * 构造方法:
 *      FileOutputStream(String name):创建一个指定名称的文件的输出文件流
 *      FileOutputStream(File file):创建一个指定File对象表示的文件的文件输出流
 *
 * 写入数据的原理(内存->硬盘):
 *      java程序 -> JVM -> OS -> OS调用写数据的方法 -> 把数据写入到文件
 *
 * 步骤:
 * 1.创建一个FileOutputStream对象,构造方法传递写入数据的目的地
 * 2.调用FileOutputStream对象的write()
 * 3.释放资源(使用IO流会占用内存)
 *
 */
public class OutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        File file = new File("file\\fos01.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(97);
        fos.write(98);
        fos.write(98);
        fos.write(98);
        fos.close();
    }
}
