package cn.wmxyyy.inputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/15 18:22
 * @state 字节输入流一次读取多个字节的方法
 * - int read(byte[] b) 从输入流中读取一定数量的字节将其存储在缓冲区数组b中
 *      - byte[]:缓冲作用，存储每次读到的多个字节(一般为1024的整数倍)
 *      - 返回值:每次读取有效字节的个数
 *
 * String类的构造方法
 *      - String(byte[] bytes):把字节数组转换为字符串
 *      - String(byte[] bytes, int offset, int length):把字节数组从offset开始的length个转换为字符串
 */
public class InputStreamDemo02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file\\fis02.txt");
        /*byte[] bytes = new byte[2];
        int len = fis.read(bytes);
        System.out.println(len); //2
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));
        */

        byte[] bytes = new byte[2]; //存储读取到的多个字节
        int len = 0; //记录每次读取的有效字节个数
        while ((len = fis.read(bytes)) != -1){
            System.out.println(new String(bytes,0, len));
        }
    }
}
