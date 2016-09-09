package pages;

import helpers.HelperRandomClass;
import helpers.Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 30.08.2016.
 */
public class ContactUsPage {

    private static final By SUBJECT_HEADING_DROP_DOWN_LIST = Locators.get("subjectHeadingDropDownList");
    private static final By EMAIL_FIELD = Locators.get("emailField");
    private static final By ORDER_REFERENCE_FIELD = Locators.get("orderReferenceField");
    private static final By FILE_UPLOAD_FIELD = Locators.get("fileUploadField");
    private static final By MESSAGE_FIELD = Locators.get("messageField");
    private static final By SEND_BUTTON = Locators.get("sendButton");
    private static final By SUCCESSFUL_ALERT_MESSAGE = Locators.get("successfulAlertMessage");
    private static final By ERROR_ALERT_MESSAGE = Locators.get("errorAlertMessage");


    public static void setSubjectHeading(WebDriver driver){

        String subject = "Webmaster";
        driver.findElement(SUBJECT_HEADING_DROP_DOWN_LIST).sendKeys(subject);

    }

    public static void setEmail(WebDriver driver ,String email) {

        driver.findElement(EMAIL_FIELD).sendKeys(email);

    }

    public static void setOrderReferenceField(WebDriver driver ) {

        driver.findElement(ORDER_REFERENCE_FIELD).sendKeys(HelperRandomClass.getRandomString());
    }

    public static void uploadFile(WebDriver driver){

        driver.findElement(FILE_UPLOAD_FIELD).sendKeys("testfile.txt");
    }

    public static void setMessageField(WebDriver driver, String message){

        driver.findElement(MESSAGE_FIELD).sendKeys(message);
    }

    public static void clickSendButton(WebDriver driver) {

        driver.findElement(SEND_BUTTON).click();
    }

    public static void setContactForm(WebDriver driver, String email ,String message ) {

        setSubjectHeading(driver);
        setEmail(driver,email);
        setOrderReferenceField(driver);
        uploadFile(driver);
        setMessageField(driver,message);
        clickSendButton(driver);
    }

    public static void setContactFormWithoutMessageField(WebDriver driver,String email){

        setSubjectHeading(driver);
        setEmail(driver,email);
        setOrderReferenceField(driver);
        uploadFile(driver);
        clickSendButton(driver);
    }

    public static boolean isSuccessfulAlertMessagePresent(WebDriver driver){

        return driver.findElement(SUCCESSFUL_ALERT_MESSAGE).isDisplayed();

    }

    public static boolean isErrorAlertMessagePresent(WebDriver driver){

        return driver.findElement(ERROR_ALERT_MESSAGE).isDisplayed();
    }

}

