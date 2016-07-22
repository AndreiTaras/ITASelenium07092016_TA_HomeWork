package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class FlowMainPage {

    private WebDriver driver;


    public FlowMainPage(WebDriver driver) {this.driver = driver;}


    private By checkBoxForSelectLetters = By.xpath("//div[@class='b-toolbar__group']/div[1]");
    private By selectAllLettersLocator = By.xpath("//span[@class='b-dropdown__list__item__text'][text()='Выделить все письма']");
    private By selectInboxAllLettersLocator = By.xpath("//a[@class='pseudo-link']");
    private By selectedLettersCountText = By.xpath(".//div[@class='b-announcement__text']");



    public FlowMainPage selectAllLetters () {

        driver.findElement(checkBoxForSelectLetters).click();
        driver.findElement(selectAllLettersLocator).click();
        driver.findElement(selectInboxAllLettersLocator).click();

        return this;
    }



    public FlowMainPage showInboxLettersCount() {

        String text = driver.findElement(selectedLettersCountText).getText();

        String letters = "";

        for (int i = 0; i<text.length();i++) {

            char ch = text.charAt(i);

            if(ch >= '0' && ch <= '9') {
                letters += ch;
            }



        }

        System.out.println("Писем в  папке \"Входящие\" - " +letters);


        return this;
    }

}
