package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 05.09.2016.
 */
public class PersonalInformationPage {


    private static final By FIRST_NAME = Locators.get("firstName");
    private static final By LAST_NAME = Locators.get("lastName");


    public static String getName(WebDriver driver){

         return driver.findElement(FIRST_NAME).getAttribute("value");
    }

    public static String getLastName(WebDriver driver) {

        return driver.findElement(LAST_NAME).getAttribute("value");
    }

}
