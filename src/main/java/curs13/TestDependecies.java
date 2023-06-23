package curs13;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDependecies {
    @Test
    public void method1(){
        Assert.assertTrue(false);
        System.out.println("method 1");

    }
    @Test(dependsOnMethods = "method1")
    public void method2(){
        System.out.println("method 2");

    }
    @Test
    public void method3(){
        System.out.println("method 3");

    }
}
