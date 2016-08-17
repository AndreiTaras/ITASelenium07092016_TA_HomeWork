package pages;


import helpers.Locators;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class InboxPage {

    private static final By WRITE_LETTER_BUTTON = Locators.get("writeLetterButton");
    private static final By TO_WHO_FIELD = Locators.get("toWhoField");
    private static final By SUBJECT_FIELD = Locators.get("subjectField");
    private static final By MESSAGE_BODY = Locators.get("messageBody");





    public static void clickWriteLetterButton() {

        $(WRITE_LETTER_BUTTON).click();

    }

    public static void setToWhoField(String mail) {

        $(TO_WHO_FIELD).click();
        $(TO_WHO_FIELD).setValue(mail);
    }

    public static void setSubjectField(String subject) {

        $(SUBJECT_FIELD).sendKeys(subject);
    }

    public static void setMessageBody(String message) {

        switchTo().frame("compose_409_composeEditor_ifr");
        $(MESSAGE_BODY).setValue(message);
        switchTo().defaultContent();
    }

}
