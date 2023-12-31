package Stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjectmodel.SignInPage;
import resources.BaseClass;

public class LoginAmazon_1 extends BaseClass {
	WebDriver driver;
	SignInPage sip=new SignInPage();

	@Given("Navigate to the sign in Page")
	public void navigate_to_the_sign_in_page() throws IOException {
		initializedDriver();
		
		SignInPage.homeInPage.click();
		SignInPage.signInPage.click();
		

	}

	@When("^User enter the mobile number as (.*) $")
	public void user_enter_the_mobile_number_as(String int1) {
		SignInPage.mobileNumber.sendKeys(int1);
		

	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		SignInPage.continueButton.click();

	}

	@Then("User should get the Password Page")
	public void user_should_get_the_password_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("User should not get the Password Page")
	public void user_should_not_get_the_password_page() {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("user should get the warning message as Incorrect phone number")
	public void user_should_get_the_warning_message_as_incorrect_phone_number() {

	}

}
