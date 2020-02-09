package cn.wmxyyy.objectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author wmxyyy
 * @date 2019/12/17 12:10
 * @state 对象的反序列化流 java.io.ObjectInputStream extends InputStream
 * 作用:把文件中保存的对象，以流的方式读取出来使用
 *
 * 构造方法:
 *  - ObjectInputStream(InputStream in) 创建从指定InputStream读取的ObjectInputStream
 *
 * 特有方法:
 *  - Object readObject();从ObjectInputStream读取对象
 *
 * 步骤:
 * 1.创建ObjectInputStream对象，构造方法中传递字节输入流
 * 2.使用ObjectInputStream对象中的方法readObject()读取保存对象的文件
 * 3.释放资源
 * 4.使用读取出来的对象(如打印)
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\oos.txt"));
        Object o = ois.readObject();

        ois.close();
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p.getName() + "-" + p.getAge());
    }
}
