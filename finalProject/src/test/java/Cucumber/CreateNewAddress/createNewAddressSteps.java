package Cucumber.CreateNewAddress;

import POP.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class createNewAddressSteps {
    WebDriver driver;
    @Given("The user is logged in")
    public void logInUser(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        homePage homepage = new homePage(driver);
        logInUserPage logUserPage = new logInUserPage(driver);
        homepage.signInUser();
        logUserPage.logUserIn();
    }
    @When("Appropriate form is filled with {}, {}, {}, {} and {}")
    public void fillingAddressForm(String alias, String address, String city, String zipCode, String phone){
        userAccountPage userAccountPage = new userAccountPage(driver);
        addNewAdressForm addNewAdressForm= new addNewAdressForm(driver);
        userAccountPage.secondAddress();
        userAccountPage.openCreateAddressForm();
        addNewAdressForm.addNewAddress(alias, address, city, zipCode, phone);
    }
    @Then("new address is added")
    public void checkAddress(){
        yourAddressesPage yourAddressesPage = new yourAddressesPage(driver);
        Assert.assertEquals("Address successfully added!", yourAddressesPage.checkCreatedAddress());
    }
    @And("The test cleans up after itself")
    public void cleanUp(){
        yourAddressesPage yourAddressesPage = new yourAddressesPage(driver);
        yourAddressesPage.deleteAddress();
        WebElement checker = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/aside/div/article/ul/li"));
        Assert.assertEquals("Address successfully deleted!",checker.getText());
        driver.quit();
    }

}
