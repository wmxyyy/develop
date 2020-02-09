package cn.wmxyyy.objectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author wmxyyy
 * @date 2019/12/17 11:50
 * @state 对象的序列化流 java.io.ObjectOutputStream extends OutputStream
 * 作用:把对象以流的方式写入文件中保存
 *
 * 构造方法:
 * `- ObjectOutputStream(OutputStream out);创建写入OutputStream的ObjectOutputStream
 *
 * 特有方法:
 *  - void writeObject(Object obj);将指定的对象写入ObjectOutputStream
 *
 * 步骤:
 * 1.创建ObjectOutputStream对象，构造方法中传递字节输出流
 * 2.使用ObjectOutputStream对象中的方法writeObject();把对象写入到文件中
 * 3.释放资源
 */
public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\oos.txt"));
        oos.writeObject(new Person("wmxyyy",23));

        oos.close();
    }
}
