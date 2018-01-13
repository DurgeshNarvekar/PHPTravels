package com.PHPTravels.Utils.Pkg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowersToOpen 
{
	WebDriver driver;
	public WebDriver openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.drive", "E:/Durgesh Automation Framework/Selenium Jars");
			driver=new FirefoxDriver();
			return driver;
		}
		return null;
		
	}
}
