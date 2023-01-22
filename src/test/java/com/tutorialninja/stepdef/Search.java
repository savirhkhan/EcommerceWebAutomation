package com.tutorialninja.stepdef;

import java.io.IOException;

import org.testng.Assert;

import com.tutorialninja.pageobjects.PageObjectsManager;

import base.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	Hooks hk;
	PageObjectsManager pageManager;
	
	@When("I search for a product {string}")
	public void i_search_for_a_product(String string) throws IOException {
		hk = new Hooks();
		pageManager = new PageObjectsManager(hk.getDriver());
		pageManager.getHomePage().searchBox.sendKeys(string);
		pageManager.getHomePage().searchButton.click();
	    
	}
	
	@Then("I should see the product in the search results")
	public void i_should_see_the_product_in_the_search_results() {
		
		Assert.assertTrue(pageManager.getSerachResultsPage().samsungSyncMasterSearchResults.isDisplayed());
		hk.tearDown();
	   
	}
	
	@Then("I should see the page displaying the message {string}")
	public void i_should_see_the_page_displaying_the_message(String string) {
	   String actualNoResultsAvailableMessage = pageManager.getSerachResultsPage().noSearchResultsAvailableMessage.getText();
	   Assert.assertEquals(actualNoResultsAvailableMessage, string);
	   hk.tearDown();
	}
	



}
