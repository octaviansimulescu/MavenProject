package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

public class Tema1 extends BaseTest {

    @Test
    public void findForest() {

        List<WebElement> categories = driver.findElements(By.className("sc_tabs_title"));
        System.out.println(categories.size());
        /*WebElement category1 = categories.get(1);
        WebElement category2 = categories.get(2);
        WebElement category3 = categories.get(3);
        WebElement category0 = categories.get(0);*/

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        for (int i = 0;i<categories.size();i++){
            WebElement category = categories.get(i);
            category.click();
                WebElement bookTitle = driver.findElement(By.cssSelector("a[href*='forest']"));
             jse.executeScript("arguments[0].setAttribute('style', 'border:10px solid red')",bookTitle);
            Assert.assertTrue(bookTitle.isDisplayed());

        if(i== categories.size() - 1){
            bookTitle.click();
            Assert.assertTrue(driver.getCurrentUrl().equals("https://keybooks.ro/shop/the-forest/"));

        }


        }
    }
}
