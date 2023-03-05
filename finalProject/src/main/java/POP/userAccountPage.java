package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class userAccountPage {
    WebDriver driver;
    public userAccountPage(WebDriver driver){
        this.driver =driver;
    }
    public void openCreateAddressForm(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement createNewAddressButton = driver.findElement(By.cssSelector("#content > div.addresses-footer > a"));
        createNewAddressButton.click();
    }
    public void firstAdress(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement firstAdressButton = driver.findElement(By.id("address-link"));
        firstAdressButton.click();
    }
    public void secondAddress(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement nextAddressButton = driver.findElement(By.id("addresses-link"));
        nextAddressButton.click();
    }
    public void backToHomePage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement backToHomepageLink = driver.findElement(By.xpath("/html/body/main/section/div/nav/ol/li[1]/a"));
        backToHomepageLink.click();
    }
}
