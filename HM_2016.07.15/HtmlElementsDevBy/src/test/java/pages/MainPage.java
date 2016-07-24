package pages;

import blocks.NavigationBlock;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by AT on 22.07.2016.
 */
public class MainPage {

    private NavigationBlock navigationBlock;

    public MainPage(WebDriver driver){

        HtmlElementLoader.populatePageObject(this,driver);
    }

    public void clickLentaLink() {

        navigationBlock.clickLentaLink();
    }

    public void clickCompaniesLink() {

        navigationBlock.clickCompaniesLink();
    }

    public void clickSalariesLink() {

        navigationBlock.clickSalariesLink();
    }

    public void clickJobsLink(){

        navigationBlock.clickJobsLink();
    }



}
