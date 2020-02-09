package cn.wmxyyy.outputStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author wmxyyy
 * @date 2019/12/15 13:22
 * @state 一次写入多个字节
 *  - public void write(byte[] b); 将b.length字节从 指定的字节数组 写入此输出流
 *  - public void write(byte[] b, int off, int len); 从偏移量off开始的指定len长度字节数组写入到此输出流
 */
public class OutputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("file\\fos02.txt");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(49);
        fos.write(48);
        fos.write(48);

        byte[] bytes = {63,64,65,66,67,68};
        fos.write(bytes);
        fos.write(bytes,2,3);

        byte[] bytes2 = "你好啊".getBytes();
        System.out.println(Arrays.toString(bytes));
        fos.write(bytes2);

        fos.close();

    }
}
