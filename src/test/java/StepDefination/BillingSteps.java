package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingSteps 
{
	double billingamount;
	double taxamount;
	double finalamount;
	
	@Given("user is on billing page")
	public void user_is_on_billing_page() {
	    
	}
	
	@When("user enters billing amount {string}")
	public void user_enters_billing_amount(String billingamount) {
		 this.billingamount = Double.parseDouble(billingamount);
	}

	@When("user enters taxamount {string}")
	public void user_enters_taxamount(String taxamount) {
	    this.taxamount = Double.parseDouble(taxamount);
	}
	

	@When("user clicks on Calculate button")
	public void user_clicks_on_calculate_button() {
	    
	}

	@Then("it gives the final amount {string}")
	public void it_gives_the_final_amount(String exefinalamount) {
	   this.finalamount = this.billingamount + this.taxamount;
	   System.out.println("expected final amount:" +Double.parseDouble(exefinalamount));
	   System.out.println("actual final amount:" +this.finalamount);
	   
	   Assert.assertTrue(this.finalamount == Double.parseDouble(exefinalamount));
	}

}
