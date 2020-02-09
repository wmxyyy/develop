package cn.wmxyyy.Exception;

/**
 * @author wmxyyy
 * @date 2019/12/14 12:28
 * @state 异常产生过程解析
 */
public class ExceptionDemo02 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int e = getElement(arr, 3); //2.调用者接收异常对象,没有异常处理再抛给JVM处理
    }

    private static int getElement(int[] arr, int index) {
        int element = arr[index]; //1.产生异常对象,该方法没有异常处理会抛出给调用者main方法
        return element;
    }
}
//3.JVM接收异常对象打印在控制台,再终止当前程序(中断处理)