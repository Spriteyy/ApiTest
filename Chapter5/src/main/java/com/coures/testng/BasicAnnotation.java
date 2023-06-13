package com.coures.testng;

import org.testng.annotations.Test;

/**
 * @author TesterYang
 * @create 2023-06-13 23:59
 */

//注解annotation
public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
}
