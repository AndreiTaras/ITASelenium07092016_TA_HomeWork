package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 08.09.2016.
 */
public class OrderHistoryPage  {

    private static final By LAST_ORDER = Locators.get("lastOrder");


    public static String getLastOrderNumber(WebDriver driver){

        return driver.findElement(LAST_ORDER).getText();
    }

}
