import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;
import pages.MainPage;
import pages.PersonalInformationPage;
import utils.Listener;

/**
 * Created by AT on 09.09.2016.
 */
@Listeners(Listener.class)
public class AssertPersonalInformationTests extends BaseClass {

    @Test
    public void assertPersonalInformationTest() throws InterruptedException {

        String userEmail = "testmail90@tut.by";
        String userPassword = "qwerty";
        String name= "Asdfg";
        String lastName = "Qwerty";

        MainPage.clickSignInLink(driver);
        LoginPage.loginAs(driver,userEmail,userPassword);
        AccountPage.navigateToPersonalInformationPage(driver);
        Assert.assertEquals(PersonalInformationPage.getName(driver),name,"Names don't match!");
        Assert.assertEquals(PersonalInformationPage.getLastName(driver),lastName,"Last names don't match!");

    }
}
