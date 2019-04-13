package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BestTest implements AutoConstant{
	

public WebDriver driver;
static {
	System.setProperty(chrome_key, chrome_value);
	System.setProperty(gecko_key, gecko_value);
	
}


@BeforeMethod
public void preCondition()
{	//user this if your using firefox browser and you want tto download a file
	//GenericUtils.fileDownloadInFireFoxusingProfile(key,value);
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https:/demo.actitime.com/login.do");
}

@AfterMethod
public void postCondition(ITestResult itr)

{
	
	int status = itr.getStatus();
			if(status==2)
			{
				
				String name =itr.getName();
				GenericUtils.getScreenShot(driver,name);
			}

driver.close();

}
}
