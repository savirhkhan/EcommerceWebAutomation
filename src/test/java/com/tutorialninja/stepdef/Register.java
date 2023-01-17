package com.tutorialninja.stepdef;

import java.io.IOException;

import com.tutorialninja.pageobjects.PageObjectsManager;

import base.BasePage;
import base.Hooks;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	Hooks hk;
	PageObjectsManager pageManager;

	@Given("I launch the application")
	public void i_launch_the_application() throws IOException {

		hk = new Hooks();
		hk.setUp();

	}

	@Given("I navigate the accounts registration page")
	public void i_navigate_the_accounts_registration_page() {
		
		pageManager = new PageObjectsManager(hk.getDriver());
		pageManager.getHomePage().getLoginRegisterDropDown().click();
		pageManager.getHomePage().getRegisterLink().click();

	}

	@When("I provide all the below valid details")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {

		throw new io.cucumber.java.PendingException();
	}

	@When("I select the privacy policy")
	public void i_select_the_privacy_policy() {

	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {

	}

	@Then("I should see that the user account has successfully created")
	public void i_should_see_that_the_user_account_has_successfully_created() {

	}

}
