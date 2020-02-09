package cn.wmxyyy.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/14 13:01
 * @state throws关键字:异常处理的第一种方式，把异常对象声明抛出给方法的调用者处理
 * 注意:
 *  - throws关键字位于方法生命处
 *  - throws关键字后边声明的异常必须是Exception和它的子类
 *  - 方法内部抛出了多个异常对象，throws也必须声明多个异常(如果存在父子关系，直接声明父类)
 */
public class ExceptionDemo04 {
    public static void main(String[] args) throws IOException {
        readFile("c:\\a.tx");
    }

    private static void readFile(String fileName) throws IOException{
        if (!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
        if (!fileName.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
        System.out.println("路径ok");
    }
}
