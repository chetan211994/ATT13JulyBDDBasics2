package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.PropReader;

public class AppHooks {
	
	PropReader prop;
	WebDriver driver ;
	@Before
	public void launchBrowser() throws IOException
	{
		DriverFactory df = new DriverFactory();
		
		prop = new PropReader();
		
		String browserName = prop.readPropData("browser");
		
		driver = df.initBrowser(browserName);
		
		driver.manage().window().maximize();
		
	}
	
	@After(order = 2)
	public void tearDown(Scenario scenario)
	{
		boolean scenarioStatus = scenario.isFailed();
		
		if(scenarioStatus)
		{
			String nameOfScenario = scenario.getName();
			String modifiedScenarioName = nameOfScenario.replaceAll(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", modifiedScenarioName);
		}
	}
	
	
	@After(order = 1)
	public void shutDown()
	{
		driver.quit();
	}

}
