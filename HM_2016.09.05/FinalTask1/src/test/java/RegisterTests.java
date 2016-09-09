import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountCreationPage;
import pages.AccountPage;
import pages.LoginPage;
import pages.MainPage;
import utils.Listener;

/**
 * Created by AT on 31.08.2016.
 */
@Listeners(Listener.class)
public class RegisterTests extends BaseClass {

    @Test
    public void registrationTest() throws InterruptedException {

        MainPage.clickSignInLink(driver);
        LoginPage.setEmailCreateField(driver);
        LoginPage.clickCreateAccountButton(driver);
        AccountCreationPage.setAccountCreationForm(driver);
        Assert.assertTrue(AccountPage.isAccountPageHeadingPresent(driver));

    }
}
