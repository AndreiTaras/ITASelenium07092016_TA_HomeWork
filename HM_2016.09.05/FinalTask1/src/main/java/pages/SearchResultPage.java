package pages;

import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SearchResultPage {

    private static final By PRODUCT_NAME_BLOUSE = Locators.get("blouse");
    private static final By ADD_TO_CART_BUTTON = Locators.get("addToCartButton");
    private static final By PROCEED_TO_CHECKOUT_BUTTON = Locators.get("proceedToCheckoutButton");



    public static boolean isProductNameBlouseDisplayed(WebDriver driver){

     return driver.findElement(PRODUCT_NAME_BLOUSE).isDisplayed();
    }

    public static void clickAddToCartButton(WebDriver driver){

        driver.findElement(ADD_TO_CART_BUTTON).click();
    }


    public static void clickProductTitle(WebDriver driver){
        driver.findElement(PRODUCT_NAME_BLOUSE).click();
    }

    public static void navigateToShoppingCart(WebDriver driver) throws InterruptedException {

        Thread.sleep(1500);
        driver.findElement(PROCEED_TO_CHECKOUT_BUTTON).click();
    }

    public static void addProductToCart(WebDriver driver) throws InterruptedException {

        Thread.sleep(1000);
        clickAddToCartButton(driver);
        navigateToShoppingCart(driver);
    }




}
