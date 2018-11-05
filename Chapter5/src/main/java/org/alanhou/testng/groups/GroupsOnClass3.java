package org.alanhou.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的 teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的 teacher2运行");
    }
}
