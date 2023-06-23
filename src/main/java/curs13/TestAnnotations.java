package curs13;

import org.testng.annotations.*;
@Test // doar o diferenta cand e la nivel de clasa. Daca metoda e privat nu o ruleaza
public class TestAnnotations {

  //  @Test
    public void test1(){
        System.out.println("Test 1");
       // System.err.println("Test ceva"); print cu rosu
    }


  //  @Test
    public void test2(){
        System.out.println("Test 2");
    }

 //   @Test
    private void test3(){
        System.out.println("Test 3");
    }
}
