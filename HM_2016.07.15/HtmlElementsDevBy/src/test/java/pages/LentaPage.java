package pages;

import blocks.NavigationBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by AT on 24.07.2016.
 */
public class LentaPage {

    private NavigationBlock navigationBlock;
    private By DEV_BY_LOGO = By.className("header-logo");

    public LentaPage(WebDriver driver) {

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


    public boolean isLogoPresent (WebDriver driver) {

        WebElement logo =  driver.findElement(DEV_BY_LOGO);

        if(logo.isDisplayed()) {

            return true;
        }
        else {

            return false;
        }


    }

}
