package Cucumber.buyingSweater;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/buyingSweater/buying-sweater.feature",
        plugin =  {"pretty", "html:out.html"})
public class buyingSweaterTest {
}