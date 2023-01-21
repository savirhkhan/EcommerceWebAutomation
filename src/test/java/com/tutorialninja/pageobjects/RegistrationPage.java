package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
WebDriver driver;
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement firstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement lastName;
	
	@FindBy(xpath = "//input[@name='email']")
	public WebElement email;
	
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement phone;
	
	@FindBy(css ="input[name='password']")
	public WebElement password;
	
	@FindBy(css = "input[name='confirm']")
	public WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@name='agree']")
	public WebElement privacyPolicyCheckBox;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement continueButton;
	
	@FindBy(css = "div[id='content'] h1")
	public WebElement confirmationmsg;
	
	@FindBy(css = ".alert-dismissible")
	public WebElement registrationPageWarningMsg;
	
	@FindBy(xpath = "//div[contains(text(),'First Name must be between 1 and 32 characters!')]")
	public WebElement firstNameWarningMsg;
	
	@FindBy(xpath = "//div[contains(text(),'Last Name must be between 1 and 32 characters!')]")
	public WebElement lastNameWarningMsg;
	
	@FindBy(xpath = "//div[contains(text(),'E-Mail Address does not appear to be valid!')]")
	public WebElement emailWarningMsg;
	
	@FindBy(xpath = "//div[contains(text(),'Telephone must be between 3 and 32 characters!')]")
	public WebElement phoneNumberWarningMsg;
	
	@FindBy(xpath = "//div[contains(text(),'Password must be between 4 and 20 characters!')]")
	public WebElement passwordWarningMsg;
	
	@FindBy(xpath = "(//input[@name='newsletter'])[1]")
	public WebElement subscribeYesRadio;
	
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	public WebElement userExistWarningMsg;


}
