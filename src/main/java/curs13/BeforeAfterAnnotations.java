package curs13;

import org.testng.annotations.*;


import java.util.SortedMap;

public class BeforeAfterAnnotations {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @BeforeClass
    public void beforeClass(){//se escuta inaintea metodelor @TEST
        System.out.println("Before class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod(){//se escuta inaintea metodelor @TEST
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @Test
    public void method1(){
        System.out.println("Method 1");
    }

    @Test
    public void method2(){
        System.out.println("Method 2");
    }
}
