import core.BaseClass;
import helpers.HelperRandomClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import utils.Listener;

/**
 * Created by AT on 09.09.2016.
 */
@Listeners(Listener.class)
public class SignUpForNewsletterTests extends BaseClass {


    @Test
    public void signUpForNewsletterTest(){

        String email = HelperRandomClass.getRandomEmail();

        MainPage.setNewsletterInput(driver,email);
        Assert.assertTrue(MainPage.isNewsletterSuccessAlertPresent(driver));

    }




}
