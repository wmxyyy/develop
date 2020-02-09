package cn.wmxyyy.ReverseStream;

import java.io.*;

/**
 * @author wmxyyy
 * @date 2019/12/16 21:42
 * @state 转换文件编码
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("file\\aaa\\gbk.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("file\\aaa\\utf8.txt"),"UTF-8");

        int len = 0;
        while ((len=isr.read())!=-1){
            osw.write(len);
        }
        osw.close();
        isr.close();
    }
}
