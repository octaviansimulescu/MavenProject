package curs21;

import org.testng.annotations.Test;
import pageObject.MenuPage;
import pageObject.ShopPage;
import utils.BaseTest;

public class ActionClassExample extends BaseTest{

   // @Test
    public void hoverTest()throws InterruptedException{
        MenuPage menu = new MenuPage(driver);
        menu.hoverElement(menu.blogLink);
        Thread.sleep(3000);
        menu.hoverElement(menu.aboutLink);
        Thread.sleep(3000);
        menu.hoverElement(menu.blogLink);
        Thread.sleep(3000);
        menu.hoverElement(menu.blogSubMenuMasinry);
        Thread.sleep(3000);
        menu.hoverElement(menu.blogSubMenuMasinrysubMenu);
    }

    @Test
    public void dragAndDropTest(){
        //span[@style='left: 0%;']
        MenuPage menu = new MenuPage(driver);
        menu.navigateTo(menu.shopLink);

        ShopPage shop = new ShopPage(driver);
        shop.dragAndDrop(shop.pricesSliderInitialPosition,100, 0);
    }
}
