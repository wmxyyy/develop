package cn.wmxyyy.printStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author wmxyyy
 * @date 2019/12/17 12:47
 * @state 打印流可以改变输出语句的目的地(打印流的流向)
 *  - static void setOut(PrintStream out);
 */
public class PrintStreamDemo02 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("控制台输出");

        PrintStream ps = new PrintStream("file\\print.txt");
        System.setOut(ps);

        System.out.println("打印流的目的地中输出");

        ps.close();
    }
}
