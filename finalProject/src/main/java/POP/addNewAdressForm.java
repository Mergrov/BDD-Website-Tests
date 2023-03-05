package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class addNewAdressForm {
    WebDriver driver;
    public addNewAdressForm(WebDriver driver){
        this.driver=driver;
    }
    public void addNewAddress(String alias, String address, String city, String zipCode, String phone){

        WebElement aliasField = driver.findElement(By.id("field-alias"));
        WebElement addressField = driver.findElement(By.id("field-address1"));
        WebElement zipCodelField = driver.findElement(By.id("field-postcode"));
        WebElement cityField = driver.findElement(By.id("field-city"));
        WebElement countryList = driver.findElement(By.id("field-id_country"));
        WebElement phoneFiled = driver.findElement(By.id("field-phone"));
        WebElement UKList = driver.findElement(By.xpath("//*[@id='field-id_country']/option[2]"));
        WebElement savebutton = driver.findElement(By.xpath("//*[@id='content']/div/div/form/footer/button"));

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        aliasField.sendKeys(alias);
        addressField.sendKeys(address);
        zipCodelField.sendKeys(zipCode);
        cityField.sendKeys(city);
        countryList.click();
        UKList.click();
        phoneFiled.sendKeys(phone);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        savebutton.click();

    }
    public void saveButtonUsage(){
        WebElement savebutton = driver.findElement(By.xpath("//*[@id='content']/div/div/form/footer/button"));
        savebutton.click();
    }
}
