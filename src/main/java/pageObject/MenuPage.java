package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MenuPage {

    public WebDriver driver;

    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    //MenuPage menu = new MenuPage(driver);

    //locatori
    //driver.findElement(By.cssSelector ("...."))
    public By contactsLink = By.linkText("CONTACTS");
    //WeBelement loginLInk =driver.findElement(By.cssSelector("li[class='menu_user_login']"));
    public By loginLink = By.cssSelector("li[class='menu_user_login']");
    public By shopLink =  By.linkText("BOOKS");
    public By blogLink =  By.linkText("BLOG");
    public By aboutLink =  By.linkText("ABOUT");
    public By blogSubMenuMasinry = By.xpath("//a[contains(text(), 'Masonry')]]");
    public By blogSubMenuMasinrysubMenu = By.xpath("//a[contains(text(), 'Masonry 2')]]");

    //metode specifice
    public void navigateTo(By locator) {
        driver.findElement(locator).click();
    }

    public void hoverElement(By locator){

      /*  driver.findElement(locator).click();*/
        WebElement element =  driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();
    }

    //MenuPage menu = new MenuPage(driver);
    //menu.navigateTo(menu.loginLink);
    //menu.navigateTo(menu.conatctsLink);

}
