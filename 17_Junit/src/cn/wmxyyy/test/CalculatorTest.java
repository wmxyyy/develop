package cn.wmxyyy.test;

import cn.wmxyyy.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author wmxyyy
 * @date 2019/12/20 20:25
 * @state Junit:白盒测试
 * 步骤:
 *  1.定义一个测试类(被测试的类名Test)
 *  2.定义测试方法:可以独立运行
 *     - 方法名: test测试的方法名
 *     - 返回值: void
 *     - 参数列表: 空参
 *  3.给方法加@Test
 *  4.导入junit依赖坏境
 *
 * 判定结果:
 *  - 红色：失败
 * 	- 绿色：成功
 * 	  一般我们会使用断言操作来处理结果
 * 		- Assert.assertEquals(期望的结果,运算的结果);
 *
 * @Before:
 * 	 - 修饰的方法会在测试方法之前被自动执行
 * @After:
 * 	 - 修饰的方法会在测试方法执行之后自动被执行
 */
public class CalculatorTest {
    /**
     * 初始化方法:用于资源申请，所有的测试方法在执行之前都会先执行该方法
     */
    @Before
    public void init(){
        System.out.println("init....");
    }

    /**
     * 释放资源方法:在所有测试方法执行完成后，都会自动执行该方法
     */
    @After
    public void close(){
        System.out.println("close....");
    }

    @Test
    public void testAdd(){
        System.out.println("Test ADD");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        Assert.assertEquals(3,result);
    }

    @Test
    public void testSub(){
        System.out.println("Test Sub");
        Calculator c = new Calculator();
        int result = c.sub(1, 2);
        Assert.assertEquals(-1,result);
    }
}
