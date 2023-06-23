package curs13;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class AssertionExample {

    String actualTitle = "Test";
    String expectedTitle = "Masina";

    //fara assert
    @Test
    public void checkEquality() {
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test passed");
        } else
            System.out.println("Test failed");//da passed oricum ca testul a rulat
    }

    @Test
    public void checkEqualityAssert() {
        assertEquals(actualTitle, expectedTitle);
    }
}
