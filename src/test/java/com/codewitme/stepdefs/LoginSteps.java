package com.codewitme.stepdefs;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps  {
	@Given("^I have a valid credentials$")
	public void i_have_a_valid_credentials() throws Throwable {
	   
	}

	@When("^I enter my credentials$")
	public void i_enter_my_credentials() throws Throwable {
	    
	}

	@When("^I login to the application$")
	public void i_login_to_the_application() throws Throwable {
	  
	}

	@Then("^I am able to verfiy the passenger details form$")
	public void i_am_able_to_verfiy_the_passenger_details_form() throws Throwable {
	    Assert.assertFalse("FAILELD FAILED", true);
	}
}
