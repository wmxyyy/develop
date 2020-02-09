package cn.wmxyyy.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/14 13:20
 * @state try..catch:异常处理的第二种方式
    *     try{
    *        可能产生异常的代码
    *     }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
    *           //异常的处理逻辑(工作中会把异常的信息记录到一个日志)
    *           String getMessage() 返回此 throwable 的简短描述。
    *           String toString() 返回此 throwable 的详细消息字符串。
    *           void printStackTrace()  JVM打印异常对象,默认此方法,打印的异常信息是最全面的
    *    }
 */
public class ExceptionDemo05 {
    public static void main(String[] args){
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        }
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

