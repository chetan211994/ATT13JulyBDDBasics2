package steps;

import java.time.LocalDate;
import java.time.LocalTime;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	
	@Given("user is at signup page")
	public void user_is_at_signup_page() {
	    System.out.println("Given statement");
	}

	@When("user enters name as {string} on form")
	public void user_enters_name_as_on_form(String string) {
	   System.out.println("Entered name is : "+string);
	}

	@When("user select gender as {string}")
	public void user_select_gender_as(String string) {
		 System.out.println("Selected gender is : "+string);
	}

	@When("user select the slotnumber as {int}")
	public void user_select_the_slotnumber_as(Integer int1) {
	   System.out.println("Selected slot number is : "+int1);
	}

	@Then("user gets created")
	public void user_gets_created() {
	   System.out.println("user created!");
	}


}
