package cn.wmxyyy.myAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wmxyyy
 * @date 2019/12/22 13:41
 * @state 程序中解析(使用)注解:获取注解中定义的属性值
 * 1.获取注解定义的位置对象
 * 2.获取指定的注解
 * 3.调用注解中的抽象方法获取配置的属性值
 */

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationDemo04 {
    String className();
    String methodName();
}
