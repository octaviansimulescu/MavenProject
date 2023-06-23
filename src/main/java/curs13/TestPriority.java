package curs13;

import org.testng.annotations.*;

public class TestPriority {
    @Test(priority = 1) //cel mai mic numar are prioritate
    public void one(){
        System.out.println("First");
    }

    @Test(priority = 2)
    public void two(){
        System.out.println("Second");
    }
    @Test(priority = 3)
    public void three(){
        System.out.println("Third");
    }

    @Test
    public void four(){
        System.out.println("Fourth");
    }

    @Test // metodele fara priority sunt rulate primele
    public void five(){
        System.out.println("Fifth");
    }
}
