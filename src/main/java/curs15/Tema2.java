package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.Base64;

public class Tema2 extends BaseTest {

    @Test
    public void findProduct(){
        //<input type="text" class="search_field" placeholder="Search" value="" name="s">g\
        driver.findElement(By.cssSelector("button[class='search_submit icon-search']")).click();
        driver.findElement(By.cssSelector("input[type='text'][class='search_field']")).sendKeys("The story about me");
        driver.findElement(By.cssSelector("button[class='search_submit icon-search']")).click();



        boolean displayed = false;



        while (displayed ==false) {

            WebElement theStory = driver.findElement(By.cssSelector("a[alt='The story about me']"));
                if (theStory.isDisplayed()) {
                    displayed = true;
                    //<span class="viewmore_text_1">LOAD MORE</span>
                }else {
                    driver.findElement(By.cssSelector("span[class='viewmore_text_1']")).click();
                    displayed =false;
                }
            }

        //Assert.assertTrue(bookTitile.isDisplayed());

        /*while (!bookTitile.isDisplayed()) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(0,350)");

        }*/
//        JavascriptExecutor jse =(JavascriptExecutor) driver;
//        jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')",bookTitile);



           /* boolean displayed = false;
            while (displayed ==false) {*/
         /*       driver.findElement(By.cssSelector("span[class='viewmore_text_1']")).click();
                if (bookTitile.isDisplayed()) {
                    displayed = true;
                    //<span class="viewmore_text_1">LOAD MORE</span>
                }
            }*/
        //<a href="https://keybooks.ro/shop/the-story-about-me/">The story about me</a>
        //<input type="text" class="search_field" placeholder="Search" value="" name="s">

        //JavascriptExecutor jse =(JavascriptExecutor) driver;
        // driver.findElement(By.cssSelector("input[id='log'][name='log'][placeholder='Login or Email']")).sendKeys("Test");
    }
}
