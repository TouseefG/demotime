package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends BasePage {
//initilization
	@FindBy(xpath="//a[@id='logoutLink']")
	WebElement logoutBTN;
	
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
		
	}
	public void verifyPage(String etitle)
	{
		varifyTitle(etitle);
	}
	public void clickOnLogout()
	{
		logoutBTN.click();
	}
	
	
}
