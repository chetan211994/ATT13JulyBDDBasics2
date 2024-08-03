package uiappfeature;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	HomePage homepage =new  HomePage(DriverFactory.getDriver());
@Given("I am at the landing page")
public void i_am_at_the_landing_page() {
WebDriver driver = DriverFactory.getDriver();

driver.get("https://www.amazon.in/");
}

@Then("page title should have {string}")
public void page_title_should_have(String string) {

	String actualTitle = homepage.fetchTitle();
boolean isPresent = actualTitle.contains(string);

Assert.assertEquals(isPresent, true);
}


@Then("cart icon should get display")
public void cart_icon_should_get_display() {
  boolean isDisplaying = homepage.verifyCartIcon();
  
  Assert.assertEquals(isDisplaying, true);
}

@When("I click on sports section")
public void i_click_on_sports_section() {
    homepage.enteringSportsSection();
}

@Then("cricket tab should get display")
public void grocery_section_should_open() {
   boolean isDisplaying = homepage.identifyCricketTab();
   
   assertEquals(isDisplaying, true);
}
}
