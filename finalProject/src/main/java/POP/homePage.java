package POP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver){
        this.driver=driver;
    }
    public void signInUser(){
        WebElement signInButton = driver.findElement(By.cssSelector("#_desktop_user_info > div > a > span"));
        signInButton.click();
    }
    public void findSweater(){
        WebElement sweaterButton = driver.findElement(By.xpath("//*[@id='content']/section/div/div[2]/article/div/div[2]/h3/a"));
        sweaterButton.click();
    }
}
