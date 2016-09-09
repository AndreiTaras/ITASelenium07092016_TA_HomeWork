package utils;

import org.openqa.selenium.WebDriver;

/**
 * Created by AT on 19.08.2016.
 */
public class TestBase {
    public static final ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();

    public static WebDriver getDriver() {

        return DRIVER.get();
    }

}
