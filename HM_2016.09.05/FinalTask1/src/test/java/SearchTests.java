import core.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SearchResultPage;
import utils.Listener;

/**
 * Created by AT on 31.08.2016.
 */
@Listeners(Listener.class)
public class SearchTests extends BaseClass {

    @Test
    public void searchTest() {

        String searchItem = "blouse";

        MainPage.searchFor(driver,searchItem);
        Assert.assertTrue(SearchResultPage.isProductNameBlouseDisplayed(driver));
    }

}
