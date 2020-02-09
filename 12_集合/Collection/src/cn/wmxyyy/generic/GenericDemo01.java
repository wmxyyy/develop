package cn.wmxyyy.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author wmxyyy
 * @date 2019/12/12 21:46
 * @state 泛型: 预支地使用未知的类型.创建集合对象使用泛型
 * (1)避免类型转换
 * (2)只能存储同一种类型
 */
public class GenericDemo01 {
    public static void main(String[] args) {
        //show01();
        show02();
    }
    /*
        集合对象使用泛型
     */
    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s + " ->" + s.length());
        }
    }

    /*
        集合对象不使用泛型
     */
    private static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add("abcd");
        list.add(1);

        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);

            //调用String类型特有的方法length(),向下转型
            //抛出ClassCastException类型转换异常,不能把Integer类型转换为String类型
            String s = (String)obj;
            System.out.println(s.length());

        }
    }
}
