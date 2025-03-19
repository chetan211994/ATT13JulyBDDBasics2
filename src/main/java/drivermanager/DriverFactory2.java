package drivermanager;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

	public class DriverFactory2 {
		
		static WebDriver driver;
		
		
		public WebDriver initBrowser(String browserName) throws MalformedURLException
		{
			Capabilities capabilities;
			if(browserName.equals("Chrome"))
			{
				capabilities = new ChromeOptions();
			}
			
			else
			{
				capabilities = new FirefoxOptions();
			}
			
			driver = new RemoteWebDriver(new URL("http://192.168.46.186:4444/wd/hub"), capabilities);
			return driver;
		}
		
		public static WebDriver getDriver()
		{
			return driver;
		}
	
	}
