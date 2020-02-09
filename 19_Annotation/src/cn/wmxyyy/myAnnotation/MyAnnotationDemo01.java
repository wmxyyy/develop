package cn.wmxyyy.myAnnotation;

import cn.wmxyyy.domain.Person;

/**
 * @author wmxyyy
 * @date 2019/12/22 12:31
 * @state 自定义注解
 * 格式:
 *  元注解
 *  public @interface 注解名称{
 *        属性列表;
 *  }
 * 属性:接口中的抽象方法
 * 		1. 属性的返回值类型有下列取值
 * 		   - 基本数据类型
 * 		   - String
 * 		   - 枚举
 * 		   - 注解
 * 		   - 以上类型的数组
 *      2. 定义了属性在使用时需要给属性赋值
 * 		   - 如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值。
 * 		   - 如果只有一个属性需要赋值，并且属性的名称是value，则value可以省略直接定义值
 * 		   - 数组赋值时，值使用{}包裹。如果数组中只有一个值，则{}可以省略
 *
 * 本质:注解本质就是一个接口，该接口默认继承Annotation接口
 *  - public interface MyAnnotationDemo01 extends java.lang.annotation.Annotation{}
 */
public @interface MyAnnotationDemo01 {
    int value(); //特殊
    int age(); //基本数据类型
    String name(); //String
    Person per() default Person.P1; //枚举
    MyAnnotationDemo02 anno2(); //注解类型
    String [] str(); //数组
}
