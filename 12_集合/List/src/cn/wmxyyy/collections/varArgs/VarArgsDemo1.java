package cn.wmxyyy.collections.varArgs;

/**
 * @author wmxyyy
 * @date 2019/12/13 17:23
 * @state 可变参数
 *  - 使用前提:当方法参数列表数据类型已经确定,但是参数的个数不确定
 *  - 使用格式:修饰符 返回值类型 方法名(数据类型...变量名){}
 *  - 原理:底层是一个数组根据传递参数个数不同，会创建不同长度的数组来存储参数(0个或者多个)
 *  - 注意:一个方法的参数列表，只能有一个可变参数，位于参数列表的末尾
 */
public class VarArgsDemo1 {
    public static void main(String[] args) {
        int sum = add(32, 421, 42, 442, 1, 412, 4, 124, 1, 4, 1, 1, 4, 2);
        System.out.println(sum);
    }

    //可变参数写法
    public static void method(Object...obj){}

    //计算0-n 整数和的方法
    public static int add(int...arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }
}
