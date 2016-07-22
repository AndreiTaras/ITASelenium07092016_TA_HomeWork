package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by AT on 21.07.2016.
 */
public class OnlinerTest {

    @Test
    public void onlinerTest() {

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://onliner.by");

        WebElement mobilePhoneLink = driver.findElement
                                        (By.xpath("//span[@class='project-navigation__sign'][text() = 'Мобильные телефоны']"));

        mobilePhoneLink.click();



        WebElement samsungCheckbox = driver.findElement(By.xpath("//input[@class='i-checkbox__real'][@value='samsung']"));

        samsungCheckbox.click();


        WebElement priceFrom = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[2]/div[2]/div/div[1]/input"));

        priceFrom.sendKeys("300");

       WebElement priceTo = driver.findElement
                (By.xpath("//div/div[2]/input[contains(@class,'schema-filter__number-input_price')]"));

        priceTo.sendKeys("700");

        WebElement releaseDateFrom = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[3]/div[3]/div/div[1]/input"));

        releaseDateFrom.sendKeys("2014");

        WebElement releaseDateTo = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[3]/div[3]/div/div[2]/input"));

        releaseDateTo.sendKeys("2016");


        WebElement osAndroidcheckbox = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[4]/div[3]/ul/li[1]/label/span[2]"));

        osAndroidcheckbox.click();


        WebElement screenSizeFrom = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[5]/div[3]/div/div[1]/select"));
        WebElement screenSizeTo = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[5]/div[3]/div/div[2]/select"));

        Select sizeFrom = new Select(screenSizeFrom);
        sizeFrom.selectByValue("300");

        Select sizeTo = new Select(screenSizeTo);
        sizeTo.selectByVisibleText("6\"");



        WebElement screenResolutionCheckbox = driver.findElement
                (By.xpath("//span[@class='schema-filter__checkbox-text'][text()='720x1280 (HD)']"));

        screenResolutionCheckbox.click();


        WebElement screenTechnologyCheckbox = driver.findElement
                (By.xpath("//span[@class='schema-filter__checkbox-text'][text()='AMOLED']"));

        screenResolutionCheckbox.click();


        WebElement RAMfrom = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[8]/div[3]/div/div[1]/input"));
        WebElement RAMto = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[8]/div[3]/div/div[2]/input"));


        RAMfrom.sendKeys("2");
        RAMto.sendKeys("4");

        WebElement memoryCardSupport = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[10]/div[3]/div/label[1]/span"));

        memoryCardSupport.click();


        WebElement phoneWhiteColor = driver.findElement
                (By.xpath("//ul/li[2]//span[@class='schema-filter__checkbox-text'][text()='белый']"));

        phoneWhiteColor.click();

        WebElement batteryCapacityFrom = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[16]/div[3]/div/div[1]/input"));
        WebElement batteryCapacityTo = driver.findElement
                (By.xpath(".//*[@id='schema-filter']/div[1]/div[16]/div[3]/div/div[2]/input"));

        batteryCapacityFrom.sendKeys("1000");
        batteryCapacityTo.sendKeys("3000");








        //driver.close();
    }





}
