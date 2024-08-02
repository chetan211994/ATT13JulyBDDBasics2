package uiappfeature;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import drivermanager.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
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
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
