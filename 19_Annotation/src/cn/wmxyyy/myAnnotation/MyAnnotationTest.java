package cn.wmxyyy.myAnnotation;

import java.lang.reflect.Method;

/**
 * @author wmxyyy
 * @date 2019/12/22 13:48
 * @state
 */
@MyAnnotationDemo04(className = "cn.wmxyyy.domain.Cat",methodName = "show")
public class MyAnnotationTest {
    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<MyAnnotationTest> myAnnotationTestClass = MyAnnotationTest.class;
        //2.获取注解对象(其实就是再内存中生成了一个该注解接口的子类实现对象)
        MyAnnotationDemo04 annotation = myAnnotationTestClass.getAnnotation(MyAnnotationDemo04.class);
        /*
            public class MyAnnotationDemo04Impl implements MyAnnotationDemo04{
                public String className(){
                    return "cn.wmxyyy.domain.cat";
                }
                public String methodName(){
                    return "show";
                }
            }
         */
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = annotation.className();
        String methodName = annotation.methodName();

        System.out.println(className);
        System.out.println(methodName);

        //4.加载该类进内存
        Class cls = Class.forName(className);
        //5.创建对象
        Object obj = cls.newInstance();
        //6.获取方法对象
        Method method = cls.getMethod(methodName);
        //7.执行方法
        method.invoke(obj);
    }
}
