package cn.wmxyyy.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author wmxyyy
 * @date 2019/12/14 13:35
 * @state try...catch...finally
 *        try{
 *             可能产生异常的代码
 *         }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *             异常的处理逻辑
 *         }finally{
 *             无论是否出现异常都会执行
 *         }
 * 注意:
 *  - finally不能单独使用,必须和try一起使用
 *  - finally一般用于资源释放(无论程序是否异常,最后都要资源释放)
 */
public class ExceptionDemo06 {
    public static void main(String[] args) {
        try {
            readFile("c:\\a.tx");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("释放资源");
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
