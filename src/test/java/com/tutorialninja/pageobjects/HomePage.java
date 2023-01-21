package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(css = "a[title='My Account']")
	public WebElement LoginRegisterDropDown;
	
	@FindBy(linkText = "Register")
	public WebElement RegisterLink;
	
	@FindBy(linkText = "Login")
	public WebElement loginLink;
	
	
	

}
