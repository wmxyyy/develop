package cn.wmxyyy.file;

import java.io.File;

/**
 * @author wmxyyy
 * @date 2019/12/15 14:15
 * @state File类判断功能:
 *  - public boolean exists();
 *  - public boolean isDirectory();
 *  - public boolean is File();
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File f1 = new File("X:\\Workspaces\\IntelliJ_IEDA\\1_Java语法基础\\15_IO\\IO\\file\\file04.txt");
        System.out.println(f1.exists());
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        File f2 = new File("File.iml");
        System.out.println(f2.exists());
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }
}
