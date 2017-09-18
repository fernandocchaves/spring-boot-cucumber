package com.github.fernandocchaves.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberApplication {

	@Given("^this is my first step$")
	public void this_is_my_first_step() throws Throwable {
		System.out.println("this is my first step");
	}

	@When("^this is my second step$")
	public void this_is_my_second_step() throws Throwable {
		System.out.println("this is my second step");
	}

	@Then("^this is my last step$")
	public void this_is_my_last_step() throws Throwable {
		System.out.println("this is my last step");
	}

}
