package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	@FindBy(xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon;

	@FindBy(xpath = "//*[@alt='Great Freedom Sale']")
	private WebElement sportsSection;

	@FindBy(xpath = "//*[@alt='Amazon Business']")
	private WebElement cricketTab;

	private WebDriver driver;

	private WebDriverWait wait;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);

	}

	public String fetchTitle() {
		String title = driver.getTitle();
		return title;
	}

	public boolean verifyCartIcon() {
		boolean isDisplaying = cartIcon.isDisplayed();

		return isDisplaying;
	}

	public void enteringSportsSection() {
		wait.until(ExpectedConditions.visibilityOf(sportsSection));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", sportsSection);

	}

	public boolean identifyCricketTab() {
		wait.until(ExpectedConditions.visibilityOf(cricketTab));

		boolean isDisplaying = cricketTab.isDisplayed();

		return isDisplaying;
	}

}
