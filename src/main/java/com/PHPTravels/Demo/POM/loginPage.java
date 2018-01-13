package com.PHPTravels.Demo.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	WebDriver driver;
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	@FindBy (how=How.NAME,using="username")
	public WebElement username;
	
	@FindBy (how=How.NAME,using="password")
	public WebElement password;
	
	@FindBy (how=How.XPATH,using = "/html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/button")
	public WebElement submitButton;
	
	public void loginToPHPTravels(String uid,String pass)
	{
		PageFactory.initElements(driver, loginPage.class);
		username.sendKeys(uid);
		password.sendKeys(pass);
		submitButton.click();
	}
	
}
