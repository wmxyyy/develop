package cn.wmxyyy.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author wmxyyy
 * @date 2019/12/12 20:47
 * @state Collection接口:所有单列集合的最顶级接口，包含一些共性方法
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();

        //1.public boolean add(E e);
        coll.add("张三");
        coll.add("李四");
        coll.add("赵六");
        System.out.println("1." + coll);

        //2.public boolean remove(E e);
        coll.remove("赵六");
        System.out.println("2." + coll);

        //3.public boolean contains(E e);
        boolean b1 = coll.contains("李四");
        System.out.println("3.集合是否包含李四？" + b1);

        //4.public int size();
        int size = coll.size();
        System.out.println("4.集合中的元素个数:" + size);

        //5.public boolean isEmpty();
        System.out.println("5.集合是否为空? " + coll.isEmpty());

        //6.public Object[] toArray();
        Object[] arr = coll.toArray();
        System.out.print("6.数组: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //7.public void clear(); 清空元素，集合还存在
        coll.clear();
        System.out.println();
        System.out.println("7.集合是否为空? " + coll.isEmpty());
    }
}
