package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerachResultsPage {
	WebDriver driver;
	
	public SerachResultsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText = "Samsung SyncMaster 941BW")
	public WebElement samsungSyncMasterSearchResults;
	
	@FindBy(css = "input[type='button']+h2+p")
	public WebElement noSearchResultsAvailableMessage;
	
	@FindBy(xpath = "//div[@class='button-group']//button[1]")
	public WebElement firstAddToCartOption;
	
	
	
	

}
