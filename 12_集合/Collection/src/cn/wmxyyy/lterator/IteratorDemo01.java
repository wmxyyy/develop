package cn.wmxyyy.lterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author wmxyyy
 * @date 2019/12/12 21:11
 * @state java.util.Iterator接口:迭代器(对集合进行遍历)，不能直接使用
 *              boolean hasNext(); 判断集合中是否还有下一个元素
 *              E next();返回迭代ide下一个元素
 *
 * Collection接口中iterator()方法,返回迭代器的实现类对象
 * Iterator<E> iterator() 返回在此collection的元素进行迭代的迭代器
 */
public class IteratorDemo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //1.使用集合中的方法iterator()过去迭代器实现对象
        Iterator<String> it = coll.iterator();
        //2.hasNext()判断是否还有下一个元素
        while (it.hasNext()) {
            //3.next()取出集合中的下一个元素
            String e = it.next();
            System.out.println(e);
        }
    }
}
