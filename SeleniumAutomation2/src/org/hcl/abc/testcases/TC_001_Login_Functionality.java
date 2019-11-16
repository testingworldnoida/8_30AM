package org.hcl.abc.testcases;

import java.util.List;
import java.util.Set;

import org.hcl.abc.asertions.Verification;
import org.hcl.abc.base.InitiateBrowser;
import org.hcl.abc.pages.LoginJava;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_001_Login_Functionality extends InitiateBrowser{
	
	
	@Test
	public void tc001()
	{  
		String mainWindow="";
		Set<String> allWindow = driver.getWindowHandles();
		for(String win :  allWindow)
		{
			driver.switchTo().window(win);
			if(driver.getCurrentUrl().equalsIgnoreCase("https://www.naukri.com/"))
			{
				mainWindow=win;
			}
			else
			{
				driver.close();
			}
			
			driver.switchTo().activeElement();
			driver.switchTo().window(mainWindow);
				driver.switchTo().frame(driver.findElement(By.xpath("qwqewqeq")));
				driver.switchTo().defaultContent();
		}
	}
	


}
