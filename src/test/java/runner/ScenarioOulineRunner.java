package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\ScenarioOutline.feature"},
		glue = {"steps"},
		plugin = {"pretty"}
		)

public class ScenarioOulineRunner extends AbstractTestNGCucumberTests{

}
