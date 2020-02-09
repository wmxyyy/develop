package cn.wmxyyy.Exception;

/**
 * @author wmxyyy
 * @date 2019/12/14 12:41
 * @state throw关键字:在指定的方法中抛出指定的异常
 *                throw new xxxException("异常产生的原因");
 * 注意:
 *  - throw关键字必须写在方法内部
 *  - throw关键字创建的异常对象必须是Exception或者是它的子类对象
 *  - throw关键字抛出指定的异常对象，必须要处理
 *      - 运行异常对象可以不处理,交给JVM处理
 *          - NullPointerException
 *          - ArrayIndexOutOfBoundsException
 *      - 编译异常对象必须处理(throws或者try...catch)
 */
public class ExceptionDemo03 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int e = getElement(arr, 3);
        System.out.println(e);
    }

    /**
     * 合法性校验后获取数组指定索引的元素
     * @param arr
     * @param index
     * @return
     */
    private static int getElement(int[] arr, int index) {
        if (arr == null){
            throw new NullPointerException("传递的数组是null");
        }
        if (index < 0 || index > arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超过了数组范围");
        }

        return arr[index];
    }
}
