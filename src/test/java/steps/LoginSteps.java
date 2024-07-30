package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("I am at the login page")
	public void preRequisite()
	{
		System.out.println("Given statement");
	}
	
	@When("I enter the credentials")
	public void enterCredentials()
	{
		System.out.println("Entering credentials");
	}
	
	@When("I click on login button")
	public void clickOnLogin()
	{
		System.out.println("Clicked on login button");
	}
	
	@Then("I should be able to login")
	public void validateLogin()
	{
		System.out.println("Login validated");
	}
	
	
	@Then("I should see page title")
	public void validateTitle()
	{
		System.out.println("Title validated");
	}
}
