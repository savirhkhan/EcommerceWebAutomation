package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;



public class PageObjectsManager {
	
	private HomePage homePage;
	private RegistrationPage registrationPage;
	private LoginPage loginPage;
	private MyAccountPage myAccountPage;
	private ForgotPasswordPage forgotPasswordPage;
	private SerachResultsPage serachResultsPage;
	private WebDriver driver;

	
	public PageObjectsManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		homePage = new HomePage(driver);
		return homePage;
	}
	
	public RegistrationPage getRegistrationPage() {
		registrationPage = new RegistrationPage(driver);
		return registrationPage;
	}
	
	public LoginPage getLoginPage() {
		loginPage = new LoginPage(driver);
		return loginPage;
	}
	
	public MyAccountPage getMyAccountPage() {
		myAccountPage = new MyAccountPage(driver);
		return myAccountPage;
	}
	
	public ForgotPasswordPage getForgotPasswordPage() {
		forgotPasswordPage = new ForgotPasswordPage(driver);
		return forgotPasswordPage;
	}
	
	public SerachResultsPage getSerachResultsPage() {
		serachResultsPage = new SerachResultsPage(driver);
		return serachResultsPage;
	}
	
	
	
	
	
	
	
	
	

}
