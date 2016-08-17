package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.InboxPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class MailTest
{

    private String userLogin = "testmail1199@mail.ru";
    private String userPassword = "qwerty1122";

    private String userLogin2 = "strong.zubovich@bk.ru";
    private String userPassword2 = "ZXCvbn123!";

    private String subject = "test subject";



    @Test
    public void sentLetterTest(){

        Configuration.holdBrowserOpen = true;
        open("http://mail.ru");
        LoginPage.loginToMail(userLogin2,userPassword2);
        InboxPage.clickWriteLetterButton();

        InboxPage.setToWhoField(userLogin);
        InboxPage.setSubjectField(subject);
        //InboxPage.setMessageBody(subject);
    }

    @Test
    public void mailRuTest(){

        Configuration.holdBrowserOpen = true;
        open("http://mail.ru");
        LoginPage.loginToMail(userLogin,userPassword);

    }
}
