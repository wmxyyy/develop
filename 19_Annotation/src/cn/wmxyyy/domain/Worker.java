package cn.wmxyyy.domain;

import cn.wmxyyy.myAnnotation.MyAnnotationDemo01;
import cn.wmxyyy.myAnnotation.MyAnnotationDemo02;
import cn.wmxyyy.myAnnotation.MyAnnotationDemo03;

/**
 * @author wmxyyy
 * @date 2019/12/22 12:59
 * @state 使用自定义注解
 */
@MyAnnotationDemo01(value=70,age = 23,name="china", anno2 = @MyAnnotationDemo02,str = {"a","abc"})
@MyAnnotationDemo03
public class Worker {
    @MyAnnotationDemo03
    public void show(){
        System.out.println("");
    }
}
