package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BestTest;
import com.actitime.pages.BasePage;
import com.actitime.pages.ExcelData;
import com.actitime.pages.LoginPage;

public class InvalidLoginTest extends BestTest {

	@Test(priority=2)
	public void testInvalidLogin() throws InterruptedException 
	{
		String loginPageTitle = ExcelData.getData(File_path, "TC02", 1, 2);
		String errorMessage =ExcelData.getData(File_path, "TC02", 1, 3);
		LoginPage lp = new LoginPage(driver);
		
		//varify the login page
		lp.verifyPage(loginPageTitle);
		
		int rc=ExcelData.geRowCount(File_path, "TC02");
		 for(int i=0;i<rc;i++)
		 {	
		 	
			 String username=ExcelData.getData(File_path,"TC02", 1, 0);
			 String password =ExcelData.getData(File_path, "TC02", 1, 1);
			
			 
			//enter the username
			 Reporter.log("valid user name "+username,true);
			 lp.enterUsername(username);
			 //enter the password
			 Reporter.log("valid password "+password,true);
			 lp.enterPassword(password);
			 //click on login button
			 lp.clickOnLogin();
			 Thread.sleep(1000);
			 
			 String actualErrorMessage=lp.varifyErrorMessage();
			 
			 Reporter.log("Excepted Error message: "+errorMessage, true);
			 Reporter.log("Actual Error message: "+actualErrorMessage, true);
			 Assert.assertEquals(actualErrorMessage, errorMessage);
			 Reporter.log("error message is matching......", true);
			 Reporter.log("---------------", true);
			 
		 }
		
	}

}

