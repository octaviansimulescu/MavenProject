package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.time.Duration;

public class implicitWait extends BaseTest {

    @Test
    public void implicitWaitExample() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        //implicit wait
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); -> se pune in zona de setup
        driver.findElement(By.cssSelector("div[id='start']>button")).click();

        //Thread.sleep(8000);//bad practice
        //metoda wait asteapta cat e nevoie

        WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
        Assert.assertEquals(finish.getText(),"Hello World!");
    }
}
