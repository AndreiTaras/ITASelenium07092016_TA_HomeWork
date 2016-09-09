package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 01.09.2016.
 */
public class ShoppingCartPage {

    private static final By PRODUCT_QUANTITY = Locators.get("productQuantity");
    private static final By DELETE_ICON = Locators.get("deleteIcon");
    private static final By EMPTY_CART_ALERT = Locators.get("emptyCartAlert");
    private static final By CHECKOUT_BUTTON = Locators.get("checkoutButton");
    private static final By AGREE_CHECKBOX = Locators.get("agreeCheckbox");
    private static final By PAY_BY_CHECK_BUTTON = Locators.get("payByCheckButton");
    private static final By CHECKOUT_2_BUTTON = Locators.get("checkout2Button");
    private static final By SUCCESS_ALERT = Locators.get("successAlert");
    private static final By ORDER_CONFIRMATION_BOX = Locators.get("orderConfirmationBox");
    private static final By ORDER_HISTORY_LINK = Locators.get("orderHistoryLink");

    public static void deleteFromCart(WebDriver driver){

        driver.findElement(DELETE_ICON).click();
    }

    public static boolean isProductQuantityDisplayed(WebDriver driver) throws InterruptedException {

        Thread.sleep(1500);
        return driver.findElement(PRODUCT_QUANTITY).isDisplayed();
    }

    public static boolean isShoppingCartIsEmpty(WebDriver driver) throws InterruptedException {
        Thread.sleep(1500);
        return driver.findElement(EMPTY_CART_ALERT).isDisplayed();
    }

    public static void clickCheckoutButton(WebDriver driver) throws InterruptedException {
        driver.findElement(CHECKOUT_BUTTON).click();
        Thread.sleep(1500);
    }
    public static void clickCheckout2Button(WebDriver driver){

        driver.findElement(CHECKOUT_2_BUTTON).click();
    }

    public static void checkAgreeCheckBox(WebDriver driver){

        driver.findElement(AGREE_CHECKBOX).click();

    }
    public static void clickPayByCheckButton(WebDriver driver){

        driver.findElement(PAY_BY_CHECK_BUTTON).click();
    }

    public static boolean isSuccerAlertPresent(WebDriver driver){

        return driver.findElement(SUCCESS_ALERT).isDisplayed();
    }

    public static String passStepsForBuyingAndGetOrderNumber(WebDriver driver) throws InterruptedException {

        clickCheckoutButton(driver);
        clickCheckout2Button(driver);
        checkAgreeCheckBox(driver);
        clickCheckoutButton(driver);
        clickPayByCheckButton(driver);
        clickCheckout2Button(driver);

        String orderConfirmationText = driver.findElement(ORDER_CONFIRMATION_BOX).getText();
        String wordBeforeOrderNumber = "reference";
        int beginIndex = orderConfirmationText.indexOf(wordBeforeOrderNumber) + wordBeforeOrderNumber.length() + 1;
        int orderNumberLength = 9;
        int endIndex = beginIndex + orderNumberLength;
        String orderNumber = orderConfirmationText.substring(beginIndex,endIndex);

        return orderNumber;

    }


    public static void navigateToOrderHistoryPage(WebDriver driver){

        driver.findElement(ORDER_HISTORY_LINK).click();
    }



}
