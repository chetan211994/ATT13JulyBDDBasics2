package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {
	
	@Given("user should be at campaign page")
	public void user_should_be_at_campaign_page() {
	   System.out.println("Given statement for campaign");
	}

	@When("user clicks on create campaign")
	public void user_clicks_on_create_campaign() {
	   System.out.println("Creating campaign");
	}

	@When("user enters the information")
	public void user_enters_the_information() {
	   System.out.println("Entering information");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
	   System.out.println("Campaign created");
	}

	@When("user click on delete button")
	public void user_click_on_delete_button() {
	    System.out.println("Clicked on delete button");
	}

	@Then("campaign should get deleted")
	public void campaign_should_get_deleted() {
	   System.out.println("Campaign deleted!");
	}
	
	@When("user click on edit campaign button")
	public void user_click_on_edit_campaign_button() {
	    System.out.println("Click on edit campaign");
	}

	@When("user update the details")
	public void user_update_the_details() {
	   System.out.println("Details updated");
	}

	@Then("campaign should get updated")
	public void campaign_should_get_updated() {
	 System.out.println("Campaign modified!");
	}

}
