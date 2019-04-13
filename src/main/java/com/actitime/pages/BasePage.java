package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void varifyTitle(String eTitle)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			
			
			wait.until(ExpectedConditions.titleIs(eTitle));
			Reporter.log("Title is matching "+eTitle,true);
			
		}catch(Exception e)
		{
			Reporter.log("Title is not matching: expected title is : "+eTitle,true);
			Reporter.log("Actual  title is "+driver.getTitle(),true);
			Assert.fail();
		}
	}
	
	public void varifyTheElement(WebElement element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		try {
			
			
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present",true);
			
		}
		catch(Exception e)
		{
			Reporter.log("element is not present",true);
			Assert.fail();
		}
	}

}
