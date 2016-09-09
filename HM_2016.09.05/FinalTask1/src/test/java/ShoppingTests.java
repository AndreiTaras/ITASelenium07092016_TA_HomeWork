import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.*;
import utils.Listener;

@Listeners(Listener.class)
public class ShoppingTests extends BaseClass {


    @Test
    public void shoppingTest() throws InterruptedException {

        String userEmail = "testmail90@tut.by";
        String userPassword = "qwerty";
        String orderNumber;

        MainPage.clickSignInLink(driver);
        LoginPage.loginAs(driver,userEmail,userPassword);
        MainPage.searchFor(driver,"blouse");
        SearchResultPage.clickProductTitle(driver);
        SearchResultPage.addProductToCart(driver);
        orderNumber = ShoppingCartPage.passStepsForBuyingAndGetOrderNumber(driver);
        ShoppingCartPage.navigateToOrderHistoryPage(driver);
        Assert.assertEquals(OrderHistoryPage.getLastOrderNumber(driver) , orderNumber);


    }
}
