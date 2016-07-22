package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by AT on 20.07.2016.
 */
public class PageFactoryMainPage {

    private WebDriver driver;

    public PageFactoryMainPage(WebDriver driver) { this.driver = driver ;}

    @FindBy(xpath="//div[@class='b-toolbar__group']/div[1]")
    WebElement checkBoxForSelectLetters;

    @FindBy(xpath="//span[@class='b-dropdown__list__item__text'][text()='Выделить все письма']")
    WebElement selectAllLettersLocator;

    @FindBy(xpath="//a[@class='pseudo-link']")
    WebElement selectInboxAllLettersLocator;

    @FindBy(xpath=".//div[@class='b-announcement__text']")
    WebElement selectedLettersCountText;

    public void selectAllLetters () {

        checkBoxForSelectLetters.click();
        selectAllLettersLocator.click();
        selectInboxAllLettersLocator.click();


    }

    public void showInboxLettersCount() {

        String text = selectedLettersCountText.getText();

        String letters = "";

        for (int i = 0; i<text.length();i++) {

            char ch = text.charAt(i);

            if(ch >= '0' && ch <= '9') {
                letters += ch;
            }



        }

        System.out.println("Писем в  папке \"Входящие\" - " +letters);


    }



}
