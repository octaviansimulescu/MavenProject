package curs14;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseTest;

public class TemaCurs14 extends BaseTest {

    @Test
    public void checkElements() {
      // WebElement login= driver.findElement(By.cssSelector("li[class='menu_user_login']"));
        WebElement menu_user = driver.findElement(By.id("menu_user"));
        WebElement login = menu_user.findElement(By.className("menu_user_login"));
        Assert.assertTrue(login.isDisplayed());

        login.click();
        WebElement login_popup = driver.findElement(By.id("popup_login"));
        Assert.assertFalse(login_popup.isDisplayed());
        //aici am inteles din tema ca trebuie sa verificam daca elementele nu sunt vizibile: Verificam daca urmatoarele element nu sunt vizibile:
        //altfel as fi folosit assertTrue

    }
}
