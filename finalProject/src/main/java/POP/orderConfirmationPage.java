package POP;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class orderConfirmationPage {
    private WebDriver driver;
    public orderConfirmationPage(WebDriver driver){ this.driver =driver;}

    public void makeSelfie() throws IOException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        File selfie =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(selfie,new File("src/main/outputScreenShot/selfie.jpg"));
    }
}
