package Cucumber.buyingSweater;

import POP.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class buyingSweaterSteps {
    WebDriver driver;

    @Given("The user is logged in")
    public void logUserIn() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        homePage homepage = new homePage(driver);
        logInUserPage logInUserPage= new logInUserPage(driver);
        logInUserPage logUserPage = new logInUserPage(driver);
        userAccountPage userAccountPage = new userAccountPage(driver);
        homepage.signInUser();
        logUserPage.logUserIn();
        userAccountPage.backToHomePage();
    }
    @When("The product is selected and added to the cart")
    public void buyingSweater(){
        homePage homepage = new homePage(driver);
        sweaterProductPage sweaterProductPage = new sweaterProductPage(driver);
        cartPage cartPage = new cartPage(driver);
        homepage.findSweater();
        Assert.assertEquals("SAVE 20%", sweaterProductPage.findDiscount());
        sweaterProductPage.selectSize("M");
        sweaterProductPage.selectQuantity(5);
        sweaterProductPage.addToCart();
        sweaterProductPage.proccedToCart();
        cartPage.procToCheckOut();
    }
    @Then("The product can be purchased")
    public  void placingOrder() throws IOException {
        checkOutPage checkOutPage = new checkOutPage(driver);
        orderConfirmationPage orderConfirmationPage = new orderConfirmationPage(driver);
        checkOutPage.confirmAddress();
        checkOutPage.selectDeliveryMethod();
        checkOutPage.selectPaymentMethod();
        checkOutPage.agreeToTermsOfService();
        checkOutPage.placeOrder();
        orderConfirmationPage.makeSelfie();
    }
}
