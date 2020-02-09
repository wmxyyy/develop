package cn.wmxyyy.lterator;

import java.util.ArrayList;

/**
 * @author wmxyyy
 * @date 2019/12/12 21:34
 * @state 增强for循环底层也是迭代器，用来遍历集合和数组
 */
public class IteratorDemo02 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("aaa");
        lists.add("bbb");
        lists.add("ccc");
        lists.add("ddd");

        //增强for循环遍历集合
        for(String list : lists){
            System.out.println(list);
        }

        //增强for循环遍历数组
        int [] arrs = {1, 4, 5, 6, 4, 2, 3};
        for (int arr : arrs){
            System.out.print(arr + " ");
        }
    }
}
