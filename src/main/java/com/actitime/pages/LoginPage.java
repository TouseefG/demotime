package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
//declaration
	@FindBy(id="username")
	WebElement usernameTB;
	@FindBy(name="pwd")
	WebElement passwordTB;
	@FindBy(xpath="//div[.='Login ']")
	WebElement loginBTN;
	@FindBy(xpath="//nobr[contains(.,'actiTIME')]")
	WebElement version;
	@FindBy(xpath="//span[contains(.,'invalid')]")
	WebElement errorMasge;
	
	//initialization
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	
	public void verifyPage(String etitle)
	{
		varifyTitle(etitle);
	}
	
	public void enterUsername(String username)
	{
		usernameTB.sendKeys(username);
	}
	public void enterPassword(String password)
	{
		
		passwordTB.sendKeys(password);
	}
	public void clickOnLogin()
	{
		loginBTN.click();
	}
	public String verifyVersion()
	{
		varifyTheElement(version);
		String aversion=version.getText();
		return aversion;
		
	}
	public String varifyErrorMessage()
	{
		varifyTheElement(errorMasge);
		String aerrorMessage=errorMasge.getText();
		return aerrorMessage;
		 
	}
	
	
	
}
