package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 31.08.2016.
 */
public class LoginPage {


    private static final By EMAIL_CREATE_FIELD = Locators.get("emailCreateField");
    private static final By CREATE_ACCOUNT_BUTTON = Locators.get("createAccountButton");
    private static final By USER_EMAIL_FIELD = Locators.get("userEmailField");
    private static final By USER_PASSWORD_FIELD = Locators.get("userPasswordField");
    private static final By SIGN_IN_BUTTON = Locators.get("signInButton");
    private static final By ERROR_MESSAGE = Locators.get("errorMessage");

    public static void setEmailCreateField(WebDriver driver) {

        String email = HelperRandomClass.getRandomEmail();
        driver.findElement(EMAIL_CREATE_FIELD).sendKeys(email);
    }

    public static void clickCreateAccountButton(WebDriver driver){

        driver.findElement(CREATE_ACCOUNT_BUTTON).click();
    }


    public static void loginAs(WebDriver driver, String email, String password) throws InterruptedException {

        driver.findElement(USER_EMAIL_FIELD).sendKeys(email);
        driver.findElement(USER_PASSWORD_FIELD).sendKeys(password);
        driver.findElement(SIGN_IN_BUTTON).click();
        Thread.sleep(1500);
    }

    public static String getErrorMessageText(WebDriver driver){
        return driver.findElement(ERROR_MESSAGE).getText();
    }

}
