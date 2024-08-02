package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\PlaceOrder.feature"},
		glue = {"steps"},
		plugin = {"pretty"}

		
		)





public class OrderConfirmationRunner extends AbstractTestNGCucumberTests{

}
