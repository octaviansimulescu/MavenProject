package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.util.List;

public class CssSelectors extends BaseTest {

    @Test
    public void CssSelectorExample(){

        WebElement selectedOption = driver.findElement(By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAtributte('style', 'background:green; border:10", selectedOption);



        List<WebElement>menuEntries = driver.findElements(By.cssSelector("li[class*='sc_tabs_title'][aria-selected='true']"));

        for (WebElement element : menuEntries){
            jse.executeScript("arguments[0].setAtributte('style', 'background:green; border:10");
        }
    }

    @Test
    public void cssSelectorExample2(){
        //div[class='menu_main_wrap]>nav[class='menu_main_nav_area']>ul>li:first-of-type  //opreste la primul element din lista

        //div[class='menu_main_wrap]>nav[class='menu_main_nav_area']>ul>li:nth-of-type(2)  //opreste la al 2lea element din lista

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        WebElement homemenuItem = driver.findElement(By.cssSelector("div[class='menu_main_wrap]>nav[class='menu_main_nav_area']>ul>li:first-of-type"));
        jse.executeScript("arguments[0].setAtributte('style', 'background:green; border:10");
    }

}
