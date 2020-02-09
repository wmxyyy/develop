package cn.wmxyyy.bufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/16 19:51
 * @state 字符缓冲输入流:java.io.BufferedReader extends Reader
 *
 * 子类共性方法:
 *  - int read();
 *  - int read(char[] cbuf);
 *  - void close();
 *
 * 构造方法:
 *  - BufferedReader(Reader in);
 *  - BufferedReader(Reader in, int size);
 *
 * 特有的成员方法:
 *  - String readLine();读取一行数据
 *      行终止符号: ('\n')、('\r')、(\r\n)
 *      返回值:包含该行内容的字符串，不包含终止符。若到达末尾则返回null
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("file\\br.txt"));

        /*String line = br.readLine();
        System.out.println(line);
        line = br.readLine();
        System.out.println(line);*/

        String line;
        while ((line=br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}
