import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchResultPage;
import pages.ShoppingCartPage;
import utils.Listener;

/**
 * Created by AT on 01.09.2016.
 */
@Listeners(Listener.class)
public class DeleteItemFromCartTests extends BaseClass {



    @Test
    public void deleteItemFromShoppingCartTest() throws InterruptedException {

        String searchItem = "blouse";

        MainPage.searchFor(driver,searchItem);
        SearchResultPage.clickProductTitle(driver);
        SearchResultPage.addProductToCart(driver);
        Assert.assertTrue(ShoppingCartPage.isProductQuantityDisplayed(driver));
        ShoppingCartPage.deleteFromCart(driver);
        Assert.assertTrue(ShoppingCartPage.isShoppingCartIsEmpty(driver));

    }

}
