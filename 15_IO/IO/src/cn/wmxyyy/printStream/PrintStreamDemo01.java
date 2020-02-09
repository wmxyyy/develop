package cn.wmxyyy.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author wmxyyy
 * @date 2019/12/17 12:36
 * @state 打印流 java.io.PrintStream extends OutputStream
 * 作用:为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式
 *
 * 特点:
 *  - 只负责数据的输出，不负责数据的读取，
 *  - 与其他输出流不同，PrintStream永远不会抛出IOException
 *  - 特有方法 print(),println()
 *
 * 构造方法:
 *  - PrintStream(File file);输出的目的地是一个文件
 *  - PrintStream(OutputStream out);输出的目的地是一个字节输出流
 *  - PrintStream(String fileName);输出的目的地是一个文件路径
 *
 * 注意:
 *  - 使用父类的write(); 如 97 -> a
 *  - 使用print()/println(); 如 97 -> 97
 */
public class PrintStreamDemo01 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("file\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.println('a');
        ps.println("hello word");

        ps.close();
    }
}
