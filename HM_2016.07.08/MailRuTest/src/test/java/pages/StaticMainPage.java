package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 20.07.2016.
 */
public class StaticMainPage {


    private static By checkBoxForSelectLetters = By.xpath("//div[@class='b-toolbar__group']/div[1]");
    private static By selectAllLettersLocator = By.xpath("//span[@class='b-dropdown__list__item__text'][text()='Выделить все письма']");
    private static By selectInboxAllLettersLocator = By.xpath("//a[@class='pseudo-link']");
    private static By selectedLettersCountText = By.xpath(".//div[@class='b-announcement__text']");


    public static void selectAllLetters (WebDriver driver) {

        driver.findElement(checkBoxForSelectLetters).click();
        driver.findElement(selectAllLettersLocator).click();
        driver.findElement(selectInboxAllLettersLocator).click();


    }

    public static void showInboxLettersCount(WebDriver driver) {

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
