package com.PHPTravels.Test.Pkg;
import com.PHPTravels.Demo.POM.loginPage;
import com.PHPTravels.Utils.Pkg.*;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class LoginPageTest 
{
	WebDriver driver;
  @BeforeTest
  public void beforeTest() throws IOException 
  {
	  System.setProperty("webdriver.gecko.driver", "E://Durgesh Automation Framework//Selenium Jars//geckodriver.exe");
	  driver=new FirefoxDriver();
	  InputStream inputstream;
	  inputstream = getClass().getClassLoader().getResourceAsStream("config.properties");
	  //FileReader reader=new FileReader("config.properties");
	  Properties pro=new Properties();
	  pro.load(inputstream);
	  driver.get(pro.getProperty("UserURL"));
	  
			
  }
  
  @Test
  public void LoginTest() 
  {
	  loginPage pg=new loginPage(driver);
	  pg.loginToPHPTravels("user@phptravels.com","demouser");
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
