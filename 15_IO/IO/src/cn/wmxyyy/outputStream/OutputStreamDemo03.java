package cn.wmxyyy.outputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/15 17:08
 * @state 追写/续写
 *  - FileOutputStream(String name, boolean append)
 *  - FileOutputStream(File name, boolean append)
 *
 *  参数:boolean append
 *      true: 在文件结尾追加写数据
 *      false: 创建新文件覆盖源文件
 *
 *  换行:
 *  window:\r\n
 *  linux:/n
 */
public class OutputStreamDemo03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("file\\fos03.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("你好".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();
    }
}
