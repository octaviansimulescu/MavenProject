package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class JsAlertExample extends BaseTest {
    @Test(priority = 2)
    public void confirmationJSAlert() throws InterruptedException {
        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();
        Thread.sleep(4000);

        driver.switchTo().alert().dismiss();

//        Alert alertaJS = driver.switchTo().alert();
//        alertaJS.dismiss();

        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
        assertEquals(result.getText(), "You clicked: Cancel");
    }

    @Test(priority = 3)
    public void promptJSAlert() throws InterruptedException {
        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();
        Thread.sleep(4000);

        driver.switchTo().alert().sendKeys("Test");
        driver.switchTo().alert().accept();
        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
        assertEquals(result.getText(), "You entered: Test" );

    }
}
