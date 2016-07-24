package tests;


import org.testng.annotations.Test;
import pages.*;
import settings.BaseClass;


import static org.testng.Assert.assertTrue;


/**
 * Created by AT on 22.07.2016.
 */
public class DevByTest extends BaseClass{





    @Test
    public void devByTest() {

        MainPage mainPage = new MainPage(driver);
        LentaPage lentaPage = new LentaPage(driver);
        CompaniesPage companiesPage = new CompaniesPage(driver);
        SalariesPage salariesPage = new SalariesPage(driver);
        JobsPage jobsPage = new JobsPage(driver);

        mainPage.clickLentaLink();

        assertTrue(lentaPage.isLogoPresent(driver));
        lentaPage.clickCompaniesLink();

        assertTrue(companiesPage.isISsoftLinkPresent(driver));
        companiesPage.clickSalariesLink();

        assertTrue(salariesPage.isSalaryInItTextPresent(driver));
        salariesPage.clickJobsLink();

        assertTrue(jobsPage.isSearchJobsTextPresent(driver));





    }



}
