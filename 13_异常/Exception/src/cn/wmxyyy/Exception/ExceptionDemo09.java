package cn.wmxyyy.Exception;

/**
 * @author wmxyyy
 * @date 2019/12/14 14:11
 * @state 继承ExceptionDemo08
 */
public class ExceptionDemo09 extends ExceptionDemo08 {
    @Override
    //抛出和父类相同的异常
    public void show01() throws NullPointerException, ClassCastException {}

    @Override
    //抛出父类异常的子类
    public void show02() throws ArrayIndexOutOfBoundsException {}

    @Override
    //不抛出异常
    public void show03(){}

    @Override
    //父类方法没有抛出异常，子类重写父类该方法时也不可抛出异常
    public void show04(){
        try {
            throw new Exception("编译器异常");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
