package pages;

import blocks.NavigationBlock;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.loader.HtmlElementLoader;

/**
 * Created by AT on 24.07.2016.
 */
public class SalariesPage {


    private NavigationBlock navigationBlock;

    private By SALARY_IN_IT = By.xpath("//div[@class='input info-count']/h3");

    public SalariesPage(WebDriver driver) {
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



    public boolean isSalaryInItTextPresent(WebDriver driver) {

        WebElement salaryInIt = driver.findElement(SALARY_IN_IT);

        if(salaryInIt.getText().equals("Зарплата в ИТ")) {

            return true;
        }

        else {
            return false;
        }


    }



}
