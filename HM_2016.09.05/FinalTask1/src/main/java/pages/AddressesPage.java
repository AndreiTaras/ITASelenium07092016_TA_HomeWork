package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 05.09.2016.
 */
public class AddressesPage {

    private static final By ADD_NEW_ADDRESS_BUTTON = Locators.get("addNewAddressButton");
    private static final By ADDRESS = Locators.get("address");
    private static final By CITY = Locators.get("city");
    private static final By STATE  = Locators.get("state");
    private static final By POST_CODE = Locators.get("postCode");
    private static final By HOME_PHONE = Locators.get("homePhone");
    private static final By MOBILE_PHONE = Locators.get("mobilePhone");
    private static final By ADDRESS_TITLE = Locators.get("addressTitle");
    private static final By SAVE_BUTTON = Locators.get("saveButton");
    private static final By NEW_ADDRESS = Locators.get("newAddress");




    public static void addNewAddress(WebDriver driver,String addressTitle){

        String address = HelperRandomClass.getRandomString();
        String city = HelperRandomClass.getRandomString();
        String state= HelperRandomClass.getRandomState();
        String postCode = HelperRandomClass.getRandomPostCode();
        String homePhone = HelperRandomClass.getRandomPhoneNumber();
        String mobilePhone = HelperRandomClass.getRandomPhoneNumber();

        driver.findElement(ADD_NEW_ADDRESS_BUTTON).click();
        driver.findElement(ADDRESS).sendKeys(address);
        driver.findElement(CITY).sendKeys(city);
        driver.findElement(STATE).sendKeys(state);
        driver.findElement(POST_CODE).sendKeys(postCode);
        driver.findElement(HOME_PHONE).sendKeys(homePhone);
        driver.findElement(MOBILE_PHONE).sendKeys(mobilePhone);
        driver.findElement(ADDRESS_TITLE).clear();
        driver.findElement(ADDRESS_TITLE).sendKeys(addressTitle);
        driver.findElement(SAVE_BUTTON).click();


    }

    public static String getNewAddressTitle(WebDriver driver) {

        return driver.findElement(NEW_ADDRESS).getText();
    }


}
