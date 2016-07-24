package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AT on 23.07.2016.
 */
public class LentaPage {

    private WebDriver driver;

    public LentaPage(WebDriver driver) {this.driver = driver;}

    private By devByLogo = By.className("header-logo");


    public boolean isLogoPresent () {

        WebElement logo =  driver.findElement(devByLogo);

        if(logo.isDisplayed()) {

            return true;
        }
        else {

            return false;
        }


    }


}
