package utils;

import core.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;

/**
 * Created by AT on 19.08.2016.
 */
public class Utils {

    @Attachment(value = "{0}", type = "image/png")
    public static byte[] makeScreenshot(String name) {

        return ((TakesScreenshot) BaseClass.driver).getScreenshotAs(OutputType.BYTES);
    }
}
