package com.tutorialninja.stepdef;

import java.io.IOException;
import java.util.Map;

import org.testng.Assert;

import com.tutorialninja.pageobjects.PageObjectsManager;

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
		pageManager.getHomePage().LoginRegisterDropDown.click();
		pageManager.getHomePage().RegisterLink.click();

	}

	@When("I provide all the below valid details")
	public void i_provide_all_the_below_valid_details(DataTable dataTable) {

		Map<String, String> map = dataTable.asMap(String.class, String.class);
		pageManager.getRegistrationPage().firstName.sendKeys(map.get("FirstName"));
		pageManager.getRegistrationPage().lastName.sendKeys(map.get("LastName"));
		pageManager.getRegistrationPage().email.sendKeys(System.currentTimeMillis()+map.get("Email"));
		pageManager.getRegistrationPage().phone.sendKeys(map.get("Telephone"));
		pageManager.getRegistrationPage().password.sendKeys(map.get("Password"));
		pageManager.getRegistrationPage().confirmPassword.sendKeys(map.get("Password"));
		
		
	}

	@When("I select the privacy policy")
	public void i_select_the_privacy_policy() {
		pageManager.getRegistrationPage().privacyPolicyCheckBox.click();

	}

	@When("I click on Continue button")
	public void i_click_on_continue_button() {
		pageManager.getRegistrationPage().continueButton.click();

	}

	@Then("I should see that the user account has successfully created")
	public void i_should_see_that_the_user_account_has_successfully_created() {
		String actualConfirmationMsg = pageManager.getRegistrationPage().confirmationmsg.getText();
		String expectedConfirmationMsg = "Your Account Has Been Created!";
		Assert.assertEquals(actualConfirmationMsg, expectedConfirmationMsg);
		hk.tearDown();

	}
	
	@Then("I should see that the user account is not created")
	public void i_should_see_that_the_user_account_is_not_created() {
		Assert.assertTrue(pageManager.getRegistrationPage().confirmationmsg.isDisplayed());
	  
	}
	@Then("I should see the error message inorming the user to fill the mandatory fields")
	public void i_should_see_the_error_message_inorming_the_user_to_fill_the_mandatory_fields() {
		Assert.assertTrue(pageManager.getRegistrationPage().registrationPageWarningMsg.isDisplayed());
		Assert.assertTrue(pageManager.getRegistrationPage().firstNameWarningMsg.isDisplayed());
		Assert.assertTrue(pageManager.getRegistrationPage().lastNameWarningMsg.isDisplayed());
		Assert.assertTrue(pageManager.getRegistrationPage().emailWarningMsg.isDisplayed());
		Assert.assertTrue(pageManager.getRegistrationPage().phoneNumberWarningMsg.isDisplayed());
		Assert.assertTrue(pageManager.getRegistrationPage().passwordWarningMsg.isDisplayed());
		hk.tearDown();
	   
	}
	
	@When("I subscribe to Newsletter")
	public void i_subscribe_to_newsletter() {
		pageManager.getRegistrationPage().subscribeYesRadio.click();
	    
	}
	
	@When("I provide all the below dupplicate details")
	public void i_provide_all_the_below_dupplicate_details(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> map = dataTable.asMap(String.class, String.class);
		pageManager.getRegistrationPage().firstName.sendKeys(map.get("FirstName"));
		pageManager.getRegistrationPage().lastName.sendKeys(map.get("LastName"));
		pageManager.getRegistrationPage().email.sendKeys(map.get("Email"));
		pageManager.getRegistrationPage().phone.sendKeys(map.get("Telephone"));
		pageManager.getRegistrationPage().password.sendKeys(map.get("Password"));
		pageManager.getRegistrationPage().confirmPassword.sendKeys(map.get("Password"));
	    
	}
	@Then("I should see that the user is ristricted from creating duplicate account")
	public void i_should_see_that_the_user_is_ristricted_from_creating_duplicate_account() {
		Assert.assertTrue(pageManager.getRegistrationPage().userExistWarningMsg.isDisplayed());
		hk.tearDown();
	    
	}

}
