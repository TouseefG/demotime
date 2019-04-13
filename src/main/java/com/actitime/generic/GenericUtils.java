package com.actitime.generic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	
	
 
}
