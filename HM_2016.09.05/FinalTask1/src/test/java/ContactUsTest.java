
import core.BaseClass;
import helpers.HelperRandomClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.MainPage;
import utils.Listener;


/**
 * Created by AT on 17.08.2016.
 */
@Listeners(Listener.class)
public class ContactUsTest extends BaseClass {



    String email = HelperRandomClass.getRandomEmail();
    String message = HelperRandomClass.getRandomString();


    @Test
    public void contactUsSuccessMessageTest() {

        MainPage.clickContactUsLink(driver);
        ContactUsPage.setContactForm(driver,email,message);
        Assert.assertTrue(ContactUsPage.isSuccessfulAlertMessagePresent(driver) ,"Successful alert message isn't present on the page");

    }

    @Test
    public void contactUsErrorMessageTest(){

        MainPage.clickContactUsLink(driver);
        ContactUsPage.setContactFormWithoutMessageField(driver,email);
        Assert.assertTrue(ContactUsPage.isErrorAlertMessagePresent(driver),"Error alert message isn't present on the page");

    }




}
