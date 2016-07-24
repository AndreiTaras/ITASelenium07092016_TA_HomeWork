package pages;

import blocks.NavigationBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by AT on 24.07.2016.
 */
public class CompaniesPage {


    private NavigationBlock navigationBlock;

    private By ISSOFT_LINK = By.xpath("//a[@href='/issoft']");

    public  CompaniesPage(WebDriver driver){

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


    public boolean isISsoftLinkPresent(WebDriver driver) {

        WebElement issoftLink = driver.findElement(ISSOFT_LINK);


        if(issoftLink.isDisplayed()) {
            return true;
        }
        else {

            return false;
        }

    }



}
