package com.actitime.tests;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BestTest;
import com.actitime.pages.EnterTimeTrackPage;
import com.actitime.pages.ExcelData;
import com.actitime.pages.LoginPage;

public class ValidLoginLogoutTest extends BestTest{

@Test(priority=1)
public void testValidLoginLogout() 
{
	
	
String username=ExcelData.getData(File_path,"TC01", 1, 0);
String password =ExcelData.getData(File_path, "TC01", 1, 1);
String loginPageTitle = ExcelData.getData(File_path, "TC01", 1, 2);
String enterTimeTrackPageTitle = ExcelData.getData(File_path, "TC01", 1, 3);

LoginPage lp = new LoginPage(driver);
EnterTimeTrackPage ep=new EnterTimeTrackPage(driver);


//varify the login page
lp.verifyPage(loginPageTitle);
//enter the username
Reporter.log("valid user name "+username,true);
lp.enterUsername(username);
//enter the password
Reporter.log("valid password "+password,true);
lp.enterPassword(password);
//click on login button
lp.clickOnLogin();
//verify the enter time track page title
lp.verifyPage(enterTimeTrackPageTitle);
//ep.verifyPage(enterTimeTrackPageTitle);
//logout fron application
ep.clickOnLogout();
//varify the login page
lp.verifyPage(loginPageTitle);
}
	
}
