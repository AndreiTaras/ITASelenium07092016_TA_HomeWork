package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 19.07.2016.
 */
public class DynamicMainPage {

    public WebDriver driver;

    public  DynamicMainPage(WebDriver driver) {this.driver = driver ; }

    private By checkBoxForSelectLetters = By.xpath("//div[@class='b-toolbar__group']/div[1]");
    private By selectAllLettersLocator = By.xpath("//span[@class='b-dropdown__list__item__text'][text()='Выделить все письма']");
    private By selectInboxAllLettersLocator = By.xpath("//a[@class='pseudo-link']");
    private By selectedLettersCountText = By.xpath(".//div[@class='b-announcement__text']");



    public void selectAllLetters () {

        driver.findElement(checkBoxForSelectLetters).click();
        driver.findElement(selectAllLettersLocator).click();
        driver.findElement(selectInboxAllLettersLocator).click();


    }

    public void showInboxLettersCount() {

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





}
