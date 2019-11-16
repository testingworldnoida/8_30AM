package org.hcl.abc.testcases;

import java.util.List;

import org.hcl.abc.base.InitiateBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_002 extends InitiateBrowser {
	
	  public void sum(int a, int b)
	  {
		  System.out.println(a+b);
	  }
	  
	  public void sum(float a, int b)
	  {
		  System.out.println(a+b);
	  }

	  
	  public void abcd(int a, int b, int c)
	  {
		  System.out.println(a+b+c);
	  }
}
