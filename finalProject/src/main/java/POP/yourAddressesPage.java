package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class yourAddressesPage {
    private WebDriver driver;
    public yourAddressesPage(WebDriver driver){ this.driver = driver;}
    public void checkAddress(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement checker = driver.findElement(By.xpath("//*[@class='address']/div[1]/address"));
    }
    public String checkCreatedAddress (){
       WebElement checker = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
        return checker.getText();
    }
    public void deleteAddress(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement deleteAddressButton1 = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]"));
        WebElement deletionAlert = driver.findElement(By.xpath("//*[@id='notifications']/div/article"));
        deleteAddressButton1.click();
    }
    }
