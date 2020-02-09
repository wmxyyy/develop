package cn.wmxyyy.copyFile;

import java.io.*;

/**
 * @author wmxyyy
 * @date 2019/12/15 19:05
 * @state
 */
public class CopyFile {
    public static void main(String[] args) throws IOException {
        File source = new File("file\\fis02.txt");
        File destination = new File("file\\file02.txt");

        FileInputStream fis = new FileInputStream(source);
        FileOutputStream fos = new FileOutputStream(destination);

        //读取文件
        byte [] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes);
        }

        fos.close();
        fis.close();
    }
}
