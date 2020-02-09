package cn.wmxyyy.annotation;

/**
 * @author wmxyyy
 * @date 2019/12/22 12:22
 * @state 注解javadoc演示
 * @since 1.5
 *
 * 注解(元数据):
 * - JDK1.5之后的新特性
 * - 说明程序
 * - @注解名称
 *
 * 作用分类:
 * - 编写文档
 * - 代码分析
 * - 编译检查
 */
public class AnnotationDemo01 {
    /**
     * 计算两数之和
     * @param a 整数
     * @param b 整数
     * @return 两数之和
     */
    public int add(int a, int b){
        return a + b;
    }
}
