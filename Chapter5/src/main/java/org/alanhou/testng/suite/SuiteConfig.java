package org.alanhou.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite 运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite 运行了");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}
