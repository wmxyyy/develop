package cn.wmxyyy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author wmxyyy
 * @date 2019/12/13 16:42
 * @state java.utils.Collections是集合工具类，用来对集合进行操作
 *  - public static <T> void sort(List<T> list, Comparator<? super T>); 将集合中元素按照制定规则排序
 *
 *  - Comparator和Comparator的区别
 *      (1)Comparable: 自己(this)和别人(o)比较,需要实现Comparator接口,重写compareTo();
 *      (2)Comparator: 相当于找一个第三方去比较两个
 */
public class CollectionsDemo03 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(2);
        System.out.println(list);

        //数字排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;//升序
            }
        });

        System.out.println(list);

        //对象排序
        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("王任",45));
        list2.add(new Student("王光",48));
        list2.add(new Student("ay",12));
        list2.add(new Student("az",12));

        /*Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(list2);*/

        //按照年龄升序排序，如果两个年龄相同，再使用姓名的第一个字比较
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int result = o1.getAge() - o2.getAge();
                if (result == 0) {
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list2);
    }
}
