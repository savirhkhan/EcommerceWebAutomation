package com.tutorialninja.stepdef;

import java.io.IOException;

import org.testng.Assert;

import com.tutorialninja.pageobjects.PageObjectsManager;

import base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	Hooks hk;
	PageObjectsManager pageManager;
	
	@Given("I navigate to Account Login Page")
	public void i_navigate_to_account_login_page() throws IOException {
		hk = new Hooks();
		pageManager = new PageObjectsManager(hk.getDriver());
		pageManager.getHomePage().LoginRegisterDropDown.click();
		pageManager.getHomePage().loginLink.click();
	   
	}
	@When("I login to application using Username {string} and Password {string}")
	public void i_login_to_application_using_username_and_password(String userName, String password) {
		pageManager.getLoginPage().userName.sendKeys(userName);
		pageManager.getLoginPage().password.sendKeys(password);
		pageManager.getLoginPage().loginButton.click();
	    
	}
	@Then("I should see that user is able to successfully login")
	public void i_should_see_that_user_is_able_to_successfully_login() {
		Assert.assertTrue(pageManager.getMyAccountPage().registerAffiliateAccountLink.isDisplayed());
		hk.tearDown();
	 
	}
	
	@Then("I should see that the credentials are invalid")
	public void i_should_see_that_the_credentials_are_invalid() {
		String actuaText = pageManager.getLoginPage().incorrectIdPassWarningMsg.getText();
	    String expectedText = "Warning: No match for E-Mail Address and/or Password.";
	    Assert.assertEquals(actuaText, expectedText);
	    hk.tearDown();
	}
	
	@When("I reset the forgotton password")
	public void i_reset_the_forgotton_password() {
	   pageManager.getLoginPage().forgotPasswordLink.click();
	   pageManager.getForgotPasswordPage().emailToSendResetPasswordLink.sendKeys("sh26147782@mail.com");
	   pageManager.getForgotPasswordPage().continueButtonToResetPassword.click();
	}
	@Then("I should see a message informing the user that information related to resetting password have been send to email addess")
	public void i_should_see_a_message_informing_the_user_that_information_related_to_resetting_password_have_been_send_to_email_addess() {
		Assert.assertTrue(pageManager.getForgotPasswordPage().emailConfirmationMsg.isDisplayed());
		hk.tearDown();
	    
	}




}
