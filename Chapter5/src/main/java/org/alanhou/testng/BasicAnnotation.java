package org.alanhou.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethod 是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMetod(){
        System.out.println("AfterMethod 是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass 是在类之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass 是在类之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite测试套件在BeforeClass之前运行");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件在AfterClass之后运行");
    }
}
