package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import utils.BaseTest;

public class RelativeLocatorExample extends BaseTest {

    @Test
    public void relativeLocatorTest() {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
//h5[class*='sc_title]
        //a[href='life-in-the-garden]

        //Relative locator -> to left of
        WebElement price10_20 = driver.findElement(RelativeLocator.with
                        (By.cssSelector("h5[class*='sc_title']"))
                .toLeftOf(By.cssSelector("a[href='life-in-the-garden']")));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid red')", price10_20);

        // RelativeLocator -> toRightoff

        WebElement price = driver.findElement(RelativeLocator.with
                        (By.cssSelector("h5[class*='sc_title']"))
                .toRightOf(By.cssSelector("a[href='life-in-the-garden']")));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid red')", price);

        // RelativeLocator -> Below
        WebElement price3 = driver.findElement(RelativeLocator.with
                        (By.cssSelector("h5[class*='sc_title']"))
                .below(By.cssSelector("a[href='life-in-the-garden']")));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid red')", price3);

        // RelativeLocator -> Above
        WebElement title = driver.findElement(RelativeLocator.with
                        (By.cssSelector("a[href='life-in-the-garden']"))
                .above(By.cssSelector("h5[class*='sc_title']")));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid red')", title);

        // RelativeLocator -> Near
        WebElement title2 = driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']>p")).near
                (By.cssSelector("img[src*='books7']"),100));
        jse.executeScript("arguments[0].setAttribute('style', 'background:orange; border:5px solid red')", title2);

    }
}