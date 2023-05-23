package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {

	@Given("User wants to select a car type {string} from Uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
	    System.out.println("Step 1: " + carType);
	}

	@When("User selects {string} and pick-up location as {string} and drop location {string}")
	public void user_selects_and_pick_up_point_as_and_drop_location(String carType, String pickUpLocation, String DropLocation) {
	    System.out.println("Step 2: " + carType + " " + pickUpLocation + " " + DropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
	   System.out.println("Step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
	    System.out.println("Step 4");
	}

	@Then("User pays {int} pounds")
	public void user_pays_pounds(Integer price) {
	   System.out.println("Step 5:" + price);
	}
}
