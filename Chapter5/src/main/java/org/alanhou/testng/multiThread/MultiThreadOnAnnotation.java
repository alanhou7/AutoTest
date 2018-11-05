package org.alanhou.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotation {

    @Test
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n", Thread.currentThread().getId());
    }
}
