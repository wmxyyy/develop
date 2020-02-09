package cn.wmxyyy.file;

import java.io.File;

/**
 * @author wmxyyy
 * @date 2019/12/15 13:34
 * @state 路径
 * - 绝对路径:完整路径
 * - 相对路径:相对当前的简化路径
 *
 * 方法:
 *  - File(String pathname)
 *  - File(String parent, String child)
 *  - File(File parent, String child)
 *
 * 注意:
 *  - 路径不区分大小写
 *  - 路径中文件名称分隔符windows使用反斜杠(反斜杠是转义字符,两个反斜杠代表一个普通的反斜杠)
 */
public class FileDemo02 {
    public static void main(String[] args) {
        //File(String pathname);
        File f1 = new File("X:\\Workspaces\\IntelliJ_IEDA\\1_Java语法基础\\15_IO\\IO\\file\\file02.txt");
        System.out.println(f1);

        File f2 = new File("b.txt");
        System.out.println(f2);

        //File(String parent, String child)
        File f3 = new File("D://","a.txt");
        System.out.println(f3);

        //File(File parent, String child)
        File parent = new File("D://");
        File f4 = new File(parent,"hello.java");
        System.out.println(f4);

    }
}
