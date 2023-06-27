package curs14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementExample {

    WebDriver driver;

    @BeforeClass
    public void setup(){

        //selenium 3 varianta 1
        /*System.setProperty("webdriver.chrome.driver","..path catre chromedriver.exe");
        driver = new ChromeDriver();*/

        //link repo https://github.com/bonigarcia/webdrivermanager

        //selenium 3 varianta 2
        //driver = WebDriverManager.chromedriver.create();


        //selenium 4
        driver = new ChromeDriver();
        driver.manage().window().maximize();//maximizeaza fereastra browserului

    }

    @Test
    public void webElementExample(){
        driver.get("https://keybooks.ro/");

        driver.findElement(By.id("menu_user"));

    }

    @AfterClass
    public void teardown(){
        driver.quit();//inchide browserul cu toate taburile
        //driver.close();//inchide tabul curent
    }
}
