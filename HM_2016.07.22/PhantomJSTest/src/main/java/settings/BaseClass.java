package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by AT on 27.07.2016.
 */
public class BaseClass {
    public static final  String BASE_LINK = "https://dev.by";
   // protected WebDriver driver;
    protected PhantomJSDriver driver;
    @BeforeTest
    public void setUp(){

        System.setProperty("phantomjs.binary.path","c://phantomjs-2.1.1-windows//bin//phantomjs.exe");

        driver = new PhantomJSDriver();



            //driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.get(BASE_LINK);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }


//    @AfterTest
//    public void teardown() {
//
//            driver.close();
//    }
}
