package com.actitime.tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BestTest;
import com.actitime.pages.ExcelData;
import com.actitime.pages.LoginPage;

public class VerifyVersionTest extends BestTest{
	
	
	@Test(priority=3)
	public void testVerifyVersion() 
	{
		
		String loginPageTitle = ExcelData.getData(File_path, "TC03", 1, 0);
		String expectedversion =ExcelData.getData(File_path, "TC03", 1, 1);
		
		LoginPage lp = new LoginPage(driver);
		
		//varify the login page
		lp.verifyPage(loginPageTitle);
		
		//to varify version
		String actualVersion =lp.verifyVersion(); 
		
		Reporter.log("Excepted version: "+expectedversion, true);
		 Reporter.log("Actual Error message: "+actualVersion, true);
		 SoftAssert sf = new SoftAssert();
		 sf.assertEquals(actualVersion, expectedversion);
		 sf.assertAll();
		 Reporter.log("version is matching-----  ", true);
	}
}
