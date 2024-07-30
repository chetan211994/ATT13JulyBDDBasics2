package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeature\\campaign.feature"},
		glue = {"steps"},
		plugin = {"pretty"},
		tags = "@sanity or @regression"
		)




public class CampaignRunner extends AbstractTestNGCucumberTests
{

}
