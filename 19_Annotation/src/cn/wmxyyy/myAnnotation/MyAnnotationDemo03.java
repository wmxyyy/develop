package cn.wmxyyy.myAnnotation;

import java.lang.annotation.*;

/**
 * @author wmxyyy
 * @date 2019/12/22 13:09
 * @state 元注解:用于描述注解的注解
 * - @Target:描述注解的作用位置
 *      * ElementType.
 *                  - TYPE: 作用于类上
 *                  - METHOD: 作用于方法上
 *                  - FIELD: 作用于成员变量
 *
 * - @Retention:描述注解被保留的阶段
 *      * @Retention(RetentionPolicy.RUNTIME): 描述注解会保留到class字节码文件中并被JVM读取到
 *
 * - @Document:描述注解是否被抽取到api文档中
 *
 * - @Inherited:描述注解是否被子类继承
 */
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotationDemo03 {

}
