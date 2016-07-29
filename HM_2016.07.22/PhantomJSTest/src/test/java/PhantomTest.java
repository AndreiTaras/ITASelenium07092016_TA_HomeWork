import javafx.beans.property.SetProperty;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.RegistrationPage;
import settings.BaseClass;

import java.io.File;
import java.io.IOException;

/**
 * Created by AT on 28.07.2016.
 */
public class PhantomTest extends BaseClass{



    @Test
    public void phantomJSTest() throws IOException {


        File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("d://mainPage.png"));


        MainPage.clickRegistrationLink(driver);

        File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile2,new File("d://registrationPage.png"));

        RegistrationPage.setRegistrationForm(driver);

        File srcFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile3,new File("d://confirmPage.png"));

        MainPage.isConfirmationRegistrationMessageDisplayed(driver);


    }


}
