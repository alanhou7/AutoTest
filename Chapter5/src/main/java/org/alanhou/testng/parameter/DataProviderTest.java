package org.alanhou.testng.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name=" + name + "; age=" +age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"Jack",10},
                {"Anne",20}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1方法 name=" + name + "; age=" +age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2方法 name=" + name + "; age=" +age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{
                {"Jack",10},
                {"Anne",20}
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                {"Mark",15},
                {"Sophia",25}
            };
        }
        return result;
    }
}
