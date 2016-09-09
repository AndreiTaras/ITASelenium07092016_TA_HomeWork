package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 02.09.2016.
 */
public class TShirtsPage {

    private static final By T_SHIRT = Locators.get("tShirt");

    public static boolean isTShirtPresentOnPage(WebDriver driver){

        return  driver.findElement(T_SHIRT).isDisplayed();
    }


}
