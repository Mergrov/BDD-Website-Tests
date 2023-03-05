package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class logInUserPage {
    private WebDriver driver;
    public logInUserPage(WebDriver driver){
        this.driver=driver;
    }
    public void logUserIn(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String email = "drefanptngccacpvcf@tmmbt.com";
        String password = "12345GDA";
        WebElement emailField = driver.findElement(By.id("field-email"));
        WebElement passwordField = driver.findElement(By.id("field-password"));
        WebElement signInButton = driver.findElement(By.id("submit-login"));

        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        signInButton.click();
    }
}
