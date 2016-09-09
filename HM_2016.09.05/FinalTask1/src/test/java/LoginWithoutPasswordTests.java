import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import utils.Listener;

/**
 * Created by AT on 09.09.2016.
 */
@Listeners(Listener.class)
public class LoginWithoutPasswordTests extends BaseClass {

    @Test
    public void loginWithoutPasswordTest() throws InterruptedException {

        String userEmail = "testmail90@tut.by";
        String userPassword = "";
        String errMessage = "Password is required.";

        MainPage.clickSignInLink(driver);
        LoginPage.loginAs(driver,userEmail,userPassword);
        Assert.assertEquals( LoginPage.getErrorMessageText(driver),errMessage," Invalid Error message Text ");

    }



}
