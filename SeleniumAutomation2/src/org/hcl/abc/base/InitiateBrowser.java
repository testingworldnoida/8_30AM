package org.hcl.abc.base;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.hcl.abc.updatefunctionality.ListenerImplementation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;

public class InitiateBrowser {

    public WebDriver driver ;
    public EventFiringWebDriver driver1 ;
    public ExtentReports rep;
    
    @BeforeSuite
    public void startReport()
    {
    	rep = new ExtentReports("./Reports/Report.html");
    }
    
    @AfterSuite
    public void saveReport()
    {
    	rep.flush();
    	rep.close();
    }
    
    
    
	@BeforeMethod
	public void browserStart()
	{
		 
		 
		 ResourceBundle rb= ResourceBundle.getBundle("Application");
		 System.out.println(rb.getString("Browser"));
		 
		 if(rb.getString("Browser").equalsIgnoreCase("Chrome"))
		 {
			     System.setProperty("webdriver.chrome.driver", "./DriverExecutable/chromedriver.exe");
		         driver = new ChromeDriver();
		 }
		 else if(rb.getString("Browser").equalsIgnoreCase("Firefox"))
		 {
	 		 System.setProperty("webdriver.gecko.driver", "./DriverExecutable/geckodriver.exe");
	         driver = new FirefoxDriver();
	     }
		 else
		 {
			 System.setProperty("webdriver.chrome.driver", "./DriverExecutable/chromedriver.exe");
	         driver = new ChromeDriver();
		 }
		 
		 driver1 = new EventFiringWebDriver(driver);
		 ListenerImplementation listener = new ListenerImplementation();
		 driver1.register(listener);
		 
		 
		 driver1.navigate().to(rb.getString("Application_URL"));
		 driver1.navigate().back();
		 driver1.navigate().forward();
		 
		 driver.navigate().refresh();
		 driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.close();
	}
	
}
