package Cucumber.CreateNewAddress;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/creatingAddress",
        plugin =  {"pretty", "html:out.html"})
public class createNewAddressTest {
}
