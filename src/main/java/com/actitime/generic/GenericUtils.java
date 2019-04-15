package com.actitime.generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils extends BestTest{
	
	public static void getScreenShot(WebDriver driver,String name)
	{
		try {
			TakesScreenshot ts= (TakesScreenshot) driver;
			File src =ts.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\golan\\ProjectManagement\\ActiTime\\screenshots\\"+name+".png");
			FileUtils.copyFile(src, des);
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void selectByIndex(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
		
	
	}
	public static void selectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	public static void selectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public static void deselectAll(WebElement element)
	{
		Select sel = new Select(element);
		sel.deselectAll();
	}
	
	public static void deselectByVisibleText(WebElement element, String text)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void deselectByIndex(WebElement element, String index)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(index);
	}
	
	public static void deselectByValue(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}
	
	public static List<WebElement> getAllSelectedOption(WebElement element, List<WebElement> allSelectedOptions)
	{
		Select sel = new Select(element);
		allSelectedOptions=sel.getAllSelectedOptions();
		return allSelectedOptions;
		
	}
	public static WebElement getFirstSelectedOption(WebElement element, WebElement firstSelectedOption)
	{
		Select sel = new Select(element);
		firstSelectedOption=sel.getFirstSelectedOption();
		return firstSelectedOption;
		
	}
	//add all the common methods later
	
	
	public static Alert swithcToJavaScriptAlertPopup(WebDriver driver)
	{
		
		Alert a= driver.switchTo().alert();
		return a;
		
	}
	public static Alert swithcToJavaScriptPromptPopup(WebDriver driver)
	{
		
		Alert p= driver.switchTo().alert();
		return p;
		
	}
	
	public static Alert swithcToJavaScriptConformationPopup(WebDriver driver)
	{
		
		Alert c= driver.switchTo().alert();
		return c;
		
	}
	
	public static void swithcToJavaScriptAlertPopupToClickOnOk(WebDriver driver,Alert a)
	{
		
		a.accept();
		
	}
	public static String swithcToJavaScriptAlertPopupToGetTestMeaasge(WebDriver driver,Alert a)
	{

		String textMsg=a.getText();
		return textMsg;
		
	}
	
	
	public static void swithcToJavaScriptPromptPopupToEnterTheText(WebDriver driver, Alert p,String text)
	{
		p.sendKeys(text);
		
	}
	
	public static void swithcToJavaScriptPromptPopupToClickOnOk(WebDriver driver,Alert p )
	{
		
		p.accept();
		
	}
	public static void swithcToJavaScriptPromptPopupToClickOnCancle(WebDriver driver,Alert p)
	{
		
		
		p.dismiss();
		
	}
	public static void swithcToJavaScriptConformationPopupToClickOnOk(WebDriver driver,Alert c)
	{
		
		c.accept();
		
	}
	public static String swithcToJavaScriptConformationPopupToGetTestMeaasge(WebDriver driver,Alert c)
	{

		String textMsg=c.getText();
		return textMsg;
		
	}
	public static void swithcToJavaScriptConformationPopupToClickOnCancle(WebDriver driver,Alert c)
	{
		
		
		c.dismiss();
		
	}
	
	public static void upLoadTheFileInfileuploadPopup(WebDriver driver,WebElement linkAddress,String absoluteFilePath)
	{
		linkAddress.sendKeys(absoluteFilePath);
	}
	public static void uploadTheFileUsingRobotClassInFileUploadPopup(WebDriver driver,String absoluteFilePath ) throws AWTException, InterruptedException
	{
		StringSelection s = new StringSelection(absoluteFilePath);
		//to get the clipboard
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		Robot r = new Robot();
		
		//to paste the path of the file
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}
	
	public static void fileDownloadInFireFoxusingProfile(String key,String value)
	{
		
		FirefoxProfile profile = new FirefoxProfile();
		
		profile.setPreference(key, value);
		FirefoxOptions options = new FirefoxOptions();
		options.setProfile(profile);
		
	}
	
	public static void fileDownloadInFireFoxusingRobotClass() throws AWTException, InterruptedException
	{
		
		Robot r = new Robot();
		
		//to paste the path of the file
		
		r.keyPress(KeyEvent.VK_ALT );
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
					
	}
	
	//widows popup
	//child popup
	
}
