package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginSteps {

	@Given("Browser is opened")
	public void browser_is_opened() {
		
		System.out.println("Browser Opened successfully");
	}

	@Then("Enter User Name and Password")
	public void enter_user_name_and_password() {
		
		System.out.println("Entered Uname and Password");
	}

	@Then("click on Login button")
	public void click_on_login_button() {
		
		System.out.println("Clicked on Login Button");
	}

	@Then("Verify Logout button is available")
	public void verify_logout_button_is_available() {
		System.out.println("Logout button is available");
	}

	@Then("Verify Logout button is not available")
	public void verify_logout_button_is_not_available() {
		System.out.println("Logout button is not available");
	}

}
