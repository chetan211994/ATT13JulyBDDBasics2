package uiappfeature;

import org.testng.Assert;

import drivermanager.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SearchPage;

public class SearchProductSteps {
	SearchPage search = new SearchPage(DriverFactory.getDriver());
	
	@When("I search product as {string}")
	public void i_search_product_as(String string) {
	   search.enterProduct(string);
	}

	@Then("I should see the results")
	public void i_should_see_the_results() {
	   boolean isDisplaying = search.verifyProduct();
	   Assert.assertTrue(isDisplaying);
	}
}
