package cn.wmxyyy.objectStream;

import java.io.*;
import java.util.ArrayList;

/**
 * @author wmxyyy
 * @date 2019/12/17 12:28
 * @state 对象集合的序列化
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file\\oos.txt"));

        //创建对象集合,添加元素
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("佛山",9999));
        list.add(new Person("北京",9999));
        list.add(new Person("广州",9999));

        oos.writeObject(list);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file\\oos.txt"));
        Object o = ois.readObject();

        ArrayList<Person> persons = (ArrayList<Person>) o;
        for (Person person : persons){
            System.out.println(person.getName() + " " + person.getAge());
        }


    }
}
