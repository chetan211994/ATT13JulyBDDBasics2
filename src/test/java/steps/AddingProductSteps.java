package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddingProductSteps {
	static String productId;
	public String getProductId()
	{
		return productId;
	}
	
	
	@Given("I should be at product page")
	public void i_should_be_at_product_page() {
	   System.out.println("Given statement for product page");
	}

	@When("I click on add to cart button")
	public void i_click_on_add_to_cart_button() {
	   System.out.println("Clicked on add to cart button");
	}

	@Then("Product should get added")
	public void product_should_get_added() {
	   System.out.println("Product added!");
	   
	   productId = "jh324dfhsjg23sfdkjfd";
	   
	   
	}

	

@Then("page title should contains {string}")
public void page_title_should_contains(String string) {
   System.out.println("page title is "+string);
   
   System.out.println("product id from title scenario "+productId);
}
	

}
