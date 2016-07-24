package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AT on 23.07.2016.
 */
public class SalariesPage {

    private WebDriver driver;

    public SalariesPage(WebDriver driver) {this.driver = driver;}


    private By SALARY_IN_IT = By.xpath("//div[@class='input info-count']/h3");


    public boolean isSalaryInItTextPresent() {

        WebElement salaryInIt = driver.findElement(SALARY_IN_IT);

        if(salaryInIt.getText().equals("Зарплата в ИТ")) {

            return true;
        }

        else {
            return false;
        }


    }
}
