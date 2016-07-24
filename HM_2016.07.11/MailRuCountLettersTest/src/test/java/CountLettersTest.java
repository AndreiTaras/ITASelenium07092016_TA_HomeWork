import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by AT on 24.07.2016.
 */
public class CountLettersTest {

    private WebDriver driver;

    private String userLogin = "strong.zubovich";
    private String userLoginDomain = "bk.ru";
    private String userPassword = "ZXCvbn123!";

    private  By LOGIN_FIELD = By.id("mailbox__login");
    private  By LOGIN_DOMAIN = By.id("mailbox__login__domain");
    private  By PASSWORD_FIELD = By.id("mailbox__password");
    private  By SIGN_IN_BUTTON = By.id("mailbox__auth__button");

    private By checkBoxForSelectLetters = By.xpath("//div[@class='b-toolbar__group']/div[1]");
    private By selectAllLettersLocator = By.xpath("//span[@class='b-dropdown__list__item__text'][text()='Выделить все письма']");
    private By selectInboxAllLettersLocator = By.xpath("//a[@class='pseudo-link']");
    private By selectedLettersCountText = By.xpath(".//div[@class='b-announcement__text']");

    @BeforeTest
    public void setUp(){

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru");
    }



    @Test
    public void countLetters() {


        WebElement loginField = driver.findElement(LOGIN_FIELD);
        loginField.click();
        loginField.sendKeys(userLogin);


        WebElement loginDomain = driver.findElement(LOGIN_DOMAIN);
        Select select = new Select(loginDomain);
        select.selectByValue(userLoginDomain);

        WebElement passwordField = driver.findElement(PASSWORD_FIELD);
        passwordField.click();
        passwordField.sendKeys(userPassword);

        driver.findElement(SIGN_IN_BUTTON).click();



        //Select all letters
        driver.findElement(checkBoxForSelectLetters).click();
        driver.findElement(selectAllLettersLocator).click();
        driver.findElement(selectInboxAllLettersLocator).click();


        String text = driver.findElement(selectedLettersCountText).getText();

        String letters = "";

        for (int i = 0; i<text.length();i++) {

            char ch = text.charAt(i);

            if(ch >= '0' && ch <= '9') {
                letters += ch;
            }



        }


        System.out.println("Писем в  папке \"Входящие\" - " +letters);







    }

    @AfterTest
    public void teardown(){

        driver.close();
    }


}
