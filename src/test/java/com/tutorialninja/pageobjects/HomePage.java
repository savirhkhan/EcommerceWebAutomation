package com.tutorialninja.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	By LoginRegisterDropDown = By.cssSelector("a[title='My Account']");
	By RegisterLink = By.linkText("Register");
	
	public WebElement getLoginRegisterDropDown() {
		return driver.findElement(LoginRegisterDropDown);
	}
	
	public WebElement getRegisterLink() {
		return driver.findElement(RegisterLink);
	}

}
