package cn.wmxyyy.bufferedStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/16 17:19
 * @state 字节缓冲输出流: java.io.BufferedOutputStream extends OutputStream
 * 子类共性成员方法:
 *  - public void close();
 *  - public void flush();
 *  - public void write(int b);
 *  - public void write(byte[] b)
 *  - public void write(byte[] b, int off, int len);
 *
 * 构造方法:
 *   - BufferedOutputStream(OutputStream out); 创建新的缓冲输出流，将数据写入指定的底层输出流
 *   - BufferedOutputStream(OutputStream out, int size); 创建新的缓冲输出流，将以指定的缓冲区大小的数据写入指定的底层输出流
 *
 * 步骤:
 *  1.创建FileOutputStream对象,构造方法中绑定要输出的目的地
 *  2.创建BufferedOutputStream对象，构造方法中传递FileOutputStream对象,提高FileOutputStream对象效率
 *  3.使用BufferedOutputStream对象的write();把数据写入内部缓冲区中
 *  4.使用BufferedOutputStream对象的flush();把内部缓冲区的数据刷新到文件中
 *  5.释放资源(会先调用flush方法刷新数据,第4步可省略)
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file\\bos.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        bos.write("我把数据写入到内部缓冲区中".getBytes());
        bos.flush();
        bos.close();
    }
}
