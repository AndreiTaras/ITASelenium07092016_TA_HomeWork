import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.TShirtsPage;
import utils.Listener;

/**
 * Created by AT on 01.09.2016.
 */
@Listeners(Listener.class)
public class CatalogTests extends BaseClass {

    @Test
    public void tShirtsPresentTest(){

        MainPage.navigateToTShirtsPage(driver);
        Assert.assertTrue(TShirtsPage.isTShirtPresentOnPage(driver));

    }
}
