package cn.wmxyyy.reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author wmxyyy
 * @date 2019/12/20 20:13
 * @state 创建任意类的对象，则以执行任意方法
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //1.创建Properties对象
        Properties pro = new Properties();
        //2.加载配置文件，转换为一个集合
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //3.获取配置文件中定于的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

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
