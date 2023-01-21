package com.tutorialninja.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	WebDriver driver;

	public ForgotPasswordPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[name='email']")
	public WebElement emailToSendResetPasswordLink;
	
	@FindBy(xpath = "//input[@value='Continue']")
	public WebElement continueButtonToResetPassword;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	public WebElement emailConfirmationMsg;

}
