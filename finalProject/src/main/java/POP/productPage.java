package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class productPage {
    WebDriver driver;
    public productPage(WebDriver driver){
        this.driver=driver;
    }

    public void sizeList(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement sizesList = driver.findElement(By.id("group_1"));
    }
}
