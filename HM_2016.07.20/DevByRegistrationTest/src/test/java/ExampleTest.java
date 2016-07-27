import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import settings.BaseClass;


/**
 * Created by AT on 26.07.2016.
 */
public class ExampleTest extends BaseClass{




    @Test
    public void registrationTest() {

        MainPage.clickRegistrationLink(driver);
        RegistrationPage.setRegistrationFormIncorrect(driver);

        Assert.assertTrue(RegistrationPage.isUsernameErrorMessageDisplayed(driver));
        Assert.assertEquals(driver.findElement(RegistrationPage.USERNAME_ERROR_MESSAGE)
                .getText(),"* Минимум 2 символа(ов)\n* Запрещены специальные символы");

        Assert.assertTrue(RegistrationPage.isUserPasswordConfirmationMessageDisplayed(driver));
        Assert.assertEquals(driver.findElement(RegistrationPage.USER_PASSWORD_CONFIRMATION_ERROR_MESSAGE).getText(),"* Поля не совпадают");

        Assert.assertTrue(RegistrationPage.isUserAgreeErrorMessageDisplayed(driver));
        Assert.assertEquals(driver.findElement(RegistrationPage.USER_AGREE_ERROR_MESSAGE).getText(),"* Необходимо отметить");



    }




}
