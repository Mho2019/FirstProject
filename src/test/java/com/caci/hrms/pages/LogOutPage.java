package com.caci.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.caci.hrms.base.BaseClass;

public class LogOutPage {

	
	
	@FindBy(xpath = "//a[@id='welcome']")
	public WebElement ClickOnLogoutIcon;
	
	@FindBy(xpath = "//a[@href='/index.php/auth/logout']")
	public WebElement ClickOnLoggingout;
		
	
	public LogOutPage(){
		PageFactory.initElements(BaseClass.driver, this);
	}
}
