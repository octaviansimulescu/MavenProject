package curs14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class SeleniumLocators extends BaseTest {

    @Test(priority = 1)
    public void tagNameLocator() {
        WebElement discoverText = driver.findElement(By.tagName("em"));
        //get.Text()--> returneaza textul unui webelement, adica textul dintre operatorii <em>Discover</em>
        // System.out.println(discoverText.getText());
        Assert.assertEquals(discoverText.getText(), "Discover");
    }

    @Test(priority = 2)
    public void linkTextLocator() {//<a = link locator
        //
        driver.findElement(By.linkText("BOOKS")).click();
        //getcurrentUrl() --> returneaza urle -->
        Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
    }

    @Test(priority = 3)
    public void partialLinkTextLocator() {
        driver.findElement(By.partialLinkText("Cooking")).click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
    }

    @Test(priority = 4)
    public void classNameLocator() {
        //<p class="price">
        WebElement price = driver.findElement(By.className("price"));
        //isDisplayed()--> verifica daca elementul este displayed

        Assert.assertTrue(price.isDisplayed());
        //assertTrue(driver.findElement(By.className("price)).isDisplayed());
    }

    @Test(priority = 5)
    public void idLocator() {

        //<li class="reviews_tab" id="tab-title-reviews" role="tab" aria-controls="tab-reviews">
    WebElement reviewsTab = driver.findElement(By.id("tab-title-reviews"));//e transformat in obiect pt ca e folosit in 2 call uri separate
        Assert.assertTrue(reviewsTab.isDisplayed());
        reviewsTab.click();
    }

    @Test(priority = 6)
    public void nameLocator() {
        WebElement commentBox = driver.findElement(By.name("comment"));
        //sendKeys()--> ne permite sa scriem de la tastatura intr-un element
        commentBox.sendKeys("My supper comment !");
    }

    @Test(priority = 7)
    public void cssSelector(){
        //asa cauti tag css in elements in browser --> input[name=author] --> rezultat: <input id="author" name="author" type="text" value="" size="30" required="">

        //cssSelector --> tagnameHtml[atribut=valoareaAtribut]

        driver.findElement(By.cssSelector("input[name='author']")).sendKeys("Ion");
    }
    @Test(priority = 8)
    public void xPathSelector(){
        //cautare in dev tools --> //input[@type='email']
        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test@test.com]");
    }
}
