package cn.wmxyyy.file;

import java.io.File;

/**
 * @author wmxyyy
 * @date 2019/12/15 14:45
 * @state File类遍历目录功能:
 *  - public String[] list(); 返回一个String数组，表示该File目录中所有子文件或目录
 *  - public File[] listFiles(); 返回一个File数组，表示该File目录中所有子文件或目录
 *
 *  - 两者遍历的是构造方法的目录
 *  - 如果指定目录不存在或者不是一个目录都会抛出空指针异常
 */
public class FileDemo06 {
    public static void main(String[] args) {
        File file = new File("file\\bbb");

        //list();获取目录中所有文件/文件夹的名称
        String[] lists = file.list();
        for(String list : lists){
            System.out.println(list);
        }

        //listFiles();会获取目录中所有的文件/文件夹封装为File对象
        File[] files = file.listFiles();
        for (File f : files){
            System.out.println(f);
        }
    }
}
