package pages;

import blocks.NavigationBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by AT on 24.07.2016.
 */
public class JobsPage {


    private NavigationBlock navigationBlock;

    private By SEARCH_JOBS = By.xpath("//div[@class='column-left']/h3");

    public JobsPage(WebDriver driver) {

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


    public boolean isSearchJobsTextPresent (WebDriver driver) {

        WebElement searchJobsText = driver.findElement(SEARCH_JOBS);

        if(searchJobsText.getText().equals("Поиск вакансий:")) {
            return true;
        }
        else {

            return false;
        }



    }


}
