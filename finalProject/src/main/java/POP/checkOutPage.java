package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class checkOutPage {
    private WebDriver driver;

    public checkOutPage(WebDriver driver){this.driver =driver;}
    public void confirmAddress(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement confirmAdressButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[2]/div/div/form/div[2]/button"));
        confirmAdressButton.click();
    }
    public void selectDeliveryMethod(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement pickUpMethodButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[3]/div/div[2]/form/div/div[1]/div[1]/div/span"));
        pickUpMethodButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement ContinueButton = driver.findElement(By.xpath("//*[@id='js-delivery']/button"));
        ContinueButton.click();
    }
    public void selectPaymentMethod(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement checkMethodButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[4]/div/div[2]/div[1]/div/span/input"));
        checkMethodButton.click();
    }
    public void agreeToTermsOfService(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement thingToClick = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[4]/div/form/ul/li/div[1]/span/input"));
        thingToClick.click();
    }
    public void placeOrder(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement placeOrderBotton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div/div[1]/section[4]/div/div[3]/div[1]/button"));
        placeOrderBotton.click();
    }
}
