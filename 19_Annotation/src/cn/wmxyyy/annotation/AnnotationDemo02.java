package cn.wmxyyy.annotation;

import java.util.Date;

/**
 * @author wmxyyy
 * @date 2019/12/22 12:31
 * @state JDK中预定义的一些注解
 *  - @Override: 检测该注解标注的方法是否继承自父类(接口)
 *  - @Deprecated: 该注解标注的内容表示已经过时
 *  - @SuppressWarnings: 压制警告
 */

@SuppressWarnings("all")
public class AnnotationDemo02 {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷;
    }
    public void show2(){
        //代替show1();
    }
    public void show(){
        show1();
        Date date = new Date();
        date.toGMTString();
    }
}
