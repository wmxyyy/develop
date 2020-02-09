package cn.wmxyyy.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wmxyyy
 * @date 2019/12/13 12:09
 * @state List接口 extends Collection接口
 * 特点:
 *  - 有序集合，存取顺序一致
 *  - 索引
 *  - 允许存储重复元素
 *
 * 特有方法:
 *  - public void add(int index, E element);
 *  - public E get(int index);
 *  - public E remove(int index);
 *  - public E set(int index, Element);
 */
public class ListDemo01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        //public void add(int index, E element);
        list.add(1,"yy");
        System.out.println(list);

        //public E remove(int index); 返回被移除的元素
        String remove = list.remove(1);
        System.out.println("被移除的元素是" + remove);
        System.out.println(list);

        //public E set(int index, E element); 返回被替代的元素
        String set = list.set(0, "A");
        System.out.println("被替代的元素是" + set);
        System.out.println(list);

        //List集合遍历三种方式
        //普通for循环
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s + " ");
        }

        //使用迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String next = it.next();
            System.out.print(next + " ");
        }

        //使用增强for
        for (String s : list){
            System.out.print(s + " ");
        }
    }
}
