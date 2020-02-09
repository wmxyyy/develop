package cn.wmxyyy.set.hashCode;

/**
 * @author wmxyyy
 * @date 2019/12/13 14:37
 * @state 哈希值:是一个十进制的整数(对象地址值-逻辑地址，不是数据实际存储的物理地址)
 * Object类 int hashCode() 返回该对象的哈希值
 * 源码:
 *    public native int hashCode();  // native:代表该方法调用的是本地操作系统的方法
 */
public class HashCodeDemo01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        int h1 = p1.hashCode();
        System.out.println(h1);

        Person p2 = new Person();
        int h2 = p2.hashCode();
        System.out.println(h2);

        /*
            toString方法的源码:
                return getClass().getName() + "@" + Integer.toHexString(hashCode());
         */
        System.out.println(p1);
        System.out.println(p2);

        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("----------------------------");
        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());
        System.out.println("重地" == "通话");
        System.out.println("重地".equals("通话"));

    }
}
