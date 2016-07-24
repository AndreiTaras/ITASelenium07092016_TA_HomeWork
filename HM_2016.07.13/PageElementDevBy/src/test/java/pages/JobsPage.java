package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AT on 23.07.2016.
 */
public class JobsPage {

    private WebDriver driver;

    public JobsPage(WebDriver driver) {this.driver = driver;}

    private By SEARCH_JOBS = By.xpath("//div[@class='column-left']/h3");



    public boolean isSearchJobsTextPresent () {

        WebElement searchJobsText = driver.findElement(SEARCH_JOBS);

        if(searchJobsText.getText().equals("Поиск вакансий:")) {
            return true;
        }
        else {

            return false;
        }



    }

}
