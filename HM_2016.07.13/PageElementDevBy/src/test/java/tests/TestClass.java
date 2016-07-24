package tests;

import Navigation.NavigationMenuBar;
import org.testng.annotations.Test;
import pages.CompaniesPage;
import pages.JobsPage;
import pages.LentaPage;
import pages.SalariesPage;
import settings.BaseClass;

import static org.testng.Assert.assertTrue;


/**
 * Created by AT on 21.07.2016.
 */
public class TestClass extends BaseClass {


    @Test
    public void devByTest()  {

        NavigationMenuBar navigationMenuBar = new NavigationMenuBar(driver);
        LentaPage lentaPage = new LentaPage(driver);
        CompaniesPage companiesPage = new CompaniesPage(driver);
        SalariesPage salariesPage = new SalariesPage(driver);
        JobsPage jobsPage = new JobsPage(driver);

        navigationMenuBar.clickLentaLink();
        assertTrue(lentaPage.isLogoPresent());

        navigationMenuBar.clickCompaniesLink();
        assertTrue(companiesPage.isISsoftLinkPresent());


        navigationMenuBar.clickSalariesLink();
        assertTrue(salariesPage.isSalaryInItTextPresent());


        navigationMenuBar.clickJobsLink();
        assertTrue(jobsPage.isSearchJobsTextPresent());






    }

}
