package com.caci.hrms.testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.caci.hrms.base.BaseClass;
import com.caci.hrms.base.PageIntializer;
import com.caci.hrms.pages.LoginPage;
import com.caci.hrms.utils.CommonMethods;
import com.caci.hrms.utils.ConfigReader;
import com.caci.hrms.utils.Constants;

public class LoginTest extends PageIntializer {
	
		
	@Test()
	public void logoinPageTitle_TC001() {
	   CommonMethods.senddata(loginpage.UserName,ConfigReader.getProperty("UserName"));
	   CommonMethods.senddata(loginpage.Password, ConfigReader.getProperty("Password"));
	   CommonMethods.click(loginpage.LoginButton);
		String ActualValue=BaseClass.driver.getTitle();
		System.out.println(ActualValue);	
		String ExpectedValue= "OrangeHRM";
//		
//		if(ActualValue.equals(ExpectedValue) ) {
//		System.out.println("TC1 Pass");
//		
//		}
//		
//	else {
//		System.out.println("TC1 Failed");
//	}
	
//		
		//If the given condition got fails  it will not execute the next statement hard assert 
		//Assert.assertEquals(ExpectedValue, ActualValue,"if the values are not matching test get failed");
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ExpectedValue, ActualValue,"if the values are not matching test get failed");
		sa.assertAll();
	}
	
	@Test()
	public void InvalidUserID_TC002() {
	
		loginpage.UserName.sendKeys(ConfigReader.getProperty("InvalidUsername"));
		loginpage.Password.sendKeys(ConfigReader.getProperty("Password"));
		loginpage.LoginButton.click();
		String ActulErrorMsg = loginpage.InvalidMsg.getText();
		System.out.println(ActulErrorMsg);
		String ExpectedErrorMsg = "Invalid credentials";
		SoftAssert sa= new SoftAssert();
		sa.assertEquals(ActulErrorMsg, ExpectedErrorMsg, "if expected value does not match test cases fails");
		sa.assertAll();
	}
	
	@Test(priority=3)
	
	public void NoFieldValue_TC003() {
		
		loginpage.UserName.sendKeys(ConfigReader.getProperty("NoUserName"));
		loginpage.Password.sendKeys(ConfigReader.getProperty("NoPassword"));
		loginpage.LoginButton.click();
		String ActualMsg = loginpage.EmptyFieldMsg.getText();
		String ExpectedVal= "Username cannot be empty";
		System.out.println(ActualMsg);
		if (ActualMsg.contentEquals(ExpectedVal)) {
		System.out.println("TC003 pass the expect val is same as actual");
		}
		
		else {
			System.out.println("TC003 Fails the expect val is not same as actual");
		}
		
	}
	
	@Test(priority=4)
	public void InvalidPassword_TC004() {
		
		loginpage.UserName.sendKeys(ConfigReader.getProperty("UserName"));
		loginpage.Password.sendKeys("InvalidPassword");
		loginpage.LoginButton.click();
		String ActualVal = loginpage.InvalidMsg.getText();
		String ExpectedVal = "Invalid credentials";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActualVal, ExpectedVal, "TC004 Pass expect val is same as actual");
		sa.assertAll();
	}
	
	@Test(priority=5)
	public void ForgotPasswordLink_TC004() {
		loginpage.ForgotPass.click();
		
		
	}
	
	
	
	}


