package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class sweaterProductPage {
    WebDriver driver;
    public sweaterProductPage(WebDriver driver){this.driver=driver;}

    public String findDiscount(){
        WebElement discountPrompt = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[1]/div[2]/div/span[2]"));
        return discountPrompt.getText();
    }
    public void selectSize(String sizeCode){
        String foolProofing = sizeCode.toUpperCase();
        switch (foolProofing) {
            case "S" -> {
                WebElement selectSizeS = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/select/option[1]"));
                selectSizeS.click();
            }
            case "M" -> {
                WebElement selectSizeM = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/select/option[2]"));
                selectSizeM.click();
            }
            case "L" -> {
                WebElement selectSizeL = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/select/option[3]"));
                selectSizeL.click();
            }
            case "XL" -> {
                WebElement selectSizeXL = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/select/option[4]"));
                selectSizeXL.click();
            }
        }
    }
    public void selectQuantity(int quantity) {
        int counter = 1;
        while (counter <= quantity){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement selectQuantityButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/span[3]/button[1]/i"));
            selectQuantityButton.click();
            counter++;
        }
    }
    public void addToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button"));
        addToCartButton.click();
    }
    public void proccedToCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement proccedtoChcekOutButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div[2]/div/div/a"));
        proccedtoChcekOutButton.click();
    }
    }

