package org.alanhou.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name, int age){
        System.out.println("name=" + name + "; age=" + age);
    }
}
