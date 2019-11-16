package org.hcl.abc.asertions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Verification {
	
	public static boolean validatePageURL(ChromeDriver driver, String expectedURL)
	{
		boolean result =false;
		if(driver.getCurrentUrl().equalsIgnoreCase(expectedURL))
		{
			result = true;
		}
		
		return result;
	}

	public static boolean validatePageTitle(ChromeDriver driver, String expectedTitle)
	{
		boolean result =false;
		if(driver.getTitle().equalsIgnoreCase(expectedTitle))
		{
			result = true;
		}
		
		return result;
	}

	
	public static boolean validateTextgOnPage (ChromeDriver driver, String exptectText)
	{
		boolean result =false;
		if(driver.getPageSource().contains(exptectText))
		{
			result = true;
		}
		
		return result;
	}
	
	public static boolean validateElementOnPage(ChromeDriver driver,  String xpath)
	{
		boolean result =false;
		try
		{
			driver.findElementByXPath(xpath);
			result =true;
		}
		catch(Exception e)
		{}
		return result;
	}
	
	public static boolean validateElementOnVisibleOnPage(ChromeDriver driver,  String xpath)
	{
		boolean result =false;
		try
		{
			if(driver.findElementByXPath(xpath).isEnabled())
			{
			result =true;
			}
		}
		catch(Exception e)
		{}
		return result;
	}
	
}
