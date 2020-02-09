package cn.wmxyyy.file;

import java.io.File;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/15 14:25
 * @state File类创建删除功能:
 *  - public boolean creteNewFile(); 当且仅当该名称文件不存在时，创建一个新的空文件
 *  - public boolean delete();
 *  - public boolean mkdir(); 创建File表示的目录
 *  - public boolean mkdirs(); 创建File表示的目录,包括多级目录
 */
public class FileDemo05 {
    public static void main(String[] args) throws IOException {
        //creteNewFile();
        File f1 = new File("X:\\Workspaces\\IntelliJ_IEDA\\1_Java语法基础\\15_IO\\IO\\file\\file05.txt");
        System.out.println(f1.createNewFile());

        File f2 = new File("file\\file5.2.txt");
        System.out.println(f2.createNewFile());

        //mkdir();
        File f3 = new File("file\\aaa");
        System.out.println(f3.mkdir());

        //mkdirs();
        File f4 = new File("file\\bbb\\ccc");
        System.out.println(f4.mkdirs());

        //delete();
        /*System.out.println(f2.delete());
        System.out.println(f4.delete());*/
    }
}
