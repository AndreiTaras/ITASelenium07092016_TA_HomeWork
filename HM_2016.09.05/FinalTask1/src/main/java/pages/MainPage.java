package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 30.08.2016.
 */
public class MainPage {

    private static final By CONTACT_US_LINK = Locators.get("contactUsLink");
    private static final By SIGN_IN_LINK = Locators.get("signInLink");
    private static final By SEARCH_LINE = Locators.get("searchLine");
    private static final By SEARCH_BUTTON = Locators.get("searchButton");
    private static final By T_SHIRT_PAGE_LINK = Locators.get("tShirtPageLink");
    private static final By NEWSLETTER_INPUT = Locators.get("newsletterInput");
    private static final By SUBMIT_NEWSLETTER_BUTTON = Locators.get("submitNewsletterButton");
    private static final By NEWSLETTER_SUCCESS_ALERT = Locators.get("newsletterSuccessAlert");



    public static void clickContactUsLink(WebDriver driver){

        driver.findElement(CONTACT_US_LINK).click();
    }

    public static void clickSignInLink(WebDriver driver) {
        driver.findElement(SIGN_IN_LINK).click();
    }

    public static void searchFor(WebDriver driver, String text){

        driver.findElement(SEARCH_LINE).sendKeys(text);
        driver.findElement(SEARCH_BUTTON).click();

    }

    public static void navigateToTShirtsPage(WebDriver driver){

        driver.findElement(T_SHIRT_PAGE_LINK).click();
    }

    public static void setNewsletterInput(WebDriver driver, String email){
        driver.findElement(NEWSLETTER_INPUT).sendKeys(email);
        driver.findElement(SUBMIT_NEWSLETTER_BUTTON).click();
    }

    public static boolean isNewsletterSuccessAlertPresent(WebDriver driver) {

        return driver.findElement(NEWSLETTER_SUCCESS_ALERT).isDisplayed();
    }


}
