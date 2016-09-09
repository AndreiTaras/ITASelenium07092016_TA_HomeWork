package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 02.09.2016.
 */
public class AccountPage {

    private static final By ACCOUNT_PAGE_HEADING = Locators.get("accountPageHeading");
    private static final By PERSONAL_INFORMATION_LINK = Locators.get("personalInformationLink");
    private static final By ADDRESSES_LINK = Locators.get("addressesLink");


    public static boolean isAccountPageHeadingPresent(WebDriver driver){

        return driver.findElement(ACCOUNT_PAGE_HEADING).isDisplayed();
    }

    public static void navigateToPersonalInformationPage(WebDriver driver){
        driver.findElement(PERSONAL_INFORMATION_LINK).click();

    }

    public static void navigateToAddressPage(WebDriver driver){

        driver.findElement(ADDRESSES_LINK).click();
    }

}
