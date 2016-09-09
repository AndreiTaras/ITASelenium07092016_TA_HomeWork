import core.BaseClass;
import helpers.HelperRandomClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.AddressesPage;
import pages.LoginPage;
import pages.MainPage;
import utils.Listener;

/**
 * Created by AT on 09.09.2016.
 */
@Listeners(Listener.class)
public class AddNewAddressTests extends BaseClass {


    @Test
    public void addNewAddressTest() throws InterruptedException {

        String userEmail = "testmail90@tut.by";
        String userPassword = "qwerty";
        String newAddressTitle = "NEW ADDRESS " + HelperRandomClass.getRandomPostCode();

        MainPage.clickSignInLink(driver);
        LoginPage.loginAs(driver,userEmail,userPassword);
        AccountPage.navigateToAddressPage(driver);
        AddressesPage.addNewAddress(driver,newAddressTitle);
        Assert.assertEquals(AddressesPage.getNewAddressTitle(driver),newAddressTitle);

    }
}
