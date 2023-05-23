package StepDefination;

import AmazonImplementation.Product;
import AmazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class SearchSteps 
{
	Product product;
	Search search;
	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
	    System.out.println("Step1: I am on search page");
	}

	@When("I search for a product with a name {string} and price {int}")
	public void i_search_for_a_product_with_a_name_and_price(String productName, Integer price) {
	   System.out.println("Step2: Search the product with name:"+productName+",price:"+ price );
	product = new Product(productName,price);
	
	
	}

	@Then("product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	   System.out.println("Step3: product " +productName+ " is displayed");
	   
	   search = new Search();
	   String name = search.displayProduct(product);
	   System.out.println("Search product name is:" +name);
	   Assert.assertEquals(product.getProductName(), name);
	   
	}


	
	
	
}
