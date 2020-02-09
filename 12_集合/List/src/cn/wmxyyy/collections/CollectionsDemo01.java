package cn.wmxyyy.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author wmxyyy
 * @date 2019/12/13 15:56
 * @state Collections是集合工具类，用来对集合进行操作
 *  - public static <T> boolean addAll(Collection<T> c, T... elements); 往集合添加一些元素
 *  - public static void shuffle(List<?> list); 打乱集合顺序
 */
public class CollectionsDemo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "a", "b", "c", "d");
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
    }
}
