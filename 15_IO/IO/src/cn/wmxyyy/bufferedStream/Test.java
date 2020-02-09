package cn.wmxyyy.bufferedStream;

import java.io.*;
import java.util.HashMap;
import java.util.Set;

/**
 * @author wmxyyy
 * @date 2019/12/16 20:08
 * @state 文本段落排序
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //创建缓冲字符输入流
        BufferedReader br = new BufferedReader(new FileReader("file\\aaa\\in.txt"));
        //创建缓冲字符输出流
        BufferedWriter bw = new BufferedWriter(new FileWriter("file\\aaa\\out.txt"));
        //分割句子的存储集合
        HashMap<Integer,String> map = new HashMap<>();

        //读取文件的每一行,分割数字和文字
        String line;
        while((line=br.readLine())!=null){
            String[] split = line.split("\\.");
            map.put(Integer.valueOf(split[0]),split[1]); //key是自动排序的
        }

        //遍历集合,获取每一个键值对
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet){
            String value = map.get(key);
            String newLine = key + "." + value;
            bw.write(newLine);
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}
