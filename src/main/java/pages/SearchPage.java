package pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchField;

	@FindBy(xpath = "//*[@id='nav-search-submit-button']")
	private WebElement searchButton;
	
	@FindBy(xpath = "//*[contains(text(),'Redmi 13C (Starfrost White')]/parent::a")
	private WebElement redmi13cPhone;

	private WebDriver driver;

	private WebDriverWait wait;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		PageFactory.initElements(driver, this);

	}

	public void enterProduct(String product) {
		searchField.sendKeys(product);
		searchButton.click();
	}

	public boolean verifyProduct() {
		wait.until(ExpectedConditions.visibilityOf(redmi13cPhone));
		boolean isDisplaying = redmi13cPhone.isDisplayed();

		return isDisplaying;
	}

	
}
