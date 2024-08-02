package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrderConfirmationSteps {
	AddingProductSteps addingProduct;
	
	public OrderConfirmationSteps(AddingProductSteps aps)
	{
		addingProduct	= aps;
	}
	
	@When("I click on place order")
	public void i_click_on_place_order() {
	   System.out.println("Placing order");	    
	}

	
	
	@Then("Order should get placed")
	public void order_should_get_placed() {
		String productIdValue = addingProduct.getProductId();
		
	   System.out.println("Order placed and the product id is "+productIdValue );
	}

}
