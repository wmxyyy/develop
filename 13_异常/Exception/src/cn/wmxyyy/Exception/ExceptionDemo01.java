package cn.wmxyyy.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author wmxyyy
 * @date 2019/12/14 12:07
 * @state java.lang.Exception 类是Java语言中所有错误或异常的超类
 *              Exception:编译期异常
 *                  RuntimeException:运行期异常
 *              Error:错误
 */
public class ExceptionDemo01 {
    public static void main(String[] args) {
        //编译器异常
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
        Date date = null;
        try {
            date = sdf.parse("1999-0909");//把字符串格式的日期,解析为Date格式的日期
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);*/

        //运行期异常
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);

        //Error:错误
        /*int[] arr = new int[1024*1024*1024];*/
    }
}


