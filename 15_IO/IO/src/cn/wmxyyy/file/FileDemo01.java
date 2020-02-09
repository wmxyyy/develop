package cn.wmxyyy.file;

import java.io.File;

/**
 * @author wmxyyy
 * @date 2019/12/15 12:39
 * @state java.io.File类:文件和目录路径名的抽象表示形式
 *    C:\develop\a\a.txt  windows
 *    C:/develop/a/a.txt  linux
 *    "C:"+File.separator+"develop"+File.separator+"a"+File.separator+"a.txt"
 */
public class FileDemo01 {
    public static void main(String[] args) {
        //路径分隔符 :
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator); //windows:分号;  linux:冒号:

        //文件名称分隔符
        String separator = File.separator;
        System.out.println(separator); //windows:反斜杠\  linux:正斜杠/
    }
}
