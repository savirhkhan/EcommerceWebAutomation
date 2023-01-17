package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;



public class PageObjectsManager {
	
	private HomePage homePage;
	private RegistrationPage registrationPage;
	private WebDriver driver;

	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
	
	public RegistrationPage getRegistrationPage() {
		registrationPage = new RegistrationPage();
		return registrationPage;
	}
	
	
	
	
	

}
