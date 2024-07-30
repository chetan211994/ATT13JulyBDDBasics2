package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSteps {
//CTRL + SHIFT + O
	
	
@Given("I have logged into the application")
public void loginToApp()
{
	System.out.println("Login to app");
}

@Given("I am at home page")
public void i_am_at_home_page() {
    System.out.println("Given for home page");
}

@When("I click on add button")
public void i_click_on_add_button() {
   System.out.println("Clicked on add profile"); 
}

@When("I enter the data")
public void i_enter_the_data() {
    System.out.println("Added the data");
}

@Then("profile should get added")
public void profile_should_get_added() {
  System.out.println("Profile added!");
}

@When("I click on edit button")
public void i_click_on_edit_button() {
   System.out.println("Clicked on edit");
}

@When("I update the details")
public void i_update_the_details() {
   System.out.println("Updated the data");
}

@Then("profile should get updated")
public void profile_should_get_updated() {
   System.out.println("Profile updated!");
}

@When("I click on delete button")
public void i_click_on_delete_button() {
   System.out.println("Clicked on delete button");
}

@Then("profile should get deleted")
public void profile_should_get_deleted() {
  System.out.println("Profile deleted!");
}


}
