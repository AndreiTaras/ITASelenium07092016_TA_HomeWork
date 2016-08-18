package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

/**
 * Created by AT on 16.08.2016.
 */
public class LoginPage {


    private static final By LOGIN_FIELD = Locators.get("loginField");
    private static final By PASSWORD_FIELD = Locators.get("passwordField");
    private static final By SIGN_IN_BUTTON = Locators.get("signInButton");

    public static InboxPage loginToMail(String login, String password) {

        $(LOGIN_FIELD).sendKeys(login);
        $(PASSWORD_FIELD).sendKeys(password);
        $(SIGN_IN_BUTTON).click();

        return page(InboxPage.class);
    }

}
