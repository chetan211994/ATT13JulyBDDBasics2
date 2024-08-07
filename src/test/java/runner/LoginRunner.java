package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\Login.feature"},
		
		glue = {"steps"}, 
		
		dryRun = true
		
		
		)

public class LoginRunner extends AbstractTestNGCucumberTests{

}
