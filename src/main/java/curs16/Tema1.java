package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class Tema1 extends BaseTest {

    @Test
    public void sendMessageToContactPage(){
        driver.get("https://keybooks.ro/contacts/");

        driver.findElement(By.cssSelector("input[type='text'][name*='name']")).sendKeys("Gicu");
        driver.findElement(By.cssSelector("input[type='email'][name='your-email']")).sendKeys("saknoel_oct@yahoo.com");
        driver.findElement(By.cssSelector("input[type='text'][name='your-s']")).sendKeys("reteta jamila");
        driver.findElement(By.cssSelector("textarea[name='your-message']")).sendKeys("Foarte buna reteta de ciorbita");

        driver.findElement(By.cssSelector("input[class='wpcf7-form-control wpcf7-submit']")).click();
        //<input type="submit" value="Send Message" class="wpcf7-form-control wpcf7-submit" aria-invalid="false">
        String text ="Thank you for your message. It has been sent.";
        WebElement responseMessage = driver.findElement(By.cssSelector("div[class='wpcf7-response-output']"));
        Assert.assertTrue(text.contains(responseMessage.getText()));


    }
}//
