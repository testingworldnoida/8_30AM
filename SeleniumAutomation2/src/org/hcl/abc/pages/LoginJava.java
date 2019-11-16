package org.hcl.abc.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class LoginJava {
	
	EventFiringWebDriver driver =null;
	ResourceBundle rb ;
	public LoginJava(EventFiringWebDriver driver)
	{
		this.driver=driver;
		rb = ResourceBundle.getBundle("Elements");
	}
	
	public void enterUserName( String uname)
	{
	    driver.findElement(By.name(rb.getString("login_username_name"))).sendKeys(uname);	
		 	 
	}
	
	public void enterPassword(String pass)
	{
	    driver.findElement(By.name(rb.getString("login_password_name"))).sendKeys(pass);	
		
	}
	
	public void clickSignIN()
	{
	    driver.findElement(By.xpath(rb.getString("login_signin_xpath"))).click();	

	}
	

}
