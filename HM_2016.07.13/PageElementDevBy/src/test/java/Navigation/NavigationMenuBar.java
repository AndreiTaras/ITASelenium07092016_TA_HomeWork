package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 21.07.2016.
 */
public class NavigationMenuBar {

    protected WebDriver driver;

    public NavigationMenuBar(WebDriver driver) {this.driver = driver;}

    By lentaLink = By.xpath("//ul[@class='menu']//a[@href = 'https://dev.by/lenta']");

    By companiesLink = By.xpath("//ul[@class='menu']//a[@href = 'https://companies.dev.by/']");

    By salariesLink = By.xpath("//ul[@class='menu']//a[@href = 'https://salaries.dev.by/']");

    By jobsLink = By.xpath("//ul[@class='menu']//a[@href='https://jobs.dev.by/']");



    public void clickLentaLink () {

        driver.findElement(lentaLink).click();



    }
    public void clickCompaniesLink () {

      driver.findElement(companiesLink).click();


    }
    public void clickSalariesLink () {

        driver.findElement(salariesLink).click();


    }
    public void clickJobsLink () {

        driver.findElement(jobsLink).click();


    }





}
