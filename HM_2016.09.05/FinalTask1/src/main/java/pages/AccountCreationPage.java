package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 31.08.2016.
 */
public class AccountCreationPage {


    private static final By MALE_RADIOBUTTON = Locators.get("maleRadiobutton");
    private static final By FEMALE_RADIOBUTTON = Locators.get("femaleRadiobutton");
    private static final By CUSTOMER_FIRSTNAME_FIELD = Locators.get("customerFirstnameField");
    private static final By CUSTOMER_LASTNAME_FIELD = Locators.get("customerLastnameField");
    private static final By PASSWORD_FIELD = Locators.get("passwordField");
    private static final By DAY_OF_BIRTH = Locators.get("dayOfBirth");
    private static final By MONTH_OF_BIRTH = Locators.get("monthOfBirth");
    private static final By YEAR_OF_BIRTH = Locators.get("yearOfBirth");
    private static final By COMPANY_FIELD = Locators.get("companyField");
    private static final By ADDRESS_FIELD = Locators.get("addressField");
    private static final By CITY_FIELD  = Locators.get("cityField");
    private static final By STATE_SELECT = Locators.get("stateSelect");
    private static final By POST_CODE_FIELD = Locators.get("postCodeField");
    private static final By MOBILE_PHONE_FIELD = Locators.get("mobilePhoneField");
    private static final By ADDRESS_ALIAS = Locators.get("addressAlias");
    private static final By REGISTER_BUTTON = Locators.get("registerButton");


    public static void switchMaleRadiobutton(WebDriver driver){

        driver.findElement(MALE_RADIOBUTTON).click();
    }


    public static void setCustomerFirstnameField(WebDriver driver){

        String firstname = HelperRandomClass.getRandomName();
        driver.findElement(CUSTOMER_FIRSTNAME_FIELD).sendKeys(firstname);
    }
    public static void setCustomerLastnameField(WebDriver driver){

        String lastname = HelperRandomClass.getRandomName();
        driver.findElement(CUSTOMER_LASTNAME_FIELD).sendKeys(lastname);
    }

    public static void setPasswordField(WebDriver driver) {

        String password = HelperRandomClass.getPassword();
        driver.findElement(PASSWORD_FIELD).sendKeys(password);
    }

    public static void setDateOfBirth(WebDriver driver) throws InterruptedException {

        String day = HelperRandomClass.getRandomDay();
        String month = HelperRandomClass.getRandomMonth();
        String year = HelperRandomClass.getRandomYear();

        driver.findElement(DAY_OF_BIRTH).sendKeys(day);
        driver.findElement(MONTH_OF_BIRTH).sendKeys(month);
        Thread.sleep(1000);
        driver.findElement(YEAR_OF_BIRTH).sendKeys(year);


    }
    public static void setCompanyField(WebDriver driver){
        String companyName = HelperRandomClass.getRandomString();
        driver.findElement(COMPANY_FIELD).sendKeys(companyName);
    }

    public static void setAddressField(WebDriver driver) {

        String address = HelperRandomClass.getRandomString();
        driver.findElement(ADDRESS_FIELD).sendKeys(address);
    }

    public static void setCityField(WebDriver driver){
        String city = HelperRandomClass.getRandomString();
        driver.findElement(CITY_FIELD).sendKeys(city);

    }

    public static void  selectState(WebDriver driver){

        String stateName = HelperRandomClass.getRandomState();
        driver.findElement(STATE_SELECT).sendKeys(stateName);
    }

    public static void setPostCodeField(WebDriver driver) {

        String code = HelperRandomClass.getRandomPostCode();
        driver.findElement(POST_CODE_FIELD).sendKeys(code);
    }

    public static void setMobilePhone(WebDriver driver){

        String number = HelperRandomClass.getRandomPhoneNumber();
        driver.findElement(MOBILE_PHONE_FIELD).sendKeys(number);
    }

    public static void setAddressAlias(WebDriver driver){

        String alias = "ADDRESS " +HelperRandomClass.getRandomString();

        driver.findElement(ADDRESS_ALIAS).sendKeys(alias);
    }

    public static void clickRegisterButton(WebDriver driver){

        driver.findElement(REGISTER_BUTTON).click();
    }

    public static void setAccountCreationForm(WebDriver driver) throws InterruptedException {

        switchMaleRadiobutton(driver);
        setCustomerFirstnameField(driver);
        setCustomerLastnameField(driver);
        setPasswordField(driver);
        setDateOfBirth(driver);
        setCompanyField(driver);
        setAddressField(driver);
        setCityField(driver);
        selectState(driver);
        setPostCodeField(driver);
        setMobilePhone(driver);
        setAddressAlias(driver);
        clickRegisterButton(driver);

    }


}
