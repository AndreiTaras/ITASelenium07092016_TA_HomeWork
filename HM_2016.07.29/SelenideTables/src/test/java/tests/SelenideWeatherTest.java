package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Selenide.*;


/**
 * Created by AT on 18.08.2016.
 */
public class SelenideWeatherTest {



    @Test
    public void verifyTableDimension() {
        Configuration.holdBrowserOpen = true;
        open("http://6.pogoda.by/");
        $$(By.xpath(".//*[@id='forecast']/tbody/tr[1]/td")).shouldHave(size(6));
        $$(By.cssSelector("#forecast tr")).shouldHave(size(32));

    }

    @Test
   public void verifyCellText(){
              open("http://6.pogoda.by/");
                $$(By.cssSelector("#forecast tr")).get(1).shouldHave(Condition.text("Суббота, 10 сентября"));
           }



}
