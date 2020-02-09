package cn.wmxyyy.test;

import java.util.*;

/**
 * @author wmxyyy
 * @date 2019/12/13 21:04
 * @state 计算一个字符串中每个字符出现的次数
 */
public class MapTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        //1.创建Map集合,key是字符串中的字符，value是字符的个数
        HashMap<Character,Integer> map = new HashMap<>();
        //2.遍历字符串，获取每个字符
        for(char c : str.toCharArray()){
            //3.获取的每一个字符去判断key是否存在
            if (map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                //key不存在
                map.put(c,1);
            }
        }
        /*for(int i = 0;i<str.length();i++){
            //3.获取的每一个字符去判断key是否存在
            char c = str.charAt(i);
            if (map.containsKey(c)){
                //key存在
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else {
                //key不存在
                map.put(c,1);
            }
        }*/

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("字符" + key + "出现的次数" + value);
        }
    }
}
