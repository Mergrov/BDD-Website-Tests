package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class cartPage {
    private WebDriver driver;
    public cartPage(WebDriver driver){this.driver = driver;}
    public void procToCheckOut(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement procToCheckOutButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[2]/div[1]/div[2]/div/a"));
        procToCheckOutButton.click();
    }
}
