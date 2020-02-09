package cn.wmxyyy.Exception;

/**
 * @author wmxyyy
 * @date 2019/12/14 13:42
 * @state finally有return语句,永远返回finally中的结果
 */
public class ExceptionDemo07 {
    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    private static int getA() {
        int a = 10;
        try {
            return a;
        }catch (Exception e){
            System.out.println(e);
        }finally {
            a = 100;
            return a;
        }
    }
}
