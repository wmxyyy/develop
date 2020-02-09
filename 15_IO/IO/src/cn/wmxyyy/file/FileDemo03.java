package cn.wmxyyy.file;

import java.io.File;

/**
 * @author wmxyyy
 * @date 2019/12/15 13:59
 * @state File类获取功能:
 *  - public String getAbsolutePath(); 返回File的绝对路径字符串
 *  - public String getPath(); 返回File转换为路径名字字符串(获取构造方法中传递的路径，toString()就是调用getPath();)
 *  - public String getName(); 返回File表示文件或目录的名称
 *  - public long length(); 返回文件长度,字节为单位。文件夹为0
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File f1 = new File("X:\\Workspaces\\IntelliJ_IEDA\\1_Java语法基础\\15_IO\\IO\\file\\file03.txt");
        System.out.println(f1.getAbsoluteFile());
        System.out.println(f1.getPath());
        System.out.println(f1.getName());

        File f2 = new File("b.txt");
        System.out.println(f2.getAbsoluteFile());
        System.out.println(f2.getPath());
        System.out.println(f2.getName());
    }
}
