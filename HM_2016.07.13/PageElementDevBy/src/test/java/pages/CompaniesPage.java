package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AT on 23.07.2016.
 */
public class CompaniesPage {

    private WebDriver driver;

    public CompaniesPage(WebDriver driver) {this.driver = driver;}

    private By ISSOFT_LINK = By.xpath("//a[@href='/issoft']");



    public boolean isISsoftLinkPresent() {

        WebElement issoftLink = driver.findElement(ISSOFT_LINK);


        if(issoftLink.isDisplayed()) {
            return true;
        }
        else {

            return false;
        }

    }


}
