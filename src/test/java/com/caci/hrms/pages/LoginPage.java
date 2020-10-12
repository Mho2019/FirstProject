package com.caci.hrms.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caci.hrms.base.BaseClass;
import com.caci.hrms.utils.CommonMethods;

public class LoginPage extends BaseClass{
   
//this is a page object model without page factory. 
//*****************************************************	
	//WebElement UserName=driver.findElement(By.id("txtUsername"));
	
	//WebElement Password=driver.findElement(By.id("txtPassword"));
	
	//WebElement LoginButton=driver.findElement(By.id("btnLogin"));
	
	//PageObject model with page factory. 
	
	@FindBy(id="txtUsername")
	public WebElement UserName;
	
	@FindBy(id="txtPassword")
	public WebElement Password;
	
	@FindBy(id="btnLogin")
	public WebElement LoginButton;
	
	@FindBy(id="spanMessage")
	public WebElement InvalidMsg;
	
	@FindBy(id="spanMessage")
	public WebElement EmptyFieldMsg;
	
	@FindBy(xpath = "//*[@id=\'forgotPasswordLink\']")
	public WebElement ForgotPass;
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public  void loginDetails(String username,String password) {
		CommonMethods.senddata(UserName, username);
		CommonMethods.senddata(Password, password);
		CommonMethods.click(LoginButton);
	}
}
