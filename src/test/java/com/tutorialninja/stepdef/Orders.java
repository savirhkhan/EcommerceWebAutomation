package com.tutorialninja.stepdef;

import java.io.IOException;

import org.testng.Assert;

import com.tutorialninja.pageobjects.PageObjectsManager;

import base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orders {
	Hooks hk;
	PageObjectsManager pageManager;
	
	@Given("I login to the application")
	public void i_login_to_the_application() throws IOException {
		hk = new Hooks();
		hk.setUp();
		pageManager = new PageObjectsManager(hk.getDriver());
		pageManager.getHomePage().LoginRegisterDropDown.click();
		pageManager.getHomePage().loginLink.click();
		pageManager.getLoginPage().userName.sendKeys("sh6147782@gmail.com");
		pageManager.getLoginPage().password.sendKeys("testpass");
		pageManager.getLoginPage().loginButton.click();
	    
	}
	@When("I add a product to bag and check")
	public void i_add_a_product_to_bag_and_check() throws InterruptedException {
		pageManager.getHomePage().searchBox.sendKeys("samsung sync");
		pageManager.getHomePage().searchButton.click();
		pageManager.getSerachResultsPage().firstAddToCartOption.click();
		pageManager.getHomePage().navigateToShoppingCartPage.click();
		pageManager.getShoppingCartPage().checkOututton.click();
	
	 
	}
	@When("I place an order")
	public void i_place_an_order() {
		
	 
	}
	@Then("I should see the order is placed successfuly")
	public void i_should_see_the_order_is_placed_successfuly() {
		//hk.tearDown();
	  
	}


}
