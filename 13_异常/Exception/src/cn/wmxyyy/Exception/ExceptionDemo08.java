package cn.wmxyyy.Exception;

/**
 * @author wmxyyy
 * @date 2019/12/14 14:05
 * @state 父子类的异常:
 *  - 父类方法抛出多个异常，子类重写方法可抛出和父类相同的异常或者是异常的子类或者不抛出异常
 *  - 父类方法没有抛出异常,子类重写方法也不可抛出异常，只能捕获处理
 */
public class ExceptionDemo08 {
    public void show01() throws NullPointerException,ClassCastException{}
    public void show02() throws IndexOutOfBoundsException{}
    public void show03() throws IndexOutOfBoundsException{}
    public void show04(){}
}



