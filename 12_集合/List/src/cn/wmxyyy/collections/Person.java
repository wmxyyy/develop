package cn.wmxyyy.collections;

/**
 * @author wmxyyy
 * @date 2019/12/13 16:21
 * @state
 */
public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //return 0; //0认为元素是相同的，负数是升序，正数为降序

        //自定义比较规则
        return this.getAge() - o.getAge(); //年龄升序
//        return o.getAge() - this.getAge(); //年龄降序
    }
}
